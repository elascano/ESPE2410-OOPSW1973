# co_owner.py
class CoOwner:
    def __init__(self, id, name, address, email):
        self.id = id
        self.name = name
        self.address = address
        self.email = email
    
    def __str__(self):
        return f"CoOwner(id={self.id}, name={self.name}, address={self.address}, email={self.email})"
