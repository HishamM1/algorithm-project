import java.util.TreeMap;

public class schedule {

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
    