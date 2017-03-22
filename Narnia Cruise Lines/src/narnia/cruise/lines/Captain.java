/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narnia.cruise.lines;

import com.sun.webkit.CursorManager;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Meeth
 * @version 1
 */
import java.util.Random;
import java.util.stream.IntStream;

public class Captain extends Sailors {

    Random rand = new Random();
    ArrayList<Captain> captain = new ArrayList<>();

    public Captain() {

        int i = getRandomNumber(1, 10);
        int j = 2;
        while (j > 0) {
            this.setId(i);
            this.setNationality(NarniaCruiseLines.r2.getColumns().get(i)[j--]);
            this.setDateOfBirth(NarniaCruiseLines.r2.getColumns().get(i)[j--]);
            this.setName(NarniaCruiseLines.r2.getColumns().get(i)[j--]);
            this.setSalary(300000);

        }

    }

}
