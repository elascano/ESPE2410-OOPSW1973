# tenant.py
class Tenant:
    def __init__(self, tenant_id, tenant_name, house_number, phone, payment_status):
        self.tenant_id = tenant_id
        self.tenant_name = tenant_name
        self.house_number = house_number
        self.phone = phone
        self.payment_status = payment_status
    
    def __str__(self):
        return f"Tenant(tenant_id={self.tenant_id}, tenant_name={self.tenant_name}, house_number={self.house_number}, phone={self.phone}, payment_status={self.payment_status})"
