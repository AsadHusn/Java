import java.util.Scanner;
class Input{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Square is = " + (n*n));
    }
}