package week14;

public class SortArrayByParity2 {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while(i < n && j < n){

            while(i < n && nums[i] % 2 == 0){
                i += 2;
            }

            while(j < n && nums[j] % 2 ==1){
                j +=2;
            }

            if(i < n && j < n){
                swap(nums, i , j);
            }
        }

        return nums;

    }

    public void swap(int[] nums , int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
