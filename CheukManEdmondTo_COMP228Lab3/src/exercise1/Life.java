//subclasses that describe respectively life insurance.
package exercise1;

public class Life extends Insurance{
    public Life(String typeOfInsurance, double monthlyCost) {
        super("Life", monthlyCost);
    }

    @Override
    protected void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    //The Life and Health class should implement setInsuranceCost and
    // display methods by setting the appropriate monthly fee and display the information for each insurance type
    @Override
    protected void displayInfo() {
        System.out.println("Type of Insurance: " + this.getTypeOfInsurance());
        System.out.printf("Monthly Cost: %.2f%n", this.getMonthlyCost());
    }
}
