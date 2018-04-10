package com.automata;

import com.automata.data.models.Automata;
import com.automata.resources.ResourceLibrary;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    private static ResourceLibrary resourceLibrary;
    private static Automata currentAutomata;

    public static ResourceLibrary getResourceLibrary() {
        return resourceLibrary;
    }

    public static Automata getCurrentAutomata() {
        return currentAutomata;
    }

    public static void setCurrentAutomata(Automata currentAutomata) {
        Main.currentAutomata = currentAutomata;
    }

    @Override
    public void start(Stage stage) {
        resourceLibrary = new ResourceLibrary();
        stage = resourceLibrary.APP_WINDOW.getStage();
        stage.show();
    }

    public static void main(String[] args) {
        Main.setCurrentAutomata(new Automata());
        launch(args);
    }
}
