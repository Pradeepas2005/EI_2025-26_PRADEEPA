package com.satellite;

public class CommandFactory {

    public static Command getCommand(String input, Satellite satellite) {
        String[] parts = input.trim().split("\\s+");
        String cmd = parts[0].toLowerCase();

        if (cmd.equals("rotate")) {
            if (parts.length < 2) {
                throw new IllegalArgumentException("Rotate command requires a direction (North/South/East/West).");
            }
            return new RotateCommand(satellite, parts[1]);
        } else if (cmd.equals("activate")) {
            return new ActivatePanelsCommand(satellite);
        } else if (cmd.equals("deactivate")) {
            return new DeactivatePanelsCommand(satellite);
        } else if (cmd.equals("collect")) {
            return new CollectDataCommand(satellite);
        } else {
            throw new IllegalArgumentException("Unknown command: " + input);
        }
    }
}
