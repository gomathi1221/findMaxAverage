class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int sum=0;
      for(int i=0;i<k;i++){
        sum+=nums[i];
      }
      int max=sum;
      int c=sum;
      for(int j=k;j<nums.length;j++){
         c=c+nums[j]-nums[j-k];
         max=Math.max(max,c);
      }
      return (double) max/k;
    }
} 