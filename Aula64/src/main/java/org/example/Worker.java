package org.example;

import entity.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private ArrayList<HourContract> contract_list = new ArrayList<>();

    public Worker() {}

    public Worker(String name, WorkerLevel level, double baseSalary, ArrayList<HourContract> contract_list) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.contract_list = contract_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public ArrayList<HourContract> getContract_list() {
        return contract_list;
    }

    public void setContract_list(ArrayList<HourContract> contract_list) {
        this.contract_list = contract_list;
    }

    public void addContract(HourContract contract) {
        contract_list.add(contract);
    }

    public void removeContract(HourContract contract) {
        contract_list.remove(contract);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", contract_list=" + contract_list +
                '}';
    }

    public Double income(int year, int month) {
        double sum = baseSalary;
        for (int i = 0; i < contract_list.size(); i++) {
            LocalDate contractDate = contract_list.get(i).getDate();
            int contractYear = contractDate.getYear();
            int contractMonth = contractDate.getMonth().getValue();
            if (year == contractYear && month == contractMonth) {
                sum += contract_list.get(i).totalValue();
            }
        }
        return sum;
    }
}

