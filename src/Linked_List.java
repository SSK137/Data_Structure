import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List");
        Scanner scanner = new Scanner(System.in);
        int ans;
        Function_Call functionCall = new Function_Call();
        Operations oprations = new Operations();
        do {
            System.out.println("Enter a No For Edit the Details");
            System.out.println("""
                     1 =  Adding The data\s
                     2 = Appending The Data\s
                     3 = Insert In Between \s
                    """);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    functionCall.adding();
                    oprations.print();
                    break;
                case 2:
                    functionCall.appending();
                    oprations.print();
                    break;
                case 3:
                    functionCall.InBetween();
                    break;
                default:
                    System.out.println("Enter Correct choice");
            }
            System.out.println("\n Do You Want To continue.. If Yes The Press '1' else print 2 for exit");
            ans = scanner.nextInt();
        } while (ans == 1);
    }
}
