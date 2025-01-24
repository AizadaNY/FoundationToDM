package week10;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int result = 0;
        for(int i = 0; i<=30; i++){
            int bitmask = 1 << i;

            if((n & bitmask)>0){
                result++;
            }
        }
        return result;
    }
}
