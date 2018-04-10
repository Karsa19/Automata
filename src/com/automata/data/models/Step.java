package com.automata.data.models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Step {

    private ObjectProperty<State> state = new SimpleObjectProperty<>();
    private ObjectProperty<Symbol> symbol = new SimpleObjectProperty<>();
    private ObjectProperty<State> transition = new SimpleObjectProperty<>();
    private StringProperty result = new SimpleStringProperty();

    public Step(State state, Symbol symbol, State transition, String result) {
        this.state.setValue(state);
        this.symbol.setValue(symbol);
        this.transition.setValue(transition);
        this.result.setValue(result);
    }

    public Step(State state, Symbol symbol, State transition) {
        this(state, symbol, transition, "Continuar");
    }

    public Step(State state, Symbol symbol) {
        this(state, symbol, null, null);
    }

    public State getState() {
        return state.get();
    }

    public Symbol getSymbol() {
        return symbol.get();
    }

    public State getTransition() {
        return transition.get();
    }

    public String getResult() {
        return result.get();
    }

    public ObjectProperty<State> stateProperty() {
        return state;
    }

    public ObjectProperty<Symbol> symbolProperty() {
        return symbol;
    }

    public ObjectProperty<State> transitionProperty() {
        return transition;
    }

    public StringProperty resultProperty() {
        return result;
    }

    public void setState(State state) {
        this.state.set(state);
    }

    public void setSymbol(Symbol symbol) {
        this.symbol.set(symbol);
    }

    public void setTransition(State transition) {
        this.transition.set(transition);
    }

    public void setResult(String result) {
        this.result.set(result);
    }

}
