package com.automata.data.models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class Automata {

    private ObservableList<Symbol> alphabet = FXCollections.observableArrayList();
    private ObservableList<State> states = FXCollections.observableArrayList();
    private State initialState = new State();

    public Automata() {
    }

    public Automata(List<Symbol> alphabet, List<State> states, State initialState) {
        this.alphabet.addAll(alphabet);
        this.states.addAll(states);
        this.initialState = initialState;
    }

    public ObservableList<Symbol> getAlphabet() {
        return alphabet;
    }

    public ObservableList<State> getStates() {
        return states;
    }

    public State getInitialState() {
        return initialState;
    }

    public void setInitialState(State initialState) {
        this.initialState = initialState;
    }
    
    public void addSymbol(char symbol) {
    	this.alphabet.add(new Symbol(symbol));
    }
    
    public void addState(String name, boolean acceptance) {
    	this.states.add(new State(name, acceptance));
    }
    
    public State getStateByName(String name) {
    	for (State i : this.states) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }
    
    public Symbol findSymbol(char symbol) {
        for (Symbol i : this.alphabet) {
            if (i.getSymbol() == symbol) {
                return i;
            }
        }
        return null;
    }
    
    public void addTransition(String from, String to, char with) {
    	this.addTransition(from, to, this.findSymbol(with));
    }
    
    public void addTransition(String from, String to, Symbol with) {
    	this.getStateByName(from).addTransition(with, this.getStateByName(to));
    }

}
