package sample;

import java.util.IntSummaryStatistics;

/**
 * Created by yaohu on 8/8/14.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourSelf(String userGuess){
        int guess = Integer.parseInt(userGuess);
        String result = "miss";
        for(int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }

        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
