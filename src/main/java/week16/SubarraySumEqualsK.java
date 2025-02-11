package week16;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3};
        int k =3;
        int currentPrefixSum = 0;
        int answer = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i =0; i< nums.length ; i++ ){
            currentPrefixSum+= nums[i];

            answer+= map.getOrDefault((currentPrefixSum-k),0);
            map.put(
                    currentPrefixSum,
                    map.getOrDefault(currentPrefixSum,0)+1);
        }
    }

}
