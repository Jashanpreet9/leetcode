/*Find peak element :
 * A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time...
 */


class Solution2 {
    public int findPeakElement(int[] nums) {
     int s = 0;
      int n = nums.length;
      int e =n-1;
      int mid =0;
      if( n ==1) return 0;
      while(s<= e){
        mid = s+(e-s)/2;
        if( mid+1 > n-1|| nums[mid+1]<nums[mid] ){
            if(mid-1 < 0|| nums[mid-1]<nums[mid]){
                return mid;}
                else e = mid-1;
        }
        else if(mid-1 < 0 || nums[mid-1]<nums[mid]){
            s = mid+1;
        }
        else {
         if(nums[mid-1]> nums[mid+1])
           e = mid -1;
           else s = mid+1;

        }
      }
         return mid;
    }
    }

