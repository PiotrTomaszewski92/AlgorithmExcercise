package model;

public class Interval {

    private int fromNumber;
    private int toNumber;

    public Interval(int fromNumber, int toNumber) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
    }

    public int getFromNumber() {
        return fromNumber;
    }

    public int getToNumber() {
        return toNumber;
    }

    @Override
    public String toString() {
        return "Interval [ " + fromNumber + ", " + toNumber + " ]";
    }
}
