package SWITCHcase;

// public class SwtchCase {
    
//     public static void main(String[] args) {
        
//         int day = 4;
// switch (day) {
//   case 1:
//     System.out.println("Monday");
//     break;
//   case 2:
//     System.out.println("Tuesday");
//     break;
//   case 3:
//     System.out.println("Wednesday");
//     break;
//   case 4:
//     System.out.println("Thursday");
//     break;
//   case 5:
//     System.out.println("Friday");
//     break;
//   case 6:
//     System.out.println("Saturday");
//     break;
//   case 7:
//     System.out.println("Sunday");
//     break;
// }
//     }
// }


// The output is Thursday because day = 4 and for that case 4: will consider.

public class SwtchCase{
  public static void main(String[] args){
    int error =403;
    switch (error){
      case 202:
        System.out.println("error 202");
        break;
      case 303:
        System.out.println("error 303");
        break;
      case 404:
        System.out.println("error 404");
        break;
      case 505:
        System.out.println("error 505");
        break;
        default:
        System.out.println("no error");
        // break;    Here does't require break statement;
    }

  }
}