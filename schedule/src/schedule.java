import java.util.TreeMap;

public class schedule {


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
    