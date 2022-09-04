package com.javalessons.chapter2attestation;

public class Calc {
    private int loanAmount;
    private int years;
    private float interestRate;
    private int extraPayment;
    private int mount; //Number of month
    private float startingBalance; //credit amount at the beginning of the month
    private float payment; // monthly payment size
    private float interest; // credit fee in payment size
    private float principal; // credit body in payment size
    private float endingBalance; // credit amount at the end of the month
    private float totalInterest = 0; // amount of credit fee

    public Calc(int loanAmount, int years, float interestRate) {
        this(loanAmount, years, interestRate, 0);
    }

    public Calc(int loanAmount, int years, float interestRate, int extraPayment) {
        this.loanAmount = loanAmount;
        this.years = years;
        this.interestRate = interestRate;
        this.extraPayment = extraPayment;
        this.startingBalance = loanAmount;
    }

    public void getCreditPlan() {
        System.out.printf("%S, %15S, %6S, %8S, %8S, %15S, %15S%n",
                "MONTH", "STARING_BALANCE", "PAYMENT", "INTEREST", "PRINCIPAL",
                "ENDING_BALANCE", "TOTAL_INTEREST");
        for (int i = 1; i <= years * 12; i++) {
            payment = (startingBalance * (interestRate / 12)) /
                    (1 - (float) Math.pow((1 + interestRate / 12), -1 * (years * 12 - i)));
            interest = startingBalance * (interestRate / 12);
            principal = payment + extraPayment - interest;
            endingBalance = startingBalance - principal;
            totalInterest = totalInterest + interest;
            System.out.printf("%2d %18.2f %10.2f %8.2f %10.2f %15.2f %15.2f%n",
                    i, startingBalance, payment, interest, principal,
                    endingBalance, totalInterest);
            startingBalance = endingBalance;
            if (endingBalance <= 0) {
                System.out.printf("Early repayment of the loan, %d month", years * 12 -i);
                break;
            };
        }
    }
}
