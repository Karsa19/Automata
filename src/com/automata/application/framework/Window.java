package com.automata.application.framework;

import javafx.stage.Stage;

public class Window {

    private Stage stage = new Stage();

    public Window(Container container) {
        stage.setScene(container.getScene());
        stage.setTitle(container.getTitle());
    }

    public Stage getStage() {
        return stage;
    }
}
