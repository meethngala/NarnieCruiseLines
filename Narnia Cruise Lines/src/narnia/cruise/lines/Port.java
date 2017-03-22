/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narnia.cruise.lines;

import java.util.Random;

/**
 * class for Port
 *
 * @author Meeth
 */
public class Port {

    private String name;
    private String country;
    private double population;
    private double dockFee;
    private boolean visited = false;
    int i = 0;

    {
        i = getRandomNumber(1, 95);
    }

    /**
     * no-args default Port constructor
     */
    public Port() {
        int j = 0;
        while (j < 3) {
            this.name = NarniaCruiseLines.r3.getColumns().get(i)[j++];
            this.country = NarniaCruiseLines.r3.getColumns().get(i)[j++];
            this.population = Double.valueOf(NarniaCruiseLines.r3.getColumns().get(i)[j++]);

        }
        i++;
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
     * get country
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * set country
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * get population
     *
     * @return population
     */
    public double getPopulation() {
        return population;
    }

    /**
     * set population
     *
     * @param population
     */
    public void setPopulation(double population) {
        this.population = population;
    }

    /**
     * get dock fee
     *
     * @return fee
     */
    public double getDockFee() {
        return dockFee;
    }

    /**
     * set dock fee
     *
     * @param capacity
     */
    public void setDockFee(double capacity) {
        if (capacity < 30000) {
            this.dockFee = 20000;
        } else if (capacity < 50000) {
            this.dockFee = 50000;
        } else if (capacity > 50000) {
            this.dockFee = 100000;
        }
    }

    /**
     * gives port visited or not
     *
     * @return boolean
     */
    public boolean isVisited() {
        return visited;
    }

    /**
     * set port visited or not
     *
     * @param visited
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    private static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
