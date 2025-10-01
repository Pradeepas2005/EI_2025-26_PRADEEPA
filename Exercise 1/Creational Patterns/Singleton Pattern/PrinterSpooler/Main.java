public class Main {
    public static void main(String[] args) {
        PrinterSpooler spooler1 = PrinterSpooler.getInstance();
        PrinterSpooler spooler2 = PrinterSpooler.getInstance();

        System.out.println(spooler1 == spooler2);

        spooler1.printDocument("Report.pdf");
        spooler2.printDocument("Invoice.docx");
    }
}
