
# Clase Comment
class Comment:
    def __init__(self, idComment=None, rating=None, text=None, date=None):
        self.idComment = idComment
        self.rating = rating
        self.text = text
        self.date = date

# Clase Order
class Order:
    def __init__(self, idOrder=None, idTable=None, total=None, paymentMethod=None, comment=None):
        self.idOrder = idOrder
        self.idTable = idTable
        self.total = total
        self.paymentMethod = paymentMethod
        self.comment = comment  # Relación con la clase Comment

# Clase Restaurant
class Restaurant:
    def __init__(self, name=None, menu=None):
        self.name = name
        self.menu = menu

# Clase VirtualOrdering (el punto de entrada del programa)
class VirtualOrdering:
    @staticmethod
    def main():
        # Crear instancias de las clases
        restaurant1 = Restaurant()
        order1 = Order()
        comment1 = Comment()
        client1 = Client()

        # Opcional: mostrar los objetos creados para verificar
        print(restaurant1.__dict__)
        print(order1.__dict__)
        print(comment1.__dict__)
        print(client1.__dict__)

# Ejecutar el método main
if __name__ == "__main__":
    VirtualOrdering.main()