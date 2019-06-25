package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContTest {
    private Cont cont;
    private String titular = "Andrei";
    private String IBAN = "1231_1234_1234_1444";
    private int balanta;
    private int dobanda;

    public ContTest(String titular, String IBAN, int balanta, int dobanda) {
        this.titular = titular;
        this.IBAN = IBAN;
        this.balanta = balanta;
        this.dobanda = dobanda;
    }

    @Before
    public void setUP(){
        cont = new Cont(titular,IBAN, balanta, dobanda);
    }

    @Test
    public void WithdrawTest(){
        balanta = 1000;
        int result = cont.Withdraw(500);
        Assert.assertEquals(500,result);
    }

    @Test
    public void depositTest(){
        balanta = 1000;
        int result = cont.Deposit(500);
        Assert.assertEquals(1500,result);
    }

    @Test
    public void adaugaDobandaTest(){
        balanta = 1000;
        dobanda = 150;
        int result = cont.adaugaDobanda();
        Assert.assertEquals(1150,result);

    }

}
