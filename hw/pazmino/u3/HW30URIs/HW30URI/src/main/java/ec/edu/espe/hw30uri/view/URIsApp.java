package ec.edu.espe.hw30uri.view;

import ec.edu.espe.hw30uri.controller.ProjectController;
import ec.edu.espe.hw30uri.model.Project;
import org.bson.Document;
import static spark.Spark.*;

/**
 *
 * @author Brandon Pazmiño
 */
public class URIsApp {

    public static void main(String[] args) {
        port(6407);

        get("/infoproject", (req, res) -> {
            String projectId = req.queryParams("projectId");
            if (projectId == null) {
                res.status(400);
                return "{ \"error\": \"Se requiere el parámetro 'projectId'\" }";
            }

            Document project = ProjectController.getProject(projectId);
            if (project == null) {
                res.status(404);
                return "{ \"error\": \"Proyecto no encontrado\" }";
            }

            res.type("application/json");
            return project.toJson();
        });

        post("/addproject", (req, res) -> {
            String projectId = req.queryParams("projectId");
            String title = req.queryParams("title");
            String description = req.queryParams("description");
            String startDate = req.queryParams("startDate");
            String closingDate = req.queryParams("closingDate");
            double startQuote = Double.parseDouble(req.queryParams("startQuote"));
            String operationalStatus = req.queryParams("operationalStatus");
            String quoteStatus = req.queryParams("quoteStatus");
            boolean paid = Boolean.parseBoolean(req.queryParams("paid"));
            boolean invoiced = Boolean.parseBoolean(req.queryParams("invoiced"));
            boolean isPublic = Boolean.parseBoolean(req.queryParams("isPublic"));

            Project project = new Project(projectId, title, description, startDate, closingDate, startQuote,
                    operationalStatus, quoteStatus, paid, invoiced, isPublic);

            boolean success = ProjectController.addProject(project);
            res.type("application/json");
            return success ? "{ \"message\": \"Proyecto agregado exitosamente\" }" : "{ \"error\": \"No se pudo agregar el proyecto\" }";
        });

        put("/updatestateproject", (req, res) -> {
            String projectId = req.queryParams("projectId");
            String newState = req.queryParams("operationalStatus");

            if (projectId == null || newState == null) {
                res.status(400);
                return "{ \"error\": \"Se requieren los parámetros 'projectId' y 'status'\" }";
            }

            boolean success = ProjectController.updateProjectStatus(projectId, newState);
            res.type("application/json");
            return success ? "{ \"message\": \"Estado del proyecto actualizado\" }" : "{ \"error\": \"No se pudo actualizar el estado\" }";
        });

        delete("/deleteproject", (req, res) -> {
            String projectId = req.queryParams("projectId");

            if (projectId == null) {
                res.status(400);
                return "{ \"error\": \"Se requiere el parámetro 'projectId'\" }";
            }

            boolean success = ProjectController.deleteProject(projectId);
            res.type("application/json");
            return success ? "{ \"message\": \"Proyecto eliminado\" }" : "{ \"error\": \"No se pudo eliminar el proyecto\" }";
        });

        System.out.println("Servidor web en http://localhost:6407");
        System.out.println("http://localhost:6407/infoproject?projectId=Prj-0001");
        System.out.println("http://localhost:6407/addproject?projectId=Prj-0020&title=Nuevo%20Proyecto&description=Test...");
        System.out.println("http://localhost:6407/updatestateproject?projectId=Prj-0001&status=En%20progreso");
        System.out.println("http://localhost:6407/deleteproject?projectId=Prj-0001");
    }
}
