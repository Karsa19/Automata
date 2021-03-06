package com.automata.data.models;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

public class State {

    private StringProperty name = new SimpleStringProperty();
    private BooleanProperty acceptance = new SimpleBooleanProperty();
    private MapProperty<Symbol, State> transitions = new SimpleMapProperty<>(FXCollections.observableHashMap());

    public State() {
        this("", false);
    }

    public State(String name, boolean acceptance) {
        this.name.setValue(name);
        this.acceptance.setValue(acceptance);
    }

    public State delta(Symbol symbol) {
        if (symbol == null)
            return null;
        return this.transitions.get(symbol);
    }

    public boolean hasTransition(Symbol symbol) {
        return this.transitions.containsKey(symbol);
    }

    public String getName() {
        return name.getValue();
    }

    public ObservableMap<Symbol, State> getTransitions() {
        return transitions.get();
    }

    public boolean isFinal() {
        return acceptance.get();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public void setFinal(boolean isFinal) {
        this.acceptance.setValue(isFinal);
    }

    public void addTransition(Symbol symbol, State destination) {
        this.transitions.putIfAbsent(symbol, destination);
    }

    public StringProperty getNameProperty() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof State))
            return false;
        return this.name.equals(((State) obj).name) && this.transitions.equals(((State) obj).transitions) && this.acceptance.equals(((State) obj).acceptance);
    }
}
