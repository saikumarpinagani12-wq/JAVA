import java.util.Scanner;
public class userinput {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        System.out.print("Assign operaion: ");
        char op =sc.next().charAt(0);
        if(op=='+'){
            int sum=a+b;
            System.out.println("Sum is: "+sum);
        }
        else if(op=='-'){
            int sub=a-b;
            System.out.println("Subtraction is: "+sub);
        }
        else if(op=='*'){
            int mul=a*b;
            System.out.println("Multiplication is: "+mul);
        }
        else if(op=='/'){
            float n1=a;
            float n2=b;
            float div=n1/n2;
            System.out.println("Division is: "+div);
        }
        else if(op=='%'){
            int mod=a%b;
            System.out.println("Modulus is: "+mod);
        }
        else{
            System.out.println("Invalid operation");
        }

        
    }
}