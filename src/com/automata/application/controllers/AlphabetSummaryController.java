package com.automata.application.controllers;

import com.automata.Main;
import com.automata.data.models.Symbol;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AlphabetSummaryController {

    @FXML
    private TableView<Symbol> tbvSymbols;

    @FXML
    private TableColumn<Symbol, Character> tbcCharacter;

    @FXML
    public void initialize() {
        this.tbcCharacter.setCellValueFactory(value -> value.getValue().getSymbolProperty());
        this.tbvSymbols.setItems(Main.getCurrentAutomata().getAlphabet());
    }

}
