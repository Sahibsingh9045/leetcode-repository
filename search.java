public class search {
    public static int index(int array[] ,int target){

        for (int i = 0; i < array.length; i++) {
            if (target== array[i]) {
                return i;
            }
            else{
                if (target<array[i]) {
                    return i;
                }
                else{
                    return array.length;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int array[]= {10,20,30,40,50,60,70};
        int target = 60;
        System.out.println(index(array,target));
    }
}
