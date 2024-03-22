import java.util.Scanner;

public class Calculator2
 {
    public static void main(String args[]) 
	{
    int num1, num2, result, choice;
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
   
        num1=sc.nextInt();
        num2=sc.nextInt();
    
     Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your Choice");

        choice=sc1.nextInt();
    
    switch (choice)
    {
        case 1:
        result=num1+num2;
        System.out.println("Addition Is" + " " + result);
        break;
        
        case 2:
        result=num1-num2;
        System.out.println("Substraction Is" + " " + result);
        break;

        case 3:
        result=num1*num2;
        System.out.println("Multiplication Is" + " " + result);
        break;

        case 4:
        result=num1/num2;
        System.out.println("Division Is" + " " + result);
        break;

        default:
        System.out.println("Default Case" );
            break;
    }
}
}
