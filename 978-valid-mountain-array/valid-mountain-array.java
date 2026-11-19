class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int start = 0;
        int end = n - 1;

        while (start < n - 1 && arr[start] < arr[start + 1]) {
            start++;
        }

        while (end > 0 && arr[end] < arr[end - 1]) {
            end--;
        }

        return start == end && start != 0 && end != n - 1;
    }
}