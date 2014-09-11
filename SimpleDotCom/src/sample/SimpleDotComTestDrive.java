package sample;

/**
 * Created by yaohu on 8/9/14.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args){
        String userGuess = "2";
        int[] locs = {2,3,4};
        SimpleDotCom dot = new SimpleDotCom();
        dot.setLocationCells(locs);
        String result = dot.checkYourSelf(userGuess);
        String gameResult = "failed";

        if(result.equals("hit")){
            gameResult = "Passed";
        }
        System.out.print("Game result is " + gameResult);

    }

}
