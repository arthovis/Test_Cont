package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ContParameterizedTest {
    private int balanta;
    private int dobanda;
    private int sum;
    private int withdrawBalanta;
    private int depositBalanta;
    private int addDobanda;
    private Cont cont;

    public ContParameterizedTest(int balanta, int dobanda, int sum,int withdrawBalanta, int depositBalanta, int addDobanda) {
        this.balanta = balanta;
        this.dobanda = dobanda;
        this.sum = sum;
        this.withdrawBalanta = withdrawBalanta;
        this.depositBalanta = depositBalanta;
        this.addDobanda = addDobanda;
    }
    @Before
    public void setUP(){
        cont = new Cont("Andrei","ABC_ADC_123_145",balanta,dobanda);
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        Integer[][] array = {{2000, 150,500, 1500, 2500, 2150},{4500,500,1000,3500,5500,5000}};
        return Arrays.asList(array);
    }

    @Test
    public void withdrawBalantaTest(){
        int actual = cont.Withdraw(sum);
        Assert.assertEquals(withdrawBalanta,actual);
    }

    @Test
    public void depositBalantaTest(){
        int actual = cont.Deposit(sum);
        Assert.assertEquals(depositBalanta,actual);
    }

    @Test
    public void addDobandaTest(){
        int actual = cont.adaugaDobanda();
        Assert.assertEquals(addDobanda,actual);
    }



}
