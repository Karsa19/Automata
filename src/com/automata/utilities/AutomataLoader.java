package com.automata.utilities;

import com.automata.data.models.Automata;
import com.automata.data.models.State;
import com.automata.data.models.Symbol;

public class AutomataLoader {

    public static Automata init() {
        Automata automata = new Automata();
        automata.getAlphabet().add(new Symbol('0'));
        automata.getAlphabet().add(new Symbol('1'));
        State q1 = new State("q1", false);
        automata.setInitialState(q1);
        automata.getStates().add(q1);
        automata.getStates().add(new State("q2", true));
        automata.getStates().get(0).addTransition(automata.getAlphabet().get(0), automata.getStates().get(1));
        automata.getStates().get(1).addTransition(automata.getAlphabet().get(1), automata.getStates().get(1));
        return automata;
    }
    
    public static Automata incA() {
        Automata automata = new Automata();
        
        for(int i = 48; i < 58; i++) {
        	automata.getAlphabet().add(new Symbol((char) i));
        }
        automata.addSymbol('E');
        automata.addSymbol('.');
        automata.addSymbol('+');
        automata.addSymbol('-');
        
        automata.addState("q1", false);
        automata.addState("q2", true);
        automata.addState("q3", false);
        automata.addState("q4", true);
        automata.addState("q5", false);
        automata.addState("q6", false);
        automata.addState("q7", true);
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q1", "q2", symbol);
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q2", "q2", symbol);
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q3", "q4", symbol);
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q4", "q4", symbol);
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q5", "q7", symbol);
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q5", "q7", symbol);
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q6", "q7", symbol);
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.addTransition("q7", "q7", symbol);
        });
        
        automata.addTransition("q2", "q3", '.');
        automata.addTransition("q2", "q5", 'E');
        automata.addTransition("q4", "q5", 'E');
        automata.addTransition("q5", "q6", '+');
        automata.addTransition("q5", "q6", '-');
        
        
        automata.setInitialState(automata.getStates().get(0));
        return automata;
    }
    
    /*public static Automata incB() {
    Automata automata = new Automata();
    automata.getAlphabet().add(new Symbol('0'));
    automata.getAlphabet().add(new Symbol('1'));
    State q1 = new State("q1", false);
    automata.setInitialState(q1);
    automata.getStates().add(q1);
    automata.getStates().add(new State("q2", true));
    automata.getStates().get(0).addTransition(automata.getAlphabet().get(0), automata.getStates().get(1));
    automata.getStates().get(1).addTransition(automata.getAlphabet().get(1), automata.getStates().get(1));
    return automata;
	}*/
    
    public static Automata incC() {
    	Automata automata=new Automata();
    	automata.addSymbol('a');
        automata.addSymbol('b');
        automata.addSymbol('c');
        
        automata.addState("q1", false);
        automata.addState("q2", false);
        automata.addState("q3", false);
        automata.addState("q4", false);
        automata.addState("q5", false);
        automata.addState("q6", false);
        automata.addState("q7", false);
        automata.addState("q8", false);
        automata.addState("q9", false);
        automata.addState("q10", false);
        automata.addState("q11", false);
        automata.addState("q12", false);
        automata.addState("q13", false);
        automata.addState("q14", true);
        automata.addState("q15", true);
        automata.addState("q16", true);
        automata.addState("q17", true);
        automata.addState("q18", true);
        automata.addState("q19", true);
        automata.addState("q20", true);
        automata.addState("q21", true);
        automata.addState("q22", true);
        automata.addState("q23", true);
        automata.addState("q24", true);
        automata.addState("q25", true);
        automata.addState("q26", true);
        automata.addState("q27", true);
        automata.addState("q28", true);
        
        automata.setInitialState(automata.getStates().get(0));
        
        automata.addTransition("q1", "q2", 'a');
        automata.addTransition("q1", "q6", 'b');
        automata.addTransition("q1", "q7", 'c');
        automata.addTransition("q2", "q3", 'a');
        automata.addTransition("q2", "q4", 'b');
        automata.addTransition("q2", "q5", 'c');
        automata.addTransition("q3", "q14", 'a');
        automata.addTransition("q3", "q15", 'b');
        automata.addTransition("q3", "q16", 'c');
        automata.addTransition("q4", "q17", 'b');
        automata.addTransition("q5", "q18", 'c');
        automata.addTransition("q6", "q9", 'a');
        automata.addTransition("q6", "q8", 'b');
        automata.addTransition("q6", "q10", 'c');
        automata.addTransition("q7", "q13", 'a');
        automata.addTransition("q7", "q12", 'b');
        automata.addTransition("q7", "q11", 'c');
        automata.addTransition("q8", "q20", 'a');
        automata.addTransition("q8", "q19", 'b');
        automata.addTransition("q8", "q11", 'c');
        automata.addTransition("q9", "q22", 'a');
        automata.addTransition("q10", "q23", 'c');
        automata.addTransition("q11", "q24", 'a');
        automata.addTransition("q11", "q25", 'b');
        automata.addTransition("q11", "q26", 'c');
        automata.addTransition("q12", "q27", 'b');
        automata.addTransition("q13", "q28", 'a');
       
        
        return automata;

	}
    
    public static Automata incD() {
    Automata automata = new Automata();
    
    automata.addSymbol('1');
    automata.addSymbol('2');
    automata.addSymbol('5');
    automata.addSymbol('10');
    
    automata.addState("q1", false);
    automata.addState("q2", false);
    automata.addState("q3", false);
    automata.addState("q4", false);
    automata.addState("q5", false);
    automata.addState("q6", false);
    automata.addState("q7", false);
    automata.addState("q8", false);
    automata.addState("q9", false);
    automata.addState("q10", false);
    automata.addState("q11", true);
    
    automata.setInitialState(automata.getStates().get(0));

    
    automata.addTransition("q1", "q2", '1');
    automata.addTransition("q1", "q3", '2');
    automata.addTransition("q1", "q6", '5');
    automata.addTransition("q1", "q11", '10');
    automata.addTransition("q2", "q3", '1');
    automata.addTransition("q2", "q4", '2');
    automata.addTransition("q2", "q7", '5');
    automata.addTransition("q3", "q4", '1');
    automata.addTransition("q3", "q5", '2');
    automata.addTransition("q3", "q8", '5');
    automata.addTransition("q4", "q5", '1');
    automata.addTransition("q4", "q6", '2');
    automata.addTransition("q4", "q9", '5');
    automata.addTransition("q5", "q6", '1');
    automata.addTransition("q5", "q7", '2');
    automata.addTransition("q5", "q10", '5');
    automata.addTransition("q6", "q7", '1');
    automata.addTransition("q6", "q8", '2');
    automata.addTransition("q6", "q11", '5');
    automata.addTransition("q7", "q8", '1');
    automata.addTransition("q7", "q9", '2');
    automata.addTransition("q9", "q10", '1');
    automata.addTransition("q9", "q11", '2');
    automata.addTransition("q10", "q11", '1');
    
    return automata;
	}
    

}
