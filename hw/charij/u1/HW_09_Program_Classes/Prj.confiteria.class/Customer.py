class customer: 
    def __init__(self , name, customer_id, direction, email, phone):
        self.name = name
        self.customer_id = customer_id
        self.direction = direction
        self.email = email
        self.phone = phone

  
customer1 = customer("Sebastian","1752651883","La biloxi","jairsebas@hotmail.com",2841439) 

print(type(customer1))
print(customer1.phone)
        