class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    
    def calcular_precio_con_iva(self):
        return self.precio * 1.15
