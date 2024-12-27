public class remove {
    public static int removes(int[]nums){
        int j=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,3,4,1};
        System.out.println(removes(nums));
    }
}
