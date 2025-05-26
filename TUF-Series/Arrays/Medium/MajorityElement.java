//Boyre Moore's Voting Algorthim
class Solution {
    public int majorityElement(int[] nums) {
       //Applying Moore's Voting  Algorthim
       
       int count =0;
       int element=0;
       for(int i=0 ;i<nums.length;i++){
        if(count==0){
            element =nums[i];
            count++;

        }else if(count!=0 && element==nums[i]){
            count++;
        }else if(count !=0 && element!=nums[i]){
            count--;
        }
       }
       return element;
    }
}
