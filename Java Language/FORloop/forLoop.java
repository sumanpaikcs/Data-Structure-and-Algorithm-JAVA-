package FORloop;
public class forLoop {

    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // }
        for (int e = 0; e <= 10; e = e + 2) {
            System.out.println(e);
        }

        // for each loop

        // for (type variableName : arrayName) {
            // code block to be executed
        //   }

        String[] count = { "one", "two", "three", "four", "five"};
        for (String a : count) {
            System.out.println(a);
            
        }

        // break; and continue;
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          }


        for (int g = 0; g < 10; g++) {
            if (g == 4) {
              break;
            }
            System.out.println(g);
          }



    }
}