package week16;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            if (lastSeen.containsKey(r)) {
                return new int[]{lastSeen.get(r), i};
            }
            lastSeen.put(nums[i], i);

        }
        return new int[]{};
    }
}
