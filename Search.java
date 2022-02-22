class Search {

    // traverses the entire array and checks for the target element. O(n) run time complexity
    boolean linearSearch(int[] num, int target) {
        for (int n : num) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }

    //O(log n) run time complexity
    boolean binarySearch(int[] nums, int target) {

        boolean b = binarySearchHelper(nums, 0, nums.length - 1, target);
        return b;
    }

    boolean binarySearchHelper(int[] nums, int start, int end, int target) {

        if (end >= start) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                return binarySearchHelper(nums, start, mid - 1, target);
            } else if (nums[mid] < target) {
                return binarySearchHelper(nums, mid + 1, end, target);
            }
        }

        return false;
    }
}
