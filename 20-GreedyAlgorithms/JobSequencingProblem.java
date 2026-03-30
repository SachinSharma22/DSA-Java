import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {
    static class Job {
        int deadline;
        int profit;
        int id;
        public Job (int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        // (a,b) -> a.profit-b.profit this syntex is used to sort any object in ascending order
        Collections.sort(jobs,(a,b) -> b.profit-a.profit); //descending order or profits

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max job = "+ seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}