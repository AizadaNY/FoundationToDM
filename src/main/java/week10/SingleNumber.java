package week10;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int x : nums){
            answer = answer ^ x;
        }
        return answer;
    }
}
