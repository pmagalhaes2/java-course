package heranca.ex_03.entities;

public abstract class TaxPayer {
    protected Double manualIncoming;
    private String name;

    public TaxPayer(String name, Double manualIncoming) {
        this.name = name;
        this.manualIncoming = manualIncoming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getManualIncoming() {
        return manualIncoming;
    }

    public void setManualIncoming(Double manualIncoming) {
        this.manualIncoming = manualIncoming;
    }

    public abstract Double tax();
}
