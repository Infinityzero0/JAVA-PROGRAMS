class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> tr = new TreeSet<>();
        for(int i:nums){
            tr.add(i);
        }
        //Integer[] array = treeSet.toArray(new Integer[treeSet.size()]);

        //Integer[] arr = tr.toArray(new Integer[tr.size()]);
         int i = 0;

        for(int ele:tr){
            nums[i++] = ele;
        }
        return tr.size();
    }
}
