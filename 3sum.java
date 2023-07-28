
class 3sum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDist=Integer.MAX_VALUE;
        int close_sum=0;
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                int dist=Math.abs(target-sum);
                if(sum==target){
                    return sum;
                }
                if(dist<minDist){
                    minDist=dist;
                    close_sum=sum;
                }
                if(sum>target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return close_sum;
    }
}