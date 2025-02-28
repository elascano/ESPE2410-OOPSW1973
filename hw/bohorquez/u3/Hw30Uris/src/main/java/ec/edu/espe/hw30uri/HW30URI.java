package ec.edu.espe.hw30uri;

import static spark.Spark.*;

/**
 *
 * @author Brandon Pazmiño
 */
public class HW30URI {

    public static void main(String[] args) {
        port(4567);

        get("/infoproject", (req, res) -> {
            String jsonResponse = "{"
                    + "\"Id del Proyecto\": \"P2rj-0001\","
                    + "\"Titulo\": \"Red 5G\","
                    + "\"Fecha de inicio\" : \"2020-05-20\","
                    + "\"Fecha de cierre\" : \"2025-01-31\","
                    + "\"Estatus del Proyecto\" : \"Pausado\","
                    + "\"Presupuesto\" : \"35489\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";
            res.type("application/json");
            return jsonResponse;
        });
        post("/createsupport", (req, res) -> {
            String supportDetail = req.queryParams("spptdetail");
            String supportStatus = req.queryParams("spptstatus");

            if (supportDetail == null || supportStatus == null) {
                res.status(400);
                return "{ \"error\": \"Faltan parámetros en la URL (course o instructor)\" }";
            }
            String response = "{"
                    + "\"Id del Soporte\": \"SRV_04(3A 2A*7)\","
                    + "\"Id del Proyecto\": \"Prj-0002\","
                    + "\"Fecha de inicio\" : \"2025-05-20\","
                    + "\"Fecha de cierre\" : \"2028-01-31\","
                    + "\"Duracion\" : \"3 años\","
                    + "\"course\": \"" + supportDetail + "\","
                    + "\"instructor\": \"" + supportStatus + "\""
                    + "}";

            res.type("application/json");
            return response;
        });

        put("/updatestateproject", (req, res) -> {
            String newState = req.queryParams("status");

            if (newState == null || newState.isEmpty()) {
                res.status(400);
                return "{ \"error\": \"El parámetro 'status' es requerido en la URL\" }";
            }

            String jsonResponse = "{"
                    + "\"Titulo del Proyecto\": \"Espe Park\","
                    + "\"Id del Proyecto\": \"Prj-0003\","
                    + "\"Status Viejo\": \"Creado\","
                    + "\"Estatus nuevo\": \"" + newState + "\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";
            res.type("application/json");
            return jsonResponse;
        });

        delete("/deletedata", (req, res) -> {
            String title = req.queryParams("title");

            String jsonResponse = "{"
                    + "\"Id del Proyecto\": \"P2rj-0001\","
                    + "\"Titulo\": \"" + title + "\","
                    + "\"Fecha de inicio\" : \"2020-05-20\","
                    + "\"Fecha de cierre\" : \"2025-01-31\","
                    + "\"Estatus del Proyecto\" : \"Pausado\","
                    + "\"Presupuesto\" : \"35489\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";
            res.type("application/json");
            return jsonResponse;
        });

        get("/infocustomer", (req, res) -> {
            String jsonResponse = "{"
                    + "\"Id del Cliente\": \"0007\","
                    + "\"RUC\": \"1754865923001\","
                    + "\"Nombre\" : \"Augusto Kiraclover\","
                    + "\"Celular\" : \"0999747261\","
                    + "\"Email\" : \"Pausado\","
                    + "\"Direccion\" : \"example@.com\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";
            res.type("application/json");
            return jsonResponse;
        });
        post("/credentials", (req, res) -> {
            String role = req.queryParams("role");
            String status = req.queryParams("status");

            if (role == null || status == null) {
                res.status(400);
                return "{ \"error\": \"Faltan parámetros en la URL (course o instructor)\" }";
            }
            String response = "{"
                    + "\"username\": \"powerranger\","
                    + "\"password\": \"rangerrojo\","
                    + "\"email\" : \"admin@example.com\","
                    + "\"fullname\" : \"Administrator User\","
                    + "\"role\" : \"" + role + "\","
                    + "\"status\": \"" + status + "\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";

            res.type("application/json");
            return response;
        });
        put("/updatequote", (req, res) -> {
            String newQuote = req.queryParams("quote");

            if (newQuote == null) {
                res.status(400);
                return "{ \"error\": \"Faltan parámetros en la URL (course o instructor)\" }";
            }
            String jsonResponse = "{"
                    + "\"Id del Proyecto\": \"P2rj-0002\","
                    + "\"Titulo\": \"Musarañas\","
                    + "\"Presupuesto de inicio\" : \"894.7\","
                    + "\"Presupuesto nuevo\" : \"" + newQuote + "\","
                    + "\"Estatus del Proyecto\" : \"Pausado\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";
            res.type("application/json");
            return jsonResponse;
        });

        delete("/deleteclientdata", (req, res) -> {
            String role = req.queryParams("role");
            String status = req.queryParams("status");

            if (role == null || status == null) {
                res.status(400);
                return "{ \"error\": \"Faltan parámetros en la URL (course o instructor)\" }";
            }
            String jsonResponse = "{"
                    + "\"username\": \"powerranger\","
                    + "\"password\": \"rangerrojo\","
                    + "\"email\" : \"admin@example.com\","
                    + "\"fullname\" : \"Administrator User\","
                    + "\"role\" : \"" + role + "\","
                    + "\"status\": \"" + status + "\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";

            return jsonResponse;
        });

        put("/updatequotestatus", (req, res) -> {
            String newQuoteState = req.queryParams("quote");

            if (newQuoteState == null) {
                res.status(400);
                return "{ \"error\": \"Faltan parámetros en la URL (course o instructor)\" }";
            }
            String jsonResponse = "{"
                    + "\"Id del Proyecto\": \"P2rj-0002\","
                    + "\"Titulo\": \"Musarañas\","
                    + "\"Estatus de Presupuesto Viejo\" : \"Facturado\","
                    + "\"EStatus de Presupuesto Nuevo\" : \"" + newQuoteState + "\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";
            res.type("application/json");
            return jsonResponse;
        });

        delete("/deletequote", (req, res) -> {
            String quote = req.queryParams("quote");

            String jsonResponse = "{"
                    + "\"Id del Proyecto\": \"P2rj-0001\","
                    + "\"Titulo\": \"Espe Tour\","
                    + "\"Fecha de inicio\" : \"2020-05-20\","
                    + "\"Fecha de cierre\" : \"2025-01-31\","
                    + "\"Estatus del Proyecto\" : \"Pausado\","
                    + "\"Presupuesto\" : \"" + quote + "\","
                    + "\"method\": \"" + req.requestMethod() + "\""
                    + "}";
            res.type("application/json");
            return jsonResponse;
        });

        exception(Exception.class, (e, req, res) -> {
            res.status(500);
            res.body("Error: " + e.getMessage());
        });

        System.out.println("Servidor web iniciado en http://localhost:4567");
        System.out.println("http://localhost:4567/infoproject");
        System.out.println("http://localhost:4567/createsupport?spptdetail=Mantenimiento&spptstatus=Nuevo");
        System.out.println("http://localhost:4567/updatestateproject?status=En%20progreso");
        System.out.println("http://localhost:4567/deletedata?id='nul' ");

        System.out.println("http://localhost:4567/infocustomer");
        System.out.println("http://localhost:4567/credentials?role=admin&status=Nuevo");
        System.out.println("http://localhost:4567/updatequote?quote=10000");
        System.out.println("http://localhost:4567/deleteclientdata?role=&status=");

        System.out.println("http://localhost:4567/updatequotestatus?quote=Envuelto");
        System.out.println("http://localhost:4567/deletequote?quote=");
    }

}
