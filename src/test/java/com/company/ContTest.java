package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContTest {

    private Cont cont;

    @Before
    public void setUP(){
        cont = new Cont("Andrei","ABC_ADC_123_145",2000,150);
    }

    @Test
    public void withdrawTest(){
        int result = cont.Withdraw(500);
        Assert.assertEquals(1500,result);
    }

    @Test
    public void depositTest(){
        int result = cont.Deposit(500);
        Assert.assertEquals(2500,result);
    }

    @Test
    public void adaugaDobandaTest(){
        int result = cont.adaugaDobanda();
        Assert.assertEquals(2150,result);
    }





}
