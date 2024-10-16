public class Health extends Insurance{

    public Health(String typeOfInsurance, double monthlyCost) {
        super(typeOfInsurance, monthlyCost);
    }

    @Override
    public void setInsuranceCost(double cost){
        this.monthlyCost = cost;
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getTypeOfInsurance());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}
