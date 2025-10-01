package com.satellite;

import java.util.Scanner;
import java.util.logging.Logger;

public class SatelliteCLI {
    private static final Logger logger = Logger.getLogger(SatelliteCLI.class.getName());

    public static void main(String[] args) {
        Satellite satellite = Satellite.getInstance();
        CommandExecutor executor = new CommandExecutor();
        Scanner scanner = new Scanner(System.in);

        logger.info("Satellite Command System Ready.");
        logger.info("Commands: rotate East|West|North|South , activate, deactivate, collect, status, exit");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                logger.info("Exiting Satellite Command System.");
                break;
            } else if (input.equalsIgnoreCase("status")) {
                logger.info(satellite.toString());
                continue;
            }

            try {
                Command command = CommandFactory.getCommand(input, satellite);
                executor.executeCommand(command);
            } catch (Exception e) {
                logger.warning("Invalid input: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
