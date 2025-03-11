function generateHTML(investments) {
    let html = `<h1>Investment Report</h1>
                <table border="1">
                    <tr><th>ID</th><th>Amount</th><th>Time (years)</th><th>Earnings</th><th>Total</th></tr>`;

    investments.forEach(inv => {
        html += `<tr>
                    <td>${inv.id}</td>
                    <td>${inv.monto}</td>
                    <td>${inv.tiempo}</td>
                    <td>${inv.earnings}</td>
                    <td>${inv.total}</td>
                 </tr>`;
    });

    html += `</table>`;
    return html;
}

module.exports = generateHTML;
