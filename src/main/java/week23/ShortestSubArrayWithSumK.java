package week23;

public class ShortestSubArrayWithSumK {

    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;
        int res = n + 1;

        long[] B = new long[n + 1];

        for(int i = 0; i < n; i++){
            B[i + 1] = B[i] + nums[i];
        }

        Deque<Integer> d = new ArrayDeque<>();

        for(int i = 0; i < n + 1; i++){
            while(d.size() > 0 && B[i] - B[d.getFirst()] >= k){
                res = Math.min(res, i - d.pollFirst());
            }

            while(d.size() > 0 && B[i] <= B[d.getLast()]){
                d.pollLast();
            }

            d.addLast(i);

        }

        return res <= n ? res: -1;
    }
}
