//Find the Winner of an Array Game


class Solution {
    public int getWinner(int[] arr, int k) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        int winCount = 0;
        int currentWinner = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(currentWinner > arr[i]) {
                winCount++;
            } else {
                winCount = 1;
                currentWinner = arr[i];
            }
            if(winCount == k) {
                return currentWinner;
            }
        }
        return currentWinner;
    }
}

// House Robber

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        int[] dp = new int[nums.length];
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        
        int skip = 0;
        int choose = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            int prevSkip = skip;
            skip = Math.max(skip,choose);
            choose = prevSkip + nums[i];
        }
        return Math.max(skip, choose);
    }
}