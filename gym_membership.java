package javascanner;
import java.util.Scanner;
public class gym_membership {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
        manage_membership();
    }
    public static void manage_membership(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the gym membership management system");
        System.out.println("Enter  user name : " );
        String member_name = sc.nextLine();
        System.out.println("Enter  user Age: " );
        int age  = sc.nextInt();
        System.out.println("is the subscription active? (True/False) : " );
        boolean active = sc.nextBoolean();
        System.out.println("Enter Number of months: " );
        int duration_  = sc.nextInt();
        float price = 1000*duration_;
        System.out.println("User Name : " + member_name);
        System.out.println("User Age : " + age);
        System.out.println("User subscription is Active? : " + active);
        System.out.println("User subscription active for: " + duration_);
        System.out.println("User Price : " + price);
    }
}