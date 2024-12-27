public class remove2 {
    public static int removes(int[]nums,int val){
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!= val) {
                nums[j] = nums[i]; 
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,1,3,4,1,2,3,5};
        

        int val =1;
        System.out.println(removes(nums,val));
    }
}
