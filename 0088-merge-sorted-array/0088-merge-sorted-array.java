class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m-1, tail2 = n-1, position = m+n-1; 
        while (tail2 >= 0) {
            if (tail1 >= 0) {
                nums1[position--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
            } else {
                nums1[position--] = nums2[tail2--];
            }
        }
    }
}