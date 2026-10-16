// Ques--Circle area and circumference
// import java.util.Scanner;
// public class practiceQ{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the radius");
//         double r = sc.nextDouble();
//         double area =3.14*r*r;
//         double circumference =2*3.14*area;
//         System.out.println("Area="+area);
//         System.out.println("circumference="+circumference);
//         sc.close();


//     }
// }
// Ques-2.Calculate the Simple Interest.
// import java.util.Scanner;
// public class practiceQ{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Principale:");
//         double p = sc.nextDouble();
//         System.out.println("Enter the rate:");
//         double r =sc.nextDouble();
//         System.out.println("Enter the time:");
//         double t =sc.nextDouble();
//         double si =(p*r*t)/100;
//         System.out.println("Simple Interest="+si);
//         sc.close();
//  }
// }
// Ques-3.User give the five subject marks and total marks and their average find.
// import java.util.Scanner;
// public class practiceQ{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter five subject marks:");
//         System.out.println("Enter the number of Math marks");
//         int Math =sc.nextInt();
//         System.out.println("Enter the number of Hindi marks");
//         int Hindi =sc.nextInt();
//         System.out.println("Enter the number of English marks");
//         int English =sc.nextInt();
//         System.out.println("Enter the number of Physics marks");
//         int Physics=sc.nextInt();
//         System.out.println("Enter the number of Chemistry marks");
//         int Chemistry =sc.nextInt();
//         int Total = Math+Hindi+English+Physics+Chemistry;
//         double average=Total/5.0;
//         System.out.println("Total = " +Total);
//          System.out.println("Average= " +average);
//          sc.close();
        

//     }
// }
// Ques-4.Write a java program to input a three-digit number and calculate the sum of its digits withoute using a loop.
import java.util.Scanner;
public class practiceQ{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a =n/100;
        int b =(n/10)%10;
        int c =n%10;
        System.out.println("Sum of digits ="+(a+b+c));
        sc.close();
        
    }
}
