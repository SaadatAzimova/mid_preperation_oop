package org.example.middemo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private RadioButton cType;
    @FXML
    private RadioButton pType;
    @FXML
    private RadioButton hType;
    @FXML
    private TextField inputKWH;
    @FXML
    private TextField totalCost;
    @FXML
    private ToggleGroup type;

    @FXML
    void onRBCalculateclick(){
        String kWhText = inputKWH.getText();
        int totalKWh = Integer.parseInt(kWhText);  // Parse input to an integer
        ElectricityPlan calculation = null;  // Declare the variable to hold the ElectricityPlan instance
        if (cType.isSelected()) {
            calculation = new CommercialPlan(totalKWh);
        } else if (pType.isSelected()) {
            calculation = new PopulationPlan(totalKWh);
        } else if (hType.isSelected()) {
            calculation = new HighlandsPlan(totalKWh);
        }
        double cost = calculation.calculateCost();  // Calculate the cost using the selected plan
        totalCost.setText(String.format("Total Cost: %.2f som", cost));
    }
    }
    
