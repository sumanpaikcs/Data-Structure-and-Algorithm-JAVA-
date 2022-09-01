public class ScopingINJava {

    public static void main(String[] args) {

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int a = 100;

            // Code here CAN use x
            System.out.println(a);

        } // The block ends here

        // Code here CANNOT use x
        System.out.println(a);    /// here a can't be accessable.
    }
}
