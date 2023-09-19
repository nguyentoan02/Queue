/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSII
 */
import java.util.Scanner;

public class PrintQueueSimulation {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Print Job");
            System.out.println("2. Print Job");
            System.out.println("3. Print All Jobs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter job name: ");
                    String jobName = scanner.nextLine();
                    PrintJob newJob = new PrintJob(jobName);
                    queue.enqueue(newJob);
                    System.out.println("Added job: " + jobName);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        PrintJob printedJob = queue.dequeue();
                        System.out.println("Printing: " + printedJob.getName());
                    } else {
                        System.out.println("No print jobs in the queue.");
                    }
                    break;
                case 3:
                    System.out.println("Printing all jobs:");
                    while (!queue.isEmpty()) {
                        PrintJob printedJob = queue.dequeue();
                        System.out.println("Printing: " + printedJob.getName());
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}

