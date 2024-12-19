class Notebook {
    constructor(marca, modelo, ram, almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    toString() {
        return `Notebook{marca='${this.marca}', modelo='${this.modelo}', ram=${this.ram}, almacenamiento=${this.almacenamiento}}`;
    }
}

module.exports = Notebook; // Asegúrate de exportar la clase
