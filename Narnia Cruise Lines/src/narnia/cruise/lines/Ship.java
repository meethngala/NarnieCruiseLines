/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narnia.cruise.lines;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Meeth
 */
public class Ship {

    private String name;
    private int number;
    private double weight;
    private double capacity;
    private String year;
    private boolean assigned = false;

    /**
     * list of sailors
     */
    public static ArrayList<Sailors> sailors = new ArrayList<>();
    Captain c;
    Engineers[] e;
    Doctors[] d;
    Cooks[] cs;
    Sailors[] sa;

    /**
     *
     * @param name
     * @param capacity
     */
    public Ship(String name, double capacity) {
        int j = 0;
        if (assigned != true) {

            int i = getRandomNumber(1, 50);
            this.setNumber(i);
            this.setWeight(Double.valueOf(NarniaCruiseLines.r1.getColumns().get(i)[j++]));
            this.setYear(NarniaCruiseLines.r1.getColumns().get(i)[j++]);
            this.setCapacity(Double.valueOf(NarniaCruiseLines.r1.getColumns().get(i)[j]));
            this.assigned = true;
        }
        c = new Captain();
        e = new Engineers[]{
            new Engineers(), new Engineers(), new Engineers()
        };

        d = new Doctors[]{
            new Doctors(), new Doctors()
        };

        cs = new Cooks[]{
            new Cooks(), new Cooks(), new Cooks(), new Cooks(), new Cooks()
        };

        sa = new Sailors[]{
            new Sailors(), new Sailors(), new Sailors(), new Sailors()
        };

        sailors.add(c);
        for (int i = 0; i < 3; i++) {
            sailors.add(e[i]);
        }
        for (int i = 0; i < 2; i++) {
            sailors.add(d[i]);
        }
        for (int i = 0; i < 5; i++) {
            sailors.add(cs[i]);
        }
        for (int i = 0; i < 4; i++) {
            sailors.add(sa[i]);
        }

    }

    /**
     * default constuctor
     */
    public Ship() {

    }

    /**
     * get year
     *
     * @return
     */
    public String getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     *
     * @param capacity
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    private static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     *
     */
    public void printSailors() {
        double totalSalary = 0, totaldockFee = 0;
        Port p = new Port();
        for (int i = 0; i < sailors.size(); i++) {
            System.out.println(sailors.get(i).getName());
            System.out.println(sailors.get(i).getId());
            System.out.println(sailors.get(i).getNationality());
            System.out.println(sailors.get(i).getDateOfBirth());
            System.out.println(sailors.get(i).getSalary());
            totalSalary = totalSalary + sailors.get(i).getSalary();
            System.out.println("The total cost of salaries " + totalSalary);
            p.setDockFee(capacity);
            totaldockFee = totaldockFee + (2 * p.getDockFee());
            System.out.println("total dock fee" + totaldockFee);
        }
    }

    /**
     *
     * @return
     */
    public double calculateCost() {
        Port p = new Port();
        double cost = 0, dockfee = 0, totalexp = 0;
        for (int i = 0; i < 15; i++) {
            cost = cost + sailors.get(i).getSalary();
        }
        p.setDockFee(capacity);
        dockfee = dockfee + (2 * p.getDockFee());
        totalexp = cost + dockfee;
        return totalexp;
    }
}
