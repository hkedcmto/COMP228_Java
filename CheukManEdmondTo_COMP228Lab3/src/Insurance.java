public abstract class Insurance {
    String typeOfInsurance;
    double monthlyCost;

    public Insurance(String typeOfInsurance, double monthlyCost) {
        this.typeOfInsurance = typeOfInsurance;
        this.monthlyCost = monthlyCost;
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();

}
