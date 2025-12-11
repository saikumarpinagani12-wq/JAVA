public class sumofnumberusingrecursion {
    public static void main(String[] args) {
        int number=10;
        int result=sum(number);
        System.out.println("Sum of first "+number+" natural numbers is: "+result);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }
    
}
