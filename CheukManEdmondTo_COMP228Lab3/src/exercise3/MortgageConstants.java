package exercise3;

public interface MortgageConstants {
    int SHORT_TERM = 1; //short-term (one year)
    int MEDIUM_TERM = 3;//medium-term (three years)
    int LONG_TERM = 5;//long-term (5 years)
    String BANK_NAME = "CityToronto Bank"; //contains constants for bank name
    double MAX_MORTGAGE_AMOUNT = 300000.00; //the maximum mortgage amount $300,000
    double PRIME_RATE = 5.5; //set Prime Rate


    //Create a getMortgageInfo method to display all the mortgage data.
    public void getMortgageInfo();
}
