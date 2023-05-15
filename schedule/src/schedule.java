import java.util.TreeMap;

public class schedule {

    public static void main(String[] args) {
        // Jobs are represented as (start_time, end_time, profit)
        int[][] jobs = {{1, 6, 6}, {2, 5, 5}, {5, 7, 5}, {6, 8, 3}};
        
        int maxProfit = jobScheduling(jobs);

        System.out.println("Maximum profit: " + maxProfit);
    }

    public static void jobsIteration(int[][] jobs, TreeMap<Integer, Integer> dp) {
        // Iterate through each job
        for (int[] job : jobs) {
            // Adding the job's profit to the maximum profit achieved by completing previous jobs with earlier deadlines.
            int current_profit = job[2] + dp.floorEntry(job[0]).getValue();
            // Check if the current profit is greater than the maximum profit achieved so far
            if (current_profit > dp.lastEntry().getValue()) {
                // If yes, then add the current profit to the dp
                dp.put(job[1], current_profit);
            }
        }
    }

    public static int jobScheduling(int[][] jobs) {
        // using merge sort to sort the jobs by end time
        sortJobsByFinishTime(jobs, 0, jobs.length - 1);

        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);

        jobsIteration(jobs, dp);

        // returning the last value for max profit which is the highest value
        return dp.lastEntry().getValue();
    }


    public static void sortJobsByFinishTime(int[][] jobs, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            sortJobsByFinishTime(jobs, start, mid);
            sortJobsByFinishTime(jobs, mid + 1, end);

            mergeJobsByFinishTime(jobs, start, mid, end);
        }
    }

    public static void mergeJobsByFinishTime(int[][] jobs, int start, int mid, int end) {
        int[][] temp = new int[jobs.length][3];
        int i = start, j = mid + 1, k = start;

        while (i <= mid && j <= end) {
            if (jobs[i][1] <= jobs[j][1]) {
                temp[k++] = jobs[i++];
            } else {
                temp[k++] = jobs[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = jobs[i++];
        }

        while (j <= end) {
            temp[k++] = jobs[j++];
        }

        for (int l = start; l <= end; l++) {
            jobs[l] = temp[l];
        }
    }
}
    