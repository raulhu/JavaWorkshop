package sample;

/**
 * Created by yaohu on 8/9/14.
 */
public class mainGame {
    public static void main(String[] args){
        int numOfGuess = 0;
        int random = (int)(Math.random() * 5);
        int[] locationCell = {random, random+1, random+2};

        GameHelper helper = new GameHelper();
        SimpleDotCom dotCom = new SimpleDotCom();
        dotCom.setLocationCells(locationCell);

        boolean isAlive = true;

        while(isAlive == true){

            String guessResult = dotCom.checkYourSelf(helper.getUserInput("enter a number"));
            numOfGuess++;
            if(guessResult.equals("kill")){
                isAlive = false;

            }
        }
        System.out.print("Number of guess is " + numOfGuess);
    }
}
