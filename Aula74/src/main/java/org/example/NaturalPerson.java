package org.example;

public class NaturalPerson extends Person{
    private Double healthSpending;

    public NaturalPerson() {}

    public NaturalPerson(String name, Double yearIncome, Double healthSpending) {
        super(name, yearIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double tax() {
        int taxPercentage = getYearIncome() < 20000.00 ? 15 : 25;

        return (getYearIncome() * (taxPercentage / 100)) - ((50/100) * healthSpending);
    }
}
