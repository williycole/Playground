package CompEncapPolymorph.Encap;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {

        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((tonerLevel + tonerAmount) > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {

        int pagesToPrint = pages;

        if (duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
