public class MethodOverloadingjavas {
    static int OverloadMethod(int a, int b){
        return a+b;
    }
    static float OverloadMethod(float a, float b){
        return a+b;

    }

    public static void main(String[] args) {
        int number1 = OverloadMethod(2,4);
        float number2 = OverloadMethod(2.5f,2.5f);
        System.out.println("Number 1 :" + number1);
        System.out.println("Number 2 :" + number2);
    }
}
