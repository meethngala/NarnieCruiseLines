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
 * @version 1
 */
public class Cruise {

    private int serialNumber;
    private String sailDate;
    private String returnDate;
    Ship s;
    Sailors sa;
    Port[] p;

    /**
     * no-args Cruise constructor
     */
    public Cruise() {
        s = new Ship("vikrant", 40000);

        sa = new Sailors();

        p = new Port[getRandomNumber(1, 3)];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Port();
        }

    }

    /**
     * get the serial number
     *
     * @return serial number
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * set the serial number
     *
     * @param serialNumber
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * get the sailDate
     *
     * @return sailDate
     */
    public String getSailDate() {
        return sailDate;
    }

    /**
     * set the saildate
     *
     * @param sailDate
     */
    public void setSailDate(String sailDate) {
        this.sailDate = sailDate;
    }

    /**
     * get the return date
     *
     * @return return date
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * set return date
     *
     * @param returnDate
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * generates a random number
     *
     * @param min
     * @param max
     * @return
     */
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
