class Gallina {
    constructor(id, nombre, color, fechaNacimiento, estaPoniendoHuevos) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.fechaNacimiento = new Date(fechaNacimiento); // Fecha en formato 'YYYY-MM-DD'
        this.edadEnMeses = this.calcularEdadEnMeses();
        this.estaPoniendoHuevos = estaPoniendoHuevos;
    }

    calcularEdadEnMeses() {
        const fechaActual = new Date();
        const diferenciaEnMeses = 
            (fechaActual.getFullYear() - this.fechaNacimiento.getFullYear()) * 12 +
            (fechaActual.getMonth() - this.fechaNacimiento.getMonth());
        return diferenciaEnMeses < 0 ? 0 : diferenciaEnMeses;
    }

    imprimirInformacion() {
        console.log(`Gallina ID: ${this.id}`);
        console.log(`Nombre: ${this.nombre}`);
        console.log(`Color: ${this.color}`);
        console.log(`Fecha de Nacimiento: ${this.fechaNacimiento.toDateString()}`);
        console.log(`Edad en meses: ${this.edadEnMeses}`);
        console.log(`Está poniendo huevos: ${this.estaPoniendoHuevos ? "Sí" : "No"}`);
    }
}

const gallina1 = new Gallina(1, "Clara", "Blanco", "2022-06-15", true);

gallina1.imprimirInformacion();
