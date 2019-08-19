import model.Interval;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProgramTest {

    Program program;

    @Before
    public void generateProgramInstance(){
        this.program = new Program();
    }

    @Test
    public void getResultWithAllDisjointIntervalsTest(){
        List<Interval> intervalList = List.of(
                new Interval(1,3),
                new Interval(4,6),
                new Interval(7,9)
        );
        int result = program.getDisjoinIntervals(intervalList);
        Assert.assertEquals(3,result);
    }

    @Test
    public void getResultWithTwoDisjointIntervalsTest(){
        List<Interval> intervalList = List.of(
                new Interval(1,4),
                new Interval(3,6),
                new Interval(7,9)
        );
        int result = program.getDisjoinIntervals(intervalList);
        Assert.assertEquals(2,result);
    }

    @Test
    public void getResultWithTwoJointIntervalsTest(){
        List<Interval> intervalList = List.of(
                new Interval(1,8),
                new Interval(4,6),
                new Interval(7,9)
        );
        int result = program.getDisjoinIntervals(intervalList);
        Assert.assertEquals(1,result);
    }

    @Test
    public void getResultWhentIntervalIsInsideAnotherTest(){
        List<Interval> intervalList = List.of(
                new Interval(1,8),
                new Interval(4,6)
        );
        int result = program.getDisjoinIntervals(intervalList);
        Assert.assertEquals(1,result);
    }

    @Test
    public void getResultWhentListIsEmptyTest(){
        List<Interval> intervalList = new ArrayList<>();
        int result = program.getDisjoinIntervals(intervalList);
        Assert.assertEquals(0,result);
    }


}
