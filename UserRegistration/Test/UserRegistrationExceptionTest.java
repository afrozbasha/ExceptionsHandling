package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


public class UserRegistrationExceptionTest {
    UserRegistrationException user = new UserRegistrationException();
    @Test
    public void firstName(){
        String fName = "Afroz";
        boolean chek = user.firstName(fName);
        assertTrue( chek);
    }

    @Test
    public void lastName(){
        String lName = "Basha";
        boolean chek = user.lastName(lName);
        assertTrue( chek);
    }

    @Test
    public void email(){
        String eMail = "abc.xyz@bl.co.in";
        boolean chek = user.eMail(eMail);
        assertTrue( chek);
    }

    @Test
    public void mobileNum(){
        String mobile = "91 9533182605";
        boolean chek = user.mobileNum(mobile);
        assertTrue( chek);
    }

    @Test
    public void passWordRule1(){
        String pass = "afrozbasha";
        boolean chek = user.pass1(pass);
        assertTrue( chek);
    }

    @Test
    public void passWordRule2(){
        String pass = "Afrozbasha";
        boolean chek = user.pass2(pass);
        assertTrue( chek);
    }


    @Test
    public void passWordRule3(){
        String pass = "Afrozbasha1";
        boolean chek = user.pass3(pass);
        assertTrue( chek);
    }

    @Test
    public void passWordRule4(){
        String pass = "Afrozbasha1@";
        boolean chek = user.pass4(pass);
        assertTrue( chek);
    }
}
