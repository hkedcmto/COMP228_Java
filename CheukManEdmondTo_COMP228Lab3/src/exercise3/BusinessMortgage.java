package exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String customerName, double amountOfMortgage, int term, double interestRate) {
        super(customerName, amountOfMortgage, term, interestRate);
        this.interestRate = interestRate + 1.0; //sets the interest rate to 1% over the current prime rate.
    }

    public void getMortgageInfo() {
        System.out.printf("Mortgage Number: %d%n", mortgageNumber);
        System.out.printf("Mortgage Type: Personal%n");
        System.out.printf("Customer Name: %s%n", customerName);
        System.out.printf("Amount of Mortgage: $%.2f%n", amountOfMortgage);
        System.out.printf("Interest Rate: %f%%%n", interestRate);
        System.out.printf("Term: %d year(s)%n%n", term);
    }

}
