import model.Interval;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Program program = new Program();

        List<Interval> intervalList = List.of(
                new Interval(1,4),
                new Interval(3,6),
                new Interval(7,9)
        );

        program.getDisjoinIntervals(intervalList);
    }
}
