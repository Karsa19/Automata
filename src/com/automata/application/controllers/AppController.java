package com.automata.application.controllers;

import com.automata.Main;
import com.automata.application.framework.Manager;
import com.automata.utilities.AutomataLoader;
import com.automata.application.framework.View;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class AppController {

    @FXML
    private AnchorPane root;

    public void change(View view) {
        Manager.setVisible(view);
    }

    @FXML
    public void a(ActionEvent event) {
        Main.setCurrentAutomata(AutomataLoader.incA());
        this.statesTransitionTable(event);
    }

    @FXML
    public void b(ActionEvent event) {
        Main.setCurrentAutomata(AutomataLoader.init());
        this.statesTransitionTable(event);
    }

    @FXML
    public void c(ActionEvent event) {
        Main.setCurrentAutomata(AutomataLoader.incC());
        this.statesTransitionTable(event);
    }

    @FXML
    public void d(ActionEvent event) {
        Main.setCurrentAutomata(AutomataLoader.incD());
        this.statesTransitionTable(event);
    }

    @FXML
    public void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    public void alphabetSummary(ActionEvent event) {
        this.change(Main.getResourceLibrary().ALPHABET_SUMMARY);
    }

    @FXML
    public void statesTransitionTable(ActionEvent event) {
        this.change(Main.getResourceLibrary().TRANSITION_TABLE);
    }

    @FXML
    public void stringsRun(ActionEvent event) {
        this.change(Main.getResourceLibrary().STRING_VALIDATION);
    }

    @FXML
    public void initialize() {
        Manager.setRootLayout(this.root);
    }

}
