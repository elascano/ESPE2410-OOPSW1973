class Invoice:
    def __init__(self, invoice_number, customer_name, amount, due_date, is_paid):
        self.invoice_number = invoice_number
        self.customer_name = customer_name
        self.amount = amount
        self.due_date = due_date
        self.is_paid = is_paid
