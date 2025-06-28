package week23;

import java.util.Deque;
import java.util.LinkedList;

public class LongestSubArray {

    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < nums.length; right++){

            while(!maxDeque.isEmpty() && maxDeque.peekLast() < nums[right]) maxDeque.pollLast();
            while(!minDeque.isEmpty() && minDeque.peekLast() > nums[right]) minDeque.pollLast();

            maxDeque.offerLast(nums[right]);
            minDeque.offerLast(nums[right]);

            while(maxDeque.peekFirst() - minDeque.peekFirst() > limit){

                if(maxDeque.peekFirst() == nums[left]) maxDeque.pollFirst();
                if(minDeque.peekFirst() == nums[left]) minDeque.pollFirst();
                ++left;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
