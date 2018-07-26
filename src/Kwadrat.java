public class Kwadrat {
    private int bok;
    private int pole;

    public Kwadrat(int bok) {
        this.bok = bok;
        this.pole = bok*bok;

    }

    public Kwadrat(int bok, int pole) {
        this.bok = bok;
        this.pole = pole;
    }

    public int getBok() {
        return this.bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
        this.pole = bok*bok;
    }

    public int getPole() {
        return pole;
    }
}
