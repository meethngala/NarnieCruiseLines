/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narnia.cruise.lines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import static narnia.cruise.lines.Cruise.getRandomNumber;

/**
 *
 * @author Meeth
 */
public class NarniaCruiseLines {

    /**
     * class for Cruise company
     */
    public static ReadFiles r1 = new ReadFiles();

    /**
     * reference of file reader object
     */
    public static ReadFiles r2 = new ReadFiles();

    /**
     * reference of file reader object
     */
    public static ReadFiles r3 = new ReadFiles();

    /**
     * reference of file reader object
     */
    public static ReadFiles r4 = new ReadFiles();

    /**
     * reference of file reader object
     */
    public static Random rand = new Random();
    static ArrayList<Passengers> passengers = new ArrayList<>();

    /**
     * list of passengers
     */
    public static Ship s1 = new Ship();

    /**
     * main method
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        r1.readFile("ShipsData.txt");
        r2.readFile("SailorsData.txt");
        r3.readFile("PortsData.txt");
        r4.readFile("PassengersData.txt");
        boolean point = true;
        WriteFiles writer= new WriteFiles();
        writer.writeFile("data.txt","this narnia cruise company" );
        System.out.println("Enter the report to be generated");
        System.out.println("Press 1 to generate the cruise");
        System.out.println("Press 2 to Add passengers to a cruise. Both manual and random options must be given");
        System.out.println("Press 3 to generate  Revenue from the cruise passengers by nationality and age ");
        System.out.println("Press 4 to generate the Details of all Sailors ");
        System.out.println("Press 5 to generate List of passengers with their details sorted by moneySpentOnCruise ");
        System.out.println("Press 6 to generate the Cruise evaluation by passengers ");
        while (point != false) {
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Here is a cruise for Singapore");
                    Cruise c = new Cruise();
                    System.out.println("The sail date is 10/09/2016");
                    System.out.println("the return date is 11/11/2016");
                    break;
                case 2:
                    System.out.println("Enter the passengers: press 1 to manually enter or 2 for random");
                    int choice = sc.nextInt();
                    boolean flag = true;
                    while (flag != false) {
                        switch (choice) {
                            case 1:
                                System.out.println("Enter number of passengers to be added");
                                int num = sc.nextInt();
                                Passengers[] pm = new Passengers[num];
                                for (int i = 0; i < pm.length; i++) {

                                    System.out.println("Enter data as name , address, nationality, dob and money spent");
                                    pm[i] = new Passengers(i);
                                    pm[i].setNumber((i * 2) + 201);

                                    pm[i].setName(sc.next());
                                    pm[i].setAddress(sc.next());
                                    pm[i].setNationality(sc.next());
                                    pm[i].setDateOfBirth(sc.next());
                                    pm[i].setMoneySpent(sc.nextInt());
                                    passengers.add(pm[i]);

                                }

                                break;
                            case 2:
                                Passengers[] pr = new Passengers[5];
                                for (int i = 0; i < pr.length; i++) {
                                    pr[i] = new Passengers();
                                    passengers.add(pr[i]);
                                }

                                break;
                            case 0:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        System.out.println("Press 1 to continue for manual or 0 to terminate");
                        System.out.println("Press 2 to continue for random or 0 to terminate");
                        choice = sc.nextInt();
                        if (choice == 1 || choice == 2) {

                            continue;
                        } else {
                            flag = false;
                        }
                    }
                    System.out.println("The passenger info is");
                   
                    for (int a = 0; a < passengers.size(); a++) {
                        for( int j=1; j< (passengers.size()-a); j++){
                         if(passengers.get(j-1).getMoneySpent()> passengers.get(j).getMoneySpent());
                         {
                         Passengers temp= new Passengers();
                         passengers.set(j-1, passengers.get(j));
                         passengers.set(j,temp);
                   
                         }}
                        System.out.println("\t" + passengers.get(a).getName());
                        System.out.print("\t" + passengers.get(a).getAddress());
                        System.out.print("\t" + passengers.get(a).getNationality());
                        System.out.print("\t" + passengers.get(a).getDateOfBirth());
                        System.out.println("\t" + passengers.get(a).getMoneySpent());

                    }
                    break;
                case 3:
                    System.out.println("****************************************************************************");
                    System.out.println("the revenue generated is");
                    revenue();
                    break;
                case 4:
                    System.out.println("*****************************************************************************");
                    System.out.println("the sailors info is");
                    s1.printSailors();
                    break;
                case 5:
                    System.out.println("*****************************************************************************");
                    System.out.println("the passenger evaluation generated is");
                    passEvaluation();
                    break;
                case 6:
                    System.out.println("******************************************************************************");
                    System.out.println("the profit is");
                    shipProfit();
                    break;
                    

            }
            System.out.println("Do you wish to continue: press 1 for yes and 2 for no");
            int g = sc.nextInt();
            if (g == 1) {
                point = true;
            } else {
                point = false;
            }

        }
        
    }

    /**
     * gives the passenger evaluation report
     */
    public static void passEvaluation() {
        for (int j = 0; j < passengers.size(); j++) {
            System.out.println("here is the cruise evaluation");
            System.out.println("pass no:" + passengers.get(j).getNumber());
            System.out.println("pass name " + passengers.get(j).getName());
            int i = getRandomNumber(1, 3);
            if (i == 1) {
                System.out.println("food service is good");
            } else if (i == 2) {
                System.out.println("food service is average");
            } else {
                System.out.println("food service is poor");
            }
            i = getRandomNumber(1, 3);
            if (i == 1) {
                System.out.println("room service is good");
            } else if (i == 2) {
                System.out.println("room service is average");
            } else {
                System.out.println("room service is poor");
            }
            i = getRandomNumber(1, 3);
            if (i == 1) {
                System.out.println(" management is good");
            } else if (i == 2) {
                System.out.println("management is average");
            } else {
                System.out.println("management is poor");
            }

            i = getRandomNumber(1, 3);
            if (i == 1) {
                System.out.println(" safety precaution is good");
            } else if (i == 2) {
                System.out.println("safety precaution is average");
            } else {
                System.out.println("safety precaution is poor");
            }

            i = getRandomNumber(1, 3);
            if (i == 1) {
                System.out.println(" overall experience is good");
            } else if (i == 2) {
                System.out.println("overall experience is average");
            } else {
                System.out.println("overall experience is poor");
            }

        }

    }

    /**
     * gives the revenue generated from the cruise
     */
    public static void revenue() {
        int profit = 0, earnings = 0;
        System.out.println("Revenue\t Nationality\t age");
        for (int i = 0; i < passengers.size(); i++) {
            int age = 2016 - (Integer.parseInt(passengers.get(i).getDateOfBirth().substring(passengers.get(i).getDateOfBirth().length() - 4, passengers.get(i).getDateOfBirth().length())));
            profit = profit + passengers.get(i).getMoneySpent();
            earnings = profit + 900;

            System.out.println(earnings + "\t" + passengers.get(i).getNationality() + "\t        " + age);

        }
    }

    /**
     * gives the ship profit
     *
     * @return profit
     */
    public static double shipProfit() {
        Sailors sa1 = new Sailors();
        int profit = 0, earnings = 0;
        for (int i = 0; i < passengers.size(); i++) {
            profit = profit + passengers.get(i).getMoneySpent();
            earnings = profit + 900;
        }
        System.out.println("the earning is" + earnings);

        System.out.println("the expense is " + s1.calculateCost());
        System.out.println("the profit is" + (earnings - s1.calculateCost()));
        return 0.0;
    }
}
