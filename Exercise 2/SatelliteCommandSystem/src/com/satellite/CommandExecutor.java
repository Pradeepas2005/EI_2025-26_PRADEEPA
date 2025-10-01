package com.satellite;

import java.util.logging.Logger;

// Invoker
public class CommandExecutor {
    private static final Logger logger = Logger.getLogger(CommandExecutor.class.getName());

    public void executeCommand(Command command) {
        try {
            command.execute();
        } catch (Exception e) {
            logger.severe("Error executing command: " + e.getMessage());
        }
    }
}
