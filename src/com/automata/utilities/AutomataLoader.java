apackage com.automata.utilities;

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
        automata.getAlphabet().add(new Symbol('E'));
        automata.getAlphabet().add(new Symbol('.'));
        automata.getAlphabet().add(new Symbol('+'));
        automata.getAlphabet().add(new Symbol('-'));
        
        automata.getStates().add(new State("q1", false));
        automata.getStates().add(new State("q2", true));
        automata.getStates().add(new State("q3", false));
        automata.getStates().add(new State("q4", true));
        automata.getStates().add(new State("q5", false));
        automata.getStates().add(new State("q6", false));
        automata.getStates().add(new State("q7", true));
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.getStates().get(0).addTransition(symbol, automata.getStates().get(1));
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.getStates().get(1).addTransition(symbol, automata.getStates().get(1));
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.getStates().get(2).addTransition(symbol, automata.getStates().get(3));
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.getStates().get(3).addTransition(symbol, automata.getStates().get(3));
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.getStates().get(4).addTransition(symbol, automata.getStates().get(6));
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.getStates().get(5).addTransition(symbol, automata.getStates().get(6));
        });
        
        automata.getAlphabet().subList(0, 10).forEach(symbol -> {
        	automata.getStates().get(6).addTransition(symbol, automata.getStates().get(6));
        });
        
        //automata.getStateByName(name);
        //automata.getStates().get(1).addTransition(automata.findSymbol(), automata.getStates().get(2));
        automata.getStates().get(1).addTransition(automata.getAlphabet().get(9), automata.getStates().get(4));
        automata.getStates().get(3).addTransition(automata.getAlphabet().get(9), automata.getStates().get(4));
        automata.getStates().get(4).addTransition(automata.getAlphabet().get(11), automata.getStates().get(5));
        automata.getStates().get(4).addTransition(automata.getAlphabet().get(12), automata.getStates().get(5));
        
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
    
    /*public static Automata incC() {
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
    
    /*public static Automata incD() {
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
    

}
