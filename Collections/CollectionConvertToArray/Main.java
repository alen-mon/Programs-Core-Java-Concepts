
import java.util.*;

 class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    List<String> list = new ArrayList<String>();
    System.out.println("Enter the elements of the list (Enter 'done' to finish):");
    while (true) {
        String input = sc.nextLine();
        if (input.equals("done")) {
            break;
        }
        list.add(input);
    }

    String[] s1 = list.toArray(new String[0]);
    System.out.println("Printing out the converted Array");
    for (int i = 0; i < s1.length; ++i) {
        String contents = s1[i];
        
        System.out.print(contents+"-");
    }

    sc.close();
}
}