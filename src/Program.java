import model.Interval;

import java.util.List;
import java.util.stream.Collectors;

public class Program {

    private List<Interval> sortIntervalList(List<Interval> intervalList){
        return intervalList.stream().sorted().collect(Collectors.toList());
    }

    private int getJoinIntervals(List<Interval> intervalList){
        int counter = 0;
        for(int i = 0 ; i < intervalList.size()-1; i++){
            for (int j = i+1; j < intervalList.size(); j++){
                Interval intervalA = intervalList.get(i);
                Interval intervalB = intervalList.get(j);
                if(intervalA.getFromNumber() < intervalB.getFromNumber()
                        &&  intervalB.getFromNumber() < intervalA.getToNumber()
                        &&  intervalA.getToNumber() < intervalB.getToNumber())
                    counter++;
                else if(intervalA.getFromNumber() < intervalB.getFromNumber()
                        &&  intervalB.getToNumber() < intervalA.getToNumber())
                    counter++;
            }
        }
        return counter;
    }

    public int getDisjoinIntervals(List<Interval> intervalList) {
        List<Interval> sortedIntervalList = sortIntervalList(intervalList);

        int joinIntervalsNumber = getJoinIntervals(sortedIntervalList);

        return sortedIntervalList.size() - joinIntervalsNumber;
    }
}
