public class PrinterSpooler {
    private static PrinterSpooler instance;

    private PrinterSpooler() {
        System.out.println("Printer Spooler initialized.");
    }

    public static synchronized PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}
