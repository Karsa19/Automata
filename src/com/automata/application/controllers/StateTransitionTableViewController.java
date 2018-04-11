package com.automata.application.controllers;

import com.automata.Main;
import com.automata.data.models.State;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StateTransitionTableViewController {
    @FXML
    private TableView<State> tbvTransitions;
    @FXML
    private TableColumn<State, String> tbcStateName;
    @FXML
    private TableColumn<State, String> tbcType;

    @FXML
    public void initialize() {
        this.tbcStateName.setCellValueFactory(value -> value.getValue().getNameProperty());
        Main.getCurrentAutomata().getAlphabet().forEach(symbol -> {
            TableColumn<State, String> column = new TableColumn<State, String>(symbol.getSymbol().toString());
            column.setCellValueFactory(value -> {
                if (value.getValue().delta(symbol) != null)
                    return value.getValue().delta(symbol).getNameProperty();
                return new SimpleStringProperty();
            });
            this.tbvTransitions.getColumns().add(column);
        });
        this.tbvTransitions.setItems(Main.getCurrentAutomata().getStates());
        this.tbcType.setCellValueFactory(state -> {
            SimpleStringProperty type = new SimpleStringProperty();
            if (state.getValue().isFinal() && state.getValue() == Main.getCurrentAutomata().getInitialState()) {
                type.setValue("Inicial / Aceptación");
            } else if (state.getValue().isFinal()) {
                type.setValue("Aceptación");
            } else if (state.getValue() == Main.getCurrentAutomata().getInitialState()) {
                type.setValue("Inicial");
            }


            return type;
        });

    }
}
