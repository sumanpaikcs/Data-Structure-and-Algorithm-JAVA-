package Basic;
public class variables {
    public static void main(String[] args) {
        
        String name = "Suman Paik";
        System.out.println(name);

        int myInt = 37;
        System.out.println(myInt);

        final int num = 34;
        // num = 23;
        System.out.println(num);
        // Here now you can't change the integer. the value of int is fix 
        // variables.java:11: error: cannot assign a value to final variable num
        // num = 23;
        // ^
        // 1 error


        float myFloat = 23.34f;
        System.out.println(myFloat);
        float myFloat2 = 23e5f;     // e3 is basically says the power of 10 that means e3 = 000 / 23e3 = 23000
        System.out.println(myFloat2);   
       
        char letter = 'd';
        System.out.println(letter);

        boolean bool = true;
        System.out.println(bool);











        // declared multiple variables

        int a, b, c;
        a = b = c = 20;
        System.out.println(a+b+c);
        
        int e = 1, f = 2, g = 3;
        System.out.println(e+f+g);





// byte	1 byte	Stores whole numbers from -128 to 127
// short	2 bytes	Stores whole numbers from -32,768 to 32,767
// int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
// boolean	1 bit	Stores true or false values
// char	2 bytes	Stores a single character/letter or ASCII values



        // Length in string

        String str = " This is my JAVA practice.";
        System.out.println("The length is : " + str.length());
        System.out.println(str);

        //Uppercase and lowercase convert

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    }
}
