class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] ans = {-1, -1};

        //Check for first occurrence of target first
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
        ans[1] = search(nums, target, false);
        }
        return ans;
    }

     //This function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}