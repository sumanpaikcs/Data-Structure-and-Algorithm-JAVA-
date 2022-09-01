
public class javaMethodFunctionpass {
    
    static void condfunc(int a){
        if (a<20) {
            System.out.println("you are not eligible");
        }
        else{
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        condfunc(12);
    }
}
