public class RECURSION{
    static int sum(int a){
        if (a>0) {
            return a + sum(a-1);
        } else {
          return 0;  
        }


    }
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

        int between = betweenSum(5, 10);
        System.out.println(between);
    }


    static int betweenSum(int start, int end){
        if (end > start) {
            return end + betweenSum(start, end - 1);
            
        } else {
            return start;
        }
    }

}

