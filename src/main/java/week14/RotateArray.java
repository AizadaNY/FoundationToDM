package week14;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] arr, int start , int end){
        if(arr.length>=2){
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    }
}
