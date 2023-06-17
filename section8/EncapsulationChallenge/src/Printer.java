public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int totalTonerAmount = tonerLevel + tonerAmount;
        if (totalTonerAmount > 100 || totalTonerAmount < 0) return -1;
        this.tonerLevel = totalTonerAmount;
        return totalTonerAmount;
    }

    public int printPages(int pages) {
        int jobPages = duplex ? pages / 2 + pages % 2 : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
