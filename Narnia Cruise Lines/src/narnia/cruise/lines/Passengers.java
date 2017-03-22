/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narnia.cruise.lines;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Meeth
 */
public class Passengers {

    private String name;
    private int number;
    private String address;
    private String nationality;
    private String DateOfBirth;

    /**
     * money spent
     */
    public int moneySpent;

    /**
     * get money spent
     *
     * @return money spent
     */
    public int getMoneySpent() {
        return moneySpent;
    }

    /**
     * set money spent
     *
     * @param moneySpent
     */
    public void setMoneySpent(int moneySpent) {
        this.moneySpent = moneySpent;
    }
    int i = 1;

    {
        i = getRandomNumber(1, 100);

    }

    /**
     * no-args Passenger constructor
     */
    public Passengers() {
        int j = 0;
        while (j < 4) {
            this.number = i;
            this.name = NarniaCruiseLines.r4.getColumns().get(i)[j++];
            this.address = NarniaCruiseLines.r4.getColumns().get(i)[j++];
            this.nationality = NarniaCruiseLines.r4.getColumns().get(i)[j++];
            this.DateOfBirth = NarniaCruiseLines.r4.getColumns().get(i)[j++];
            this.moneySpent = moneySpentOnCruise();
        }
        i++;
    }

    /**
     * args Passenger constructor
     *
     * @param i
     */
    public Passengers(int i) {

    }

    /**
     * get name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get number
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * set number
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * get address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * set address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get nationality
     *
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * set nationality
     *
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * get date of birth
     *
     * @return date of birth
     */
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * set date of birth
     *
     * @param DateOfBirth
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * generate random number
     *
     * @param min
     * @param max
     * @return
     */
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     * gives the money spent on cruise
     *
     * @return
     */
    public int moneySpentOnCruise() {
        int food = getRandomNumber(1, 100);
        int beverages = getRandomNumber(1, 100);
        int extras = getRandomNumber(1, 100);
        int total = food + beverages + extras;
        return total;
    }

}
