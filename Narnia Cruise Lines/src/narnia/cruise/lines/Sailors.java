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
 * class for sailors
 *
 * @author Meeth
 */
public class Sailors {

    private int id;
    private String name;
    private double salary;
    private String nationality;
    private String DateOfBirth;
    private boolean supervisor = false;
    int i = 0;

    {
        i = getRandomNumber(81, 96);

    }

    ArrayList<Engineers> engineers = new ArrayList<>();
    ArrayList<Doctors> doctors = new ArrayList<>();
    ArrayList<Cooks> cooks = new ArrayList<>();
    ArrayList<Sailors> assistantSailors = new ArrayList<>();

    /**
     * no- args default sailor constructor
     */
    public Sailors() {

        int j = 0;
        while (j < 3) {
            this.id = i;
            this.name = NarniaCruiseLines.r2.getColumns().get(i)[j++];
            this.DateOfBirth = NarniaCruiseLines.r2.getColumns().get(i)[j++];
            this.nationality = NarniaCruiseLines.r2.getColumns().get(i)[j++];

            this.salary = 50000;
        }
        i++;

    }

    /**
     * get id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * get salary
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * set salary
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
        if (this.isSupervisor() == true) {
            this.salary = (salary * 0.2) + salary;
        }
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
     * get dob
     *
     * @return dob
     */
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * set dob
     *
     * @param DateOfBirth
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * gives supervisor or not
     *
     * @return
     */
    public boolean isSupervisor() {
        return supervisor;
    }

    /**
     * sets supervisor or not
     *
     * @param supervisor
     */
    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * generates random number
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
