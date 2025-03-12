from flask import Flask, request, jsonify
from ec.espe.espe.hw40_uri_python.controller.project_controller import ProjectController
from ec.espe.espe.hw40_uri_python.model.project import Project

app = Flask(__name__)

@app.route("/infoproject", methods=["GET"])
def get_project():
    project_id = request.args.get("projectId")
    if not project_id:
        return jsonify({"error": "Se requiere el parámetro 'projectId'"}), 400
    
    project = ProjectController.get_project(project_id)
    if project is None:
        return jsonify({"error": "Proyecto no encontrado"}), 404

    project["_id"] = str(project["_id"])  # Convertir ObjectId a string para evitar problemas con JSON
    return jsonify(project)

@app.route("/addproject", methods=["POST"])
def add_project():
    data = request.form
    
    try:
        project = Project(
            data["projectId"], data["title"], data["description"], 
            data["startDate"], data["closingDate"], float(data["startQuote"]),
            data["operationalStatus"], data["quoteStatus"], 
            data.get("paid", "false").lower() == "true", 
            data.get("invoiced", "false").lower() == "true", 
            data.get("isPublic", "false").lower() == "true"
        )
    except KeyError:
        return jsonify({"error": "Faltan parámetros requeridos"}), 400
    
    success = ProjectController.add_project(project)
    return jsonify({"message": "Proyecto agregado exitosamente"} if success else {"error": "No se pudo agregar el proyecto"})

@app.route("/updatestateproject", methods=["PUT"])
def update_project_state():
    project_id = request.args.get("projectId")
    new_state = request.args.get("operationalStatus")
    
    if not project_id or not new_state:
        return jsonify({"error": "Se requieren los parámetros 'projectId' y 'operationalStatus'"}), 400
    
    success = ProjectController.update_project_status(project_id, new_state)
    return jsonify({"message": "Estado del proyecto actualizado"} if success else {"error": "No se pudo actualizar el estado"})

@app.route("/deleteproject", methods=["DELETE"])
def delete_project():
    project_id = request.args.get("projectId")
    
    if not project_id:
        return jsonify({"error": "Se requiere el parámetro 'projectId'"}), 400
    
    success = ProjectController.delete_project(project_id)
    return jsonify({"message": "Proyecto eliminado"} if success else {"error": "No se pudo eliminar el proyecto"})

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=6407, debug=True)
