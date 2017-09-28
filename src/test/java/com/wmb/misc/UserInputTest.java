package com.wmb.misc;

import com.wmb.practice.UserInput;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/22/17.
 */
public class UserInputTest {
    @Test
    public void basictest(){
        UserInput.TextInput ui = new UserInput.TextInput();
        ui.add('x');
        ui.add('x');
        ui.add('x');
        ui.add('x');
        ui.add('x');
        assertTrue(ui.getValue().equals("xxxxx"));

    }
    @Test
    public void basictest2(){
        UserInput.NumericInput ui = new UserInput.NumericInput();
        ui.add('x');
        ui.add('x');
        ui.add('8');
        ui.add('x');
        ui.add('x');
        ui.add('1');
        ui.add('x');
        ui.add('3');
        assertTrue(ui.getValue().equals("813"));

    }
    @Test
    public void basictest3(){
        UserInput.NumericInput ui = new UserInput.NumericInput();
        ui.add('A');
        ui.add('V');
        ui.add('8');
        ui.add('B');
        ui.add('C');
        ui.add('1');
        ui.add('D');
        ui.add('3');
        assertTrue(ui.getValue().equals("813"));

    }
}
