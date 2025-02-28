package ec.edu.espe.mole.view;

import ec.edu.espe.mole.controller.ProjectController;
import ec.edu.espe.mole.model.ProjectsReport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Marlon Pasquel
 */

public class ReportsMenu {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static void generateAndExportReports(ProjectController projectController, Scanner scanner) {
        System.out.println("\n--- Generate and export reports ---");

        System.out.print("Enter start date (YYYY-MM-DD):");
        String startDateStr = scanner.nextLine().trim();
        Date startDate = parseDate(startDateStr);
        if (startDate == null) {
            System.out.println("Error: Invalid date format.");
            return;
        }

        System.out.print("Enter end date (YYYY-MM-DD):");
        String endDateStr = scanner.nextLine().trim();
        Date endDate = parseDate(endDateStr);
        if (endDate == null) {
            System.out.println("Error: Invalid date format.");
            return;
        }

        ProjectsReport report = new ProjectsReport(projectController.filterProjectsByDate(startDate, endDate), startDate, endDate);
        System.out.println("Report generated in JSON format");
        System.out.print("Enter the file name:");
        String filename = scanner.nextLine().trim();

    }

    private static Date parseDate(String dateStr) {
        try {
            return DATE_FORMAT.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }
}