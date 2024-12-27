public class find {
    public static int finds(int[] array ,int target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int target = 2;
        System.out.println(finds(array,target));
        
    }
}
