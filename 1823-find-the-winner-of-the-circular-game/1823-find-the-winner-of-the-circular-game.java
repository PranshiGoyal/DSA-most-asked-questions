class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        //O(N)
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        // tc: N + N^2
        // sc: N
        // O(N)
        int index = 0;
        while(list.size() > 1){
            index = (index + (k - 1)) % list.size();
            // O(N)
            list.remove(index);
        }
        return list.get(0);
    }
}