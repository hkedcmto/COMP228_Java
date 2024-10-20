//Let Insurance be an abstract superclass

package exercise1;

public abstract class Insurance {
    String typeOfInsurance; //The Insurance class defines an instance variable of type String to describe the type of insurance
    double monthlyCost; // an instance variable of type double to hold the monthly cost of that insurance.

    public Insurance(String typeOfInsurance, double monthlyCost) {
        this.typeOfInsurance = typeOfInsurance;
        this.monthlyCost = monthlyCost;
    }

    //Implement the get methods for both variables of class Insurance
    protected String getTypeOfInsurance() {
        return typeOfInsurance;
    }
    protected double getMonthlyCost() {
        return monthlyCost;
    }

    //Declare also two abstract methods named setInsuranceCost() and displayInfo() for this class.
    protected abstract void setInsuranceCost(double cost);
    protected abstract void displayInfo();

}
