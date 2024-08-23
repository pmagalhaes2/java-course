package heranca.ex_03.entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(String name, Double manualIncoming, Integer numberOfEmployees) {
        super(name, manualIncoming);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double totalTax;

        if (numberOfEmployees > 10) {
            totalTax = manualIncoming * 0.14;
        } else {
            totalTax = manualIncoming * 0.16;
        }

        return totalTax;
    }
}
