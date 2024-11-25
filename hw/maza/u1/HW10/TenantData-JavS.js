// Crear un array de objetos para los inquilinos
const tenants = [
    {
        name: "Juan",
        lastName: "Pérez",
        phone: "1234567890",
        houseNumber: 101,
        paymentStatus: "Pagado",
        entryDate: "2024-01-15"
    },
    {
        name: "María",
        lastName: "Gómez",
        phone: "0987654321",
        houseNumber: 102,
        paymentStatus: "No Pagado",
        entryDate: "2023-12-20"
    },
    {
        name: "Carlos",
        lastName: "López",
        phone: "5678901234",
        houseNumber: 103,
        paymentStatus: "Pagado",
        entryDate: "2024-02-01"
    }
];

// Crear un objeto final con los inquilinos
const tenantData = {
    tenants: tenants
};

// Imprimir los datos en formato JSON
console.log(JSON.stringify(tenantData, null, 4)); // Indentación de 4 espacios
