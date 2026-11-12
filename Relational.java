// Relational operator question.
// Ques-1.Check Wheather Two Numbers are equal or not.
// import java.util.Scanner;
// public class Relational  {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two number:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("Both number are equal");
// }else{
//     System.out.println("Both number are not equal");
// }
//    }
    //  }
// Ques-2.Find which number is greater.
// import java.util.Scanner;
// public class Relational {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter two number:");
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//         if(a>b){
//             System.out.println(a +"is greater");
//       }else if(b>a){
//         System.out.println(b + "is greater");
//       }else{
//         System.out.println("Both number are equal");
//       }
//     }
// }
//  Ques-3.Check Wheather a Number is greater than 100.
// import java.util.Scanner;
// public class Relational {
//      public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         if(n>100){
//             System.out.println("Number is greter than 100");
//         }else if(n<100){
//             System.out.println("Number is smaller than 100");
//         }
//      }

// }
// Ques 4.Check wheather a number is positive,Negative or Zero.
// import java.util.Scanner;
// public class Relational {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         if(n>0){
//             System.out.println("Positive");

//         }else if(n<0){
//             System.out.println("Negative");
//         }else{
//             System.out.println("Zero");
//         }
//     }
// }
// Ques-5.Check Voting Eligibity.
// import java.util.Scanner;
// public class Relational {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age:");
//         int age = sc.nextInt();
//         if(age>=18){
//             System.out.println("Eligibility to vote");

//         }else{
//             System.out.println("Not eligible to vote ");
//         }
//     }
// }
// Ques-6. Check wheather a student has passed or failed.
// import java.util.Scanner;
// public class Relational {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter marks:");
//         int marks = sc.nextInt();
//         if(marks>=40){
//             System.out.println("Passed");
//         }else{
//             System.out.println("Failed");
//         }
//     }
// }
// Ques-7.Find the Largest of Three Numbers.
// import java.util.Scanner;
// public class Relational {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter three numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if(a>=b && a>=c){
//             System.out.println(a+"is the largest");

//         }else if(b>=a && b>=c){
//             System.out.println(b+"is the largest");
//         }else{
//             System.out.println(c+"is the largest");
//         }
//     }
// }
// Ques 8.Find the smallest of three number.
import java.util.Scanner;
public class Relational {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<=b && a<=c){
            System.out.println(a+"is the smallest");

        }else if(b<=a && b<=c){
            System.out.println(b+"is the smallest");
        }else{
            System.out.println(c+"is the smallest");
        }
    }
}

