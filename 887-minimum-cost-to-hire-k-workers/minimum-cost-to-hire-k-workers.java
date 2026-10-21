
import java.util.*;

class Worker {
    double baseWage;
    int quality;

    Worker(double baseWage, int quality) {
        this.baseWage = baseWage;
        this.quality = quality;
    }
}

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        ArrayList<Worker> list = new ArrayList<>();
        int n = quality.length;

        for (int i = 0; i < n; i++) {
            double baseWage = 1.0 * wage[i] / quality[i];
            list.add(new Worker(baseWage, quality[i]));
        }

        Collections.sort(list, new Comparator<Worker>() {
            public int compare(Worker w1, Worker w2) {
                return Double.compare(w1.baseWage, w2.baseWage);
            }
        });

        PriorityQueue<Worker> pq = new PriorityQueue<>(
            (w1, w2) -> Integer.compare(w2.quality, w1.quality)
        );

        double ans = Double.MAX_VALUE;
        int totalQuality = 0;

        for (int i = 0; i < n; i++) {
            Worker current = list.get(i);

            pq.offer(current);
            totalQuality += current.quality;

            if (pq.size() > k) {
                totalQuality -= pq.poll().quality;
            }

            if (pq.size() == k) {
                double cost = totalQuality * current.baseWage;
                ans = Math.min(ans, cost);
            }
        }

        return ans;
    }
}
