import java.util.Arrays;
import java.util.Comparator;

public class MaxLenChainOfPair {
/*You are given n pairs of numbers. In everyy pair, the first number is always smaller than the second number. A pair (c,d) can come after pair (a,b) if b <c. Find the largest chain which can be formed from a given set of pairs. */
    public static void main(String[] args) {
        int [][] pairs = {{5,24},{39,60},{39,60},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; //Last Selected pair end / chain end
        
        for (int i = 0; i < pairs.length; i++) {
            if(pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Maximum length of the chain = " + chainLen);
    }
}