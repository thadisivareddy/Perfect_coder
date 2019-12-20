//WAJP to read 3 digit number from the user and check it is armstrong number or not//
import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    int sum=0,temp=n;
    do{
        int r=n%10;
        sum=sum+r*r*r;
        n=n/10;
    }while(n!=0);
    if (temp==sum)
    System.out.println("Given number is Armstrong");
    else
    System.out.println("Given number is Not Armstrong");
   }
}