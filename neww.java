import java.util.*;

public class neww {
    public static void main(STirngs args[]) {
        System.out.println("enter what do uh want");
        Scanner sc = new Scanner(System.in);
        int str = sc.nextLine();
        System.out.println(str);
        System.out.println("scanig the input");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        
        switch (str) {
            case 'add':
                result = num1 + num2;
                break;
            case 'sub':
                result = num1 - num2;
                break;
            case 'mul':
                result = num1 * num2;
                break;
            case 'div':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error:due TO Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
    }

}
}
