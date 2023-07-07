class sort {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;    // Pointer for 0's
        int mid = 0;    // Pointer for 1's
        int high = n - 1;   // Pointer for 2's
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
