class Solution1 {
  //binary search
  public int singleNonDuplicate(int[] nums) {
     int start = 0;
     int end = nums.length-1;
   
     while(start <= end){
       int mid = start+(end - start)/2;
       if(mid == nums.length-1) return nums[mid];
       if((mid %2 == 0 && nums[mid+1] != nums[mid]) || (mid%2 != 0 && nums[mid -1] !=nums[mid])){
           end = mid-1;
       }
       else start = mid +1;
     }
     return nums[start];
  }
  }