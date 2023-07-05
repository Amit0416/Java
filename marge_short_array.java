


public class marge_short_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start merging from the end of the merged array
        int index1 = m - 1;
        int index2 = n - 1;
        int mergedIndex = m + n - 1;

        // Merge the arrays until one of them is fully processed
        while (index1 >= 0 && index2 >= 0) {
            // Compare the elements from the end of each array and place the larger element in the merged array
            if (nums1[index1] > nums2[index2]) {
                nums1[mergedIndex] = nums1[index1];
                index1--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }

        // If there are any remaining elements in nums2, copy them to nums1
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
