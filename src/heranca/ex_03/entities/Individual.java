package heranca.ex_03.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double manualIncoming, Double healthExpenditures) {
        super(name, manualIncoming);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double totalTax;

        if (manualIncoming < 2000.00) {
            totalTax = manualIncoming * 0.15;
        } else if (manualIncoming > 2000.00 && healthExpenditures > 0.0) {
            totalTax = (manualIncoming * 0.25) - (healthExpenditures * 0.50);
        } else {
            totalTax = manualIncoming * 0.25;
        }

        return totalTax;
    }
}
