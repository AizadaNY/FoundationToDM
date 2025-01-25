package week14;

public class SortColor {
    public void sortColors(int[] nums) {
        int zeroPosition = 0;
        int twoPosition = nums.length-1;
        int i = 0;
        while(i<=twoPosition){
            if(nums[i]==0){
                swap(nums,zeroPosition,i);
                zeroPosition++;
                i++;
            }else if(nums[i]==1){
                i++;
            }else{
                swap(nums,i,twoPosition);
                twoPosition--;
            }
        }

    }

    public void swap(int[]nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
