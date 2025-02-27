const express = require('express');
const router = express.Router();
const CondominioController = require('../controller/CondominioController');

// Rutas para facturas
router.post('/facturas', CondominioController.crearFactura);
router.get('/facturas/:id', CondominioController.obtenerFactura);
router.get('/facturas/condominio/:id', CondominioController.listarFacturasPorCondominio);

// Rutas para pagos
router.post('/pagos', CondominioController.registrarPago);
router.get('/pagos/:id', CondominioController.obtenerPago);

// Rutas para residentes
router.post('/residentes', CondominioController.agregarResidente);
router.get('/residentes/:id', CondominioController.obtenerResidente);
router.get('/condominios/:id/residentes', CondominioController.listarResidentes);

// Rutas para avisos
router.post('/avisos', CondominioController.crearAviso);
router.get('/avisos/condominio/:id', CondominioController.listarAvisos);

module.exports = router;
