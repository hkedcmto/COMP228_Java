//subclasses that describe respectively health insurance.
package exercise1;

public class Health extends Insurance{
    public Health(String typeOfInsurance, double monthlyCost) {
        super("Health", monthlyCost);
    }

    @Override
    protected void setInsuranceCost(double cost){
        this.monthlyCost = cost;
    }

    @Override
    protected void displayInfo() {
        System.out.println("Type of Insurance: " + this.getTypeOfInsurance());
        System.out.printf("Monthly Cost: %.2f%n", this.getMonthlyCost());
    }
}
