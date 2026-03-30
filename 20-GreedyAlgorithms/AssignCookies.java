import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren (int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i<g[i] && j<s[i]) {
            if(s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int [] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }
}