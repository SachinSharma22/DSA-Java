import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {

    public static void main(String[] args) {
        Integer[] coin = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coin, Comparator.reverseOrder());

        int countsOfCoin = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coin.length; i++) {
            if(coin[i] <= amount) {
                while (coin[i] <= amount) {
                    countsOfCoin++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }
        }

        System.out.println("Total min counts of coin is = " + countsOfCoin);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}