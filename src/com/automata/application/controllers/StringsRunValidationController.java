package com.automata.application.controllers;

import com.automata.Main;
import com.automata.data.models.State;
import com.automata.data.models.Step;
import com.automata.data.models.Symbol;
import com.automata.utilities.StringValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * Created by bruno on 20/04/17.
 */
public class StringsRunValidationController {

    @FXML
    private TextField txtString;

    @FXML
    private Label lblResult;

    @FXML
    private TableView<Step> tbvSteps;

    @FXML
    private TableColumn<Step, State> tbcState;

    @FXML
    private TableColumn<Step, Symbol> tbcSymbol;

    @FXML
    private TableColumn<Step, State> tbcTransition;

    @FXML
    private TableColumn<Step, String> tbcResult;

    @FXML
    public void startValidation(ActionEvent event) {
        this.tbvSteps.getItems().clear();

        String string = this.txtString.getText();
        lblResult.setText("" + StringValidator.validate(string, Main.getCurrentAutomata().getInitialState()));
        this.tbvSteps.setItems(StringValidator.getSteps());
    }

    @FXML
    public void clean(ActionEvent event) {
        this.txtString.clear();
        this.tbvSteps.getItems().clear();
    }

    @FXML
    public void initialize() {
        this.tbcState.setCellValueFactory(value -> value.getValue().stateProperty());
        this.tbcSymbol.setCellValueFactory(value -> value.getValue().symbolProperty());
        this.tbcTransition.setCellValueFactory(value -> value.getValue().transitionProperty());
        this.tbcResult.setCellValueFactory(value -> value.getValue().resultProperty());
    }

}
