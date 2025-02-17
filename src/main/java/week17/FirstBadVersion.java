package week17;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int answer = -1;
        while(left <= right){
            int middle = left +(right - left) /2;
            if(!isBadVersion(middle)){
                left = middle + 1;
            }else {
                answer = middle;
                right = middle - 1;
            }
        }
        return answer;
    }

    private boolean isBadVersion(int middle) {
        return true;
    }
}
