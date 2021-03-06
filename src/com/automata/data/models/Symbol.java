package com.automata.data.models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Symbol {

    private ObjectProperty<Character> symbol = new SimpleObjectProperty<>();

    public Symbol() {
        this((char) 0);
    }

    public Symbol(char symbol) {
        this.symbol.setValue(symbol);
    }

    public Character getSymbol() {
        return symbol.get();
    }

    public ObjectProperty<Character> getSymbolProperty() {
        return this.symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol.set(symbol);
    }

    @Override
    public String toString() {
        return this.getSymbol().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Symbol))
            return false;
        return ((Symbol) obj).getSymbol() == this.getSymbol();
    }

    public static Symbol fromChar(char symbol) {
        return new Symbol(symbol);
    }

    public static Symbol findInAlphabet(List<Symbol> alphabet, char symbol) {
        for (Symbol i : alphabet) {
            if (i.getSymbol() == symbol) {
                return i;
            }
        }
        return null;
    }
}
