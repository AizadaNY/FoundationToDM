package week16;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] numbers = {99, 100, 4, 200, 1, 3, 2};
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }
        int longest_streak = 0;
        for (int number : set){

            if(!set.contains(number - 1)){
                int streak_start = number;
                int streak_end = number;

                while (set.contains(streak_end + 1)){
                    streak_end++;
                }
               longest_streak = Math.max(longest_streak, (streak_end-streak_start + 1 ));
            }
        }

    }
}
