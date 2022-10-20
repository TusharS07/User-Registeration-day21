package com.bridgelabz.userRegisteration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {

    //UC10 = Write JUnit Test to validate the User Entry for First Name, Last Name, Email, Mobile, and Password.
    //- Write Junit Test for Happy as well as Sad test case.
    //- Happy Test Case validates the Entry Successfully
    //- Sad Test Cases fails the Entry


    //All valid Test Cases *****************Valid Test ************************
    //#**Test First Name Is Valid
    @Test
    public void checkFirstNameValid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean valid = userRegisterationOprations.validFirstName("Tushar");
        Assert.assertTrue(valid);
    }

    //#**Test Last Name Is Valid
    @Test
    public void checkLastNameValid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean valid = userRegisterationOprations.validLastName("Salunkhe");
        Assert.assertTrue(valid);
    }

    //#**Test Email_Id is Valid
    @Test
    public void checkEmail_IdValid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean valid = userRegisterationOprations.validEmail_Id("abc.xyz@bl.co.in");
        Assert.assertTrue(valid);
    }

    //#**Test MobileNumber is Valid
    @Test
    public void checkMobile_NumberValid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean valid = userRegisterationOprations.validMobileFormat("91 9919819801");
        Assert.assertTrue(valid);
    }

    //#**Test Password is Valid
    @Test
    public void checkPasswordValid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean valid = userRegisterationOprations.validPassword("Tushar@12");
        Assert.assertTrue(valid);
    }


//All Invalid Test Cases *****************Invalid Test ************************
    //#**Test First Name Is Invalid
    @Test
    public void checkFirstNameInvalid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean invalid = userRegisterationOprations.validFirstName("tushar");
        Assert.assertFalse(invalid);
    }

    //#**Test Last Name Is Invalid
    @Test
    public void checkLastNameInvalid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean invalid = userRegisterationOprations.validLastName("salunkhe");
        Assert.assertFalse(invalid);
    }

    //#**Test Email_Id is Invalid
    @Test
    public void checkEmail_IdInvalid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean invalid = userRegisterationOprations.validEmail_Id(".abc.xyz@bl.co.in");
        Assert.assertFalse(invalid);
    }

    //#**Test MobileNumber is Invalid
    @Test
    public void checkMobile_NumberInvalid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean invaild = userRegisterationOprations.validMobileFormat("91 928282");
        Assert.assertFalse(invaild);
    }

    //#**Test Password is Invalid
    @Test
    public void checkPasswordInvalid() {
        UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();
        boolean invalid = userRegisterationOprations.validPassword("tushar@12");
        Assert.assertFalse(invalid);
    }



}
