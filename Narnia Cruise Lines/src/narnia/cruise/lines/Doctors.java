/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narnia.cruise.lines;

import java.util.Random;

/**
 *
 * @author Meeth
 * @version 1
 */
public class Doctors extends Sailors {

    static {
        int i = getRandomNumber(41, 58);

    }

    /**
     * no-args Doctors constructor
     */
    public Doctors() {

        int j = 2;
        while (j > 0) {
            this.setId(i);
            this.setNationality(NarniaCruiseLines.r2.getColumns().get(i)[j--]);
            this.setDateOfBirth(NarniaCruiseLines.r2.getColumns().get(i)[j--]);
            this.setName(NarniaCruiseLines.r2.getColumns().get(i)[j--]);
            this.setSalary(60000);
        }
        i++;
    }

}
