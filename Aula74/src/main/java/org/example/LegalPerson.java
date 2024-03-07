package org.example;

public class LegalPerson extends Person{

    private Integer numberOfEmployees;

    public LegalPerson() {}

    public LegalPerson(String name, Double yearIncome, Integer numberOfEmployees) {
        super(name, yearIncome);
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
        int taxPercentage = getNumberOfEmployees() < 10 ? 16 : 14;

        return (getYearIncome() * (taxPercentage / 100));
    }
}
