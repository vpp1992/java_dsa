package com.dsa.java.demo.designpattern.solid.sr;

public class LoanService {

    public void getLoanInfo(String loanType){
        if (loanType.equalsIgnoreCase("pl")){
            System.out.println("personalloan");
        }
        else if (loanType.equalsIgnoreCase("homeLoan")){
            System.out.println("HomeLoan");
        }

    }
}
