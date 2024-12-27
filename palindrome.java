public class palindrome {
    public static boolean ispalindrome(int x){
        int number = x;
        int result= 0;
        if (number<0) {
            return false;
        }
       while (number>0) {
        int remainder = number%10;    
        result = result *10 + remainder;
        number /=10;
       } 
       if (result == x|| x==0) {
        return true;
       }
        
        return false;
    }
    public static void main(String[] args) {
        int x = 0;
        System.out.println(ispalindrome(x));
        
    }
}
