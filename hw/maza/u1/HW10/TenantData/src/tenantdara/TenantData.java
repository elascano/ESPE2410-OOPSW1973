package tenantdara;

/**
 *
 * @author Alexander Maza
 */
import org.json.JSONArray;
import org.json.JSONObject;

public class TenantData {
    public static void main(String[] args) {
       
        
        JSONArray tenants = new JSONArray();

     
        JSONObject tenant1 = new JSONObject();
        tenant1.put("name", "Juan");
        tenant1.put("lastName", "Perez");
        tenant1.put("phone", "1234567890");
        tenant1.put("houseNumber", 01);
        tenant1.put("paymentStatus", "Pagado");
        tenant1.put("entryDate", "2024-01-15");

        JSONObject tenant2 = new JSONObject();
        tenant2.put("name", "Maria");
        tenant2.put("lastName", "Gomez");
        tenant2.put("phone", "0987654321");
        tenant2.put("houseNumber", 02);
        tenant2.put("paymentStatus", "No Pagado");
        tenant2.put("entryDate", "2023-12-20");

        JSONObject tenant3 = new JSONObject();
        tenant3.put("name", "Carlos");
        tenant3.put("lastName", "Lopez");
        tenant3.put("phone", "5678901234");
        tenant3.put("houseNumber", 03);
        tenant3.put("paymentStatus", "Pagado");
        tenant3.put("entryDate", "2024-02-01");

        tenants.put(tenant1);
        tenants.put(tenant2);
        tenants.put(tenant3);

        JSONObject tenantData = new JSONObject();
        tenantData.put("tenants", tenants);

        System.out.println(tenantData.toString(4)); // Indentación de 4 espacios
    }
}
