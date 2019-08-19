package model;

public class Interval implements Comparable{

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

    @Override
    public int compareTo(Object o) {
        int compareResult = this.fromNumber - ((Interval) o).fromNumber;
        if(compareResult == 0)
            compareResult = this.toNumber - ((Interval) o).toNumber;
        return compareResult;
    }
}
