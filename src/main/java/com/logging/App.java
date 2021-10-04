package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        String nombre = " Noe Ramirez";
        slf4jLogger.debug("Ejecucion correcta del usuario" + nombre);
        slf4jLogger.info("EL programa esta en ejecucion .");
        slf4jLogger.warn("Posible sobrecarga en el sistema.");
        slf4jLogger.error("Error del sistema, se reiniciara la aplicacion.");

    }
}
