async function fetchProducts() {
    try {
        const response = await fetch("http://localhost:3014/api/products");

        const products = await response.json();
        const tableBody = document.getElementById("product-table");

        tableBody.innerHTML = ""; 
        products.forEach(product => {
            const row = `<tr>
                <td>${product.nombre}</td>
                <td>${product.codigo}</td>
                <td>${product.cantidad}</td>
                <td>${product.precio}</td>
            </tr>`;
            tableBody.innerHTML += row;
        });
    } catch (error) {
        console.error("Error al obtener los productos:", error);
    }
}


fetchProducts();
