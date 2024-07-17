class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
         int end = arr.length - 1;

         while(start < end){
             int mid = start + (end - start) / 2;

             if(arr[mid] > arr[mid + 1]){
                 // you are in the decreasing part of the array
                 // this may be the ans, but look at left
                 // this is why end != mid - 1
                 end = mid;
             } else{
                 // you are in the ascending part of the array
                 start = mid + 1; // because we know that mid + 1 element > mid element
             }
         }
         // In the end, start ==  end and pointing to the largest number because of the 2 checks above
        // start and end are always try to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max on because that is what the checks say
        // more elaboration:  at every point of time at start and end, they have the best possible answer till that time
        // and if we are saying that only one time is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}