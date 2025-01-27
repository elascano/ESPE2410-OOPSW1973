package ec.edu.espe.mole.view;

import ec.edu.espe.mole.model.ProjectsReport;
import java.util.Scanner;

public class ReportsMenu {

    public static void generateReportFromJSON(Scanner scanner) {
       
        String jsonFilePath = "data/project.json";

        
        ProjectsReport report = new ProjectsReport();
     
        report.generateReportFromJSON(jsonFilePath);
    }
}
