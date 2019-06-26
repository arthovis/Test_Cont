package com.company;

public class Cont {
    private String titular;
    private String IBAN;
    private int balanta;
    private int dobanda;

    public Cont(String titular, String IBAN, int balanta, int dobanda) {
        this.titular = titular;
        this.IBAN = IBAN;
        this.balanta = balanta;
        this.dobanda = dobanda;
    }

    public int Withdraw(int sum){
        return balanta - sum;
    }

    public int Deposit(int sum){
        return balanta +sum;
    }

    public int adaugaDobanda(){
               return balanta+=dobanda;
    }

    public String toString(){
        return titular+" are in contul "+IBAN+" "+balanta+" lei";
    }
}
