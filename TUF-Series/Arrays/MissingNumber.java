//easy  onr with 100% beats
class Solution {
    public int missingNumber(int[] nums) {
        
        int sum =0;
        int actualSum=0;
      for( int i=0 ; i<nums.length;i++){
        sum+=nums[i];
      }
      for( int i=1 ; i<nums.length+1 ; i++){
        actualSum+=i;
      }
      return actualSum-sum;
    }

}
