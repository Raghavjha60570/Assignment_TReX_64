// this is not my solution i got it one my leetcode compiler i need to know more about this 
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;

        for( int right=0 ; right<nums.length ; right++){
            if(nums[right]!=0){
                int temp= nums[right];
                nums[right]= nums[left];
                nums[left]= temp;
                left++;

            }
        }
    }
}
