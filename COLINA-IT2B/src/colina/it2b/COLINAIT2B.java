package colina.it2b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;


public class COLINAIT2B {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Applications: ");
        int numApplications = scanner.nextInt();
        List<Application> loanapp2 = new ArrayList<>();

        for (int i = 1; i <= numApplications; i++) {
            System.out.println("Enter details of application " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Monthly Income: ");
            double mon = scanner.nextDouble();
            System.out.print("Credit Score: ");
            double credit = scanner.nextDouble();
            System.out.print("Existing Loans ");
            int exloans = scanner.nextInt();
            Application loanapp = new Application(id, name, mon, credit, exloans) {};
            loanapp2.add(loanapp);
        }
        

        System.out.println("\nID\tName\tmonthly\tcredit\texistingloans\tLoan Status");
        for (Application loanapp : loanapp2) {
            System.out.println(loanapp.toString());
        }
    }
}