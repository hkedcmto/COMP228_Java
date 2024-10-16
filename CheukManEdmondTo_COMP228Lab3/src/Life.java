public class Life extends Insurance{
    public Life(String typeOfInsurance, double monthlyCost) {
        super(typeOfInsurance, monthlyCost);
    }

    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    @Override
    public void displayInfo() {

    }
}
