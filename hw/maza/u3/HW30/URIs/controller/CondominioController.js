const { leerDatos, escribirDatos } = require('../utils/JsonHelper');

// Crear una factura
const crearFactura = (req, res) => {
    const { id, monto, fecha, condominioId } = req.body;
    const data = leerDatos();  // Usar el helper para leer los datos del archivo

    // Validar que todos los campos estén presentes
    if (!id || !monto || !fecha || !condominioId) {
        return res.status(400).json({ error: 'Todos los campos son requeridos' });
    }

    // Crear la factura y agregarla al array de facturas
    const nuevaFactura = { id, monto, fecha, condominioId };
    data.facturas.push(nuevaFactura);

    // Guardar los cambios en el archivo JSON
    escribirDatos(data);

    res.status(201).json(nuevaFactura);
};

// Obtener una factura por ID
const obtenerFactura = (req, res) => {
    const { id } = req.params;
    const data = leerDatos();
    const factura = data.facturas.find(f => f.id === id);

    if (!factura) {
        return res.status(404).json({ error: 'Factura no encontrada' });
    }

    res.json(factura);
};

// Listar facturas por ID de condominio
const listarFacturasPorCondominio = (req, res) => {
    const { id } = req.params;
    const data = leerDatos();
    const facturas = data.facturas.filter(f => f.condominioId === id);

    res.json(facturas);
};

// Registrar un pago
const registrarPago = (req, res) => {
    const { id, monto, fecha } = req.body;
    const data = leerDatos();

    if (!id || !monto || !fecha) {
        return res.status(400).json({ error: 'Todos los campos son requeridos' });
    }

    const nuevoPago = { id, monto, fecha };
    data.pagos.push(nuevoPago);

    escribirDatos(data);
    res.status(201).json(nuevoPago);
};

// Obtener un pago por ID
const obtenerPago = (req, res) => {
    const { id } = req.params;
    const data = leerDatos();
    const pago = data.pagos.find(p => p.id === id);

    if (!pago) {
        return res.status(404).json({ error: 'Pago no encontrado' });
    }

    res.json(pago);
};

// Agregar un residente
const agregarResidente = (req, res) => {
    const { id, nombre, condominioId } = req.body;
    const data = leerDatos();

    if (!id || !nombre || !condominioId) {
        return res.status(400).json({ error: 'Todos los campos son requeridos' });
    }

    const nuevoResidente = { id, nombre, condominioId };
    data.residentes.push(nuevoResidente);

    escribirDatos(data);
    res.status(201).json(nuevoResidente);
};

// Obtener un residente por ID
const obtenerResidente = (req, res) => {
    const { id } = req.params;
    const data = leerDatos();
    const residente = data.residentes.find(r => r.id === id);

    if (!residente) {
        return res.status(404).json({ error: 'Residente no encontrado' });
    }

    res.json(residente);
};

// Listar residentes de un condominio
const listarResidentes = (req, res) => {
    const { id } = req.params;
    const data = leerDatos();
    const residentes = data.residentes.filter(r => r.condominioId === id);

    res.json(residentes);
};

// Crear un aviso
const crearAviso = (req, res) => {
    const { id, mensaje, condominioId } = req.body;
    const data = leerDatos();

    if (!id || !mensaje || !condominioId) {
        return res.status(400).json({ error: 'Todos los campos son requeridos' });
    }

    const nuevoAviso = { id, mensaje, condominioId };
    data.avisos.push(nuevoAviso);

    escribirDatos(data);
    res.status(201).json(nuevoAviso);
};

// Listar avisos de un condominio
const listarAvisos = (req, res) => {
    const { id } = req.params;
    const data = leerDatos();
    const avisos = data.avisos.filter(a => a.condominioId === id);

    res.json(avisos);
};

module.exports = {
    crearFactura,
    obtenerFactura,
    listarFacturasPorCondominio,
    registrarPago,
    obtenerPago,
    agregarResidente,
    obtenerResidente,
    listarResidentes,
    crearAviso,
    listarAvisos
};
