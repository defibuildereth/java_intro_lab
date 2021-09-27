public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return this.paper;
    }

    public boolean canPrint(int sheetsRequired) {
        return sheetsRequired <= this.paper;
    }

    public int sheetsRequired(int i, int i1) {
        return i * i1;
    }

    public int getToner() {
        return this.toner;
    }

    public void reduceToner(int amount) {
        this.toner -= amount;
    }
}
