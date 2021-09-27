public class Printer {
    private int paper;

    public Printer(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return this.paper;
    }

    public boolean canPrint(int sheetsRequired) {
        return sheetsRequired <= this.paper;
    }
}
