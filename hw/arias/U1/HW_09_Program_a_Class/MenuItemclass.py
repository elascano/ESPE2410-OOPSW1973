#class from OrderingProgramSimulator

class MenuItem:
    def __init__(self, category, name, description, price, isAvailable):
        self.category = category
        self.name = name
        self.description = description
        self.price = price
        self.isAvailable = isAvailable

    def __repr__(self):
        availability = "Disponible" if self.isAvailable else "No Disponible"
        return (f"Categoría: {self.category}\nNombre: {self.name}\n"
                f"Descripción: {self.description}\nPrecio: ${self.price}\n"
                f"Disponibilidad: {availability}")

dish = MenuItem("Bebidas", "Gaseosa Fanta 1.35 L", "Bebida carbonatada sabor a naranja", 1.25, True)
print(dish)