package org.example.middemo;

public class HighlandsPlan extends ElectricityPlan{
    public HighlandsPlan() {}

    public HighlandsPlan(int totalKWh) {
        super(PlanType.HIGHLANDS, totalKWh);
    }

    @Override
    public double calculateCost(int totalKWh) {
        double kWh=getTotalKWh();
        return kWh*1.5;
    }
}
