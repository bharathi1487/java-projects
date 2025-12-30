import java.util.Scanner;
class  Studentmarkmanagementsystem 
{
    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Student Mark Management System");
            System.out.println("Enter number of students:");
            int Students=sc.nextInt();
            String names[]=new String[Students];
            int marks[]=new int[Students];
            int choice;
            boolean input = false;
            do {
                System.out.println("---------MENU---------");
                System.out.println("1. Enter Student Details");
                System.out.println("2. Display Student Details");
                System.out.println("3. Calculate Average Marks");
                System.out.println("4. Find Highest  Marks");
                System.out.println("5. Find Lowest Marks");
                System.out.println("6. Exit");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                
                switch (choice) {
                    
                    case 1 -> {
                        System.out.println("Enter names of the Student:");
                        for (int i = 0; i < names.length; i++) {
                            names[i] = sc.next();
                        }
                        System.out.println("Enter marks of the Student:");
                        for (int i = 0; i < marks.length; i++) {
                            marks[i] = sc.nextInt();
                        }
                        System.out.println("Student details saved successfully. You can now choose other menu options.");
                        input = true;
                        break;
                    }
                    case 2 -> {
                        if (!input) {
                            System.out.println("Please enter student details first.");
                            break;
                        }
                        System.out.println("Students details:");
                        for (int i = 0; i < names.length; i++) {
                            System.out.println("Name: " + names[i] + " Marks: " + marks[i]);
                        }
                    }
                    case 3 -> {
                        if (!input) {
                            System.out.println("Please enter student details first.");
                            break;
                        }
                        int total = 0;
                        for (int i = 0; i < marks.length; i++) {
                            total = total + marks[i];
                        }
                        double average = (double) total / Students;
                        System.out.println("Average Marks:" + average);
                    }
                    case 4 -> {
                        if (!input) {
                            System.out.println("Please enter student details first.");
                            break;
                        }
                        int max = marks[0];
                        for (int i = 1; i < marks.length; i++) {
                            if (marks[i] > max) {
                                max = marks[i];
                            }
                        }
                        for (int i = 0; i < marks.length; i++) {
                            if (marks[i] == max) {
                                System.out.println("Highest Marks:" + max + " Name:" + names[i]);
                            }
                        }
                    }
                    case 5 -> {
                        if (!input) {
                            System.out.println("Please enter student details first.");
                            break;
                        }
                        int min = marks[0];
                        for (int i = 1; i < marks.length; i++) {
                            if (marks[i] < min) {
                                min = marks[i];
                            }
                        }
                        for (int i = 0; i < marks.length; i++) {
                            if (marks[i] == min) {
                                System.out.println("Lowest Marks:" + min + " Name:" + names[i]);
                            }
                        }
                    }
                    case 6 -> System.out.println("Exit");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 6);
        }
    }
   
}