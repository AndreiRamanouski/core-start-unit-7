package by.htp.ramanouski.task38;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted + " " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println(pagesPrinted + " " + printer.getPagesPrinted());

    }
}
