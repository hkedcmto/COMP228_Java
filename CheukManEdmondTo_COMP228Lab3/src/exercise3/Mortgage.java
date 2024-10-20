package exercise3;

//an abstract class that implements the MortgageConstants interface.
// A Mortgage includes a mortgage number, customer name, amount of mortgage, interest rate, and term.
public abstract class Mortgage implements MortgageConstants{
    private static int nextMortgageNumber=1;
    int mortgageNumber;
    String customerName;
    double amountOfMortgage;
    double interestRate;
    int term;

    public Mortgage(String customerName, double amountOfMortgage, int term, double interestRate) {
        this.mortgageNumber = nextMortgageNumber++;
        this.customerName = customerName;
        //Don’t allow mortgage amounts over $300,000
        if (amountOfMortgage > MAX_MORTGAGE_AMOUNT){
            System.out.println("Maximum amount of Mortgage exceeded, application rejected.");
            return;
        }else{
            this.amountOfMortgage = amountOfMortgage;
        }
        // Force any mortgage term that is not defined in the MortgageConstants interface to a short-term
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            System.out.println("Invalid term, changed to short-term (1 year).");
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }

    }
}
