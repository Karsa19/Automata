package com.automata.utilities;

import com.automata.Main;
import com.automata.data.models.State;
import com.automata.data.models.Step;
import com.automata.data.models.Symbol;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StringValidator {

    private static ObservableList<Step> steps = FXCollections.observableArrayList();

    public static boolean validate(String string, State initialState) {
        State stateIterator = initialState;
        int stepCount = 0;

        for (char i : string.toCharArray()) {
            steps.add(new Step(stateIterator, Symbol.findInAlphabet(Main.getCurrentAutomata().getAlphabet(), i)));

            stateIterator = stateIterator.delta(Symbol.findInAlphabet(Main.getCurrentAutomata().getAlphabet(), i));

            if (stateIterator == null) {
                steps.get(stepCount).setResult("SIMBOLO INVALIDO");
                return false;
            }

            if (stateIterator.isFinal() && stepCount == string.length() - 1) {
                steps.get(stepCount).setResult("AUTOMATA TERMINADO");
                return true;
            }

            steps.get(stepCount).setTransition(stateIterator);
            steps.get(stepCount).setResult("Continuar...");
            stepCount++;
        }
        return false;
    }

    public static ObservableList<Step> getSteps() {
        return steps;
    }
}
