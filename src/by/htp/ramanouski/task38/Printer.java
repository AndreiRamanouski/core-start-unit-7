package by.htp.ramanouski.task38;

public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 || tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages / 2;
        if (duplex) {
            pagesPrinted+=pagesToPrint;
            return pagesToPrint;
        }
        else {return -1;}


    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount > 100) {
            return -1;
        } else {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            } else {
                return tonerLevel += tonerAmount;
            }
        }

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
