package hw_12_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dennis Paucar
 */


class Report {
    private int idReport;
    private String date;
    private String projectName;
    private String status;
    private double costs;
    private double expenses;
    private double profits;
    private double subtotal;
    private double tax; 
    private double total;

    
    public Report(int idReport, String date, String projectName, String status, double costs, double expenses, double profits, double taxRate) {
        this.idReport = idReport;
        this.date = date;
        this.projectName = projectName;
        this.status = status;
        this.costs = costs;
        this.expenses = expenses;
        this.profits = profits;
        this.subtotal = costs + expenses;
        this.tax = this.subtotal * taxRate; // Cálculo del IVA
        this.total = this.subtotal + this.tax + this.profits;
    }
}

public class SaveSingleJSON {
    public static void main(String[] args) {
      
        Report report = new Report(1, "2024-11-24", "Project 1", "Completed", 5000, 1500, 2000, 0.16);


        Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
        String json = gson.toJson(report);

   
        try (FileWriter fileWriter = new FileWriter("single_report.json")) {
            fileWriter.write(json);
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




