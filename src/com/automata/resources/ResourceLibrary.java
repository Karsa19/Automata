package com.automata.resources;

import com.automata.application.framework.Container;
import com.automata.application.framework.View;
import com.automata.application.framework.Window;

/**
 * Created by bruno on 23/03/17.
 */
public class ResourceLibrary {

    public final Window APP_WINDOW;
    public final Container APP_CONTAINER;

    public final View ALPHABET_SUMMARY;
    public final View TRANSITION_TABLE;
    public final View STRING_VALIDATION;

    public ResourceLibrary() {
        APP_CONTAINER = new Container("/com/automata/application/views/AppContainer.fxml", "Autómata");
        APP_WINDOW = new Window(APP_CONTAINER);

        ALPHABET_SUMMARY = new View("/com/automata/application/views/AlphabetSummaryView.fxml", "Alfabeto");
        TRANSITION_TABLE = new View("/com/automata/application/views/StateTransitionTableView.fxml", "Tabla de transiciones");
        STRING_VALIDATION = new View("/com/automata/application/views/StringsRunValidationView.fxml", "Validación de cadenas");
    }

}
