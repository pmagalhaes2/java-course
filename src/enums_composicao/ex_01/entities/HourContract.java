package enums_composicao.ex_01.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private int hours;

    public HourContract(Date date, Double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }
}
