

package ec.edu.espe.calculator.model;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class NewClass {

}
try {
            String invoiceText = txtInvoice.getText();
            if (invoiceText == null || invoiceText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No invoice to save. Please generate an invoice first.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String selectedCustomer = (String) cmbCustomer.getSelectedItem();
            String[] customerParts = selectedCustomer.split(" - ");
            int customerId = Integer.parseInt(customerParts[0]);

            Document customerDoc = MongoDbManager.getDocumentByField("Customer", "id", customerId);
            Customer customer = new Customer(
                    customerDoc.getString("name"),
                    customerDoc.getInteger("id"),
                    customerDoc.get("phoneNumber").toString()
            );

            String selectedOrderId = (String) cmbOrderId.getSelectedItem();
            Document orderDoc = MongoDbManager.getDocumentByField("Order", "orderId", selectedOrderId);

            ArrayList<Dish> dishes = new ArrayList<>();
            List<Document> dishDocs = (List<Document>) orderDoc.get("dishes");
            for (Document dishDoc : dishDocs) {
                String dishName = dishDoc.getString("name");
                float dishPrice = dishDoc.getDouble("price").floatValue();
                dishes.add(new Dish(dishName, dishPrice));
            }

            String orderId = orderDoc.getString("orderId");
            Calendar orderDate = Calendar.getInstance();
            orderDate.setTimeInMillis(orderDoc.getLong("date"));

            Order order = new Order(dishes.size(), orderId, dishes, orderDate);

            Invoice invoice = new Invoice(customer, order);

            Document invoiceDoc = invoice.toDocument();

            MongoDbManager.insertDocument("Invoice", invoiceDoc);

            JOptionPane.showMessageDialog(this, "Invoice saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saving invoice: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }