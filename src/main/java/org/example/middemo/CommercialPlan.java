package org.example.middemo;

public class CommercialPlan extends ElectricityPlan{
    public CommercialPlan(int totalKWh) {}

    public CommercialPlan(PlanType COMMERCIAL, int totalKWh) {
        super(COMMERCIAL, totalKWh);
    }

    @Override
    public double calculateCost(int totalKWh) {
        return totalKWh * 2.87;
    }
}
