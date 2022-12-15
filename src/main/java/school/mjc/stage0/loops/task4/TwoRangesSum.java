package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int countSum =0;
        if(lastInRow<0) {
            System.out.println("last number in row is negative");
        }
        for (int i =0; i<=lastInRow; i++){
            if(lastInRow<numberToSkip){
                System.out.println("number to skip is bugger then the last");
                break;
            }
            if(i<=numberToSkip){
                skippedSum += i;
                continue;
            }
            countSum += i;
        }
        if(skippedSum>0 || countSum>0) {
            System.out.println("skipped sum is " + skippedSum + "\ncounted sum is " + countSum);
        }
    }
}
