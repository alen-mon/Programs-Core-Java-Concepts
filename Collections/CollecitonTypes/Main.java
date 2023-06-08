import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean running = true;
    while (running) {
        System.out.println("Select a collection to display:");
        System.out.println("1. LinkedList");
        System.out.println("2. ArrayList");
        System.out.println("3. HashSet");
        System.out.println("4. TreeSet");
        System.out.println("5. LinkedHashSet");
        System.out.println("6. HashMap keys");
        System.out.println("7. HashMap values");
        System.out.println("8. TreeMap keys");
        System.out.println("9. TreeMap values");
        System.out.println("10. LinkedHashMap keys");
        System.out.println("11. LinkedHashMap values");
        System.out.println("12. Exit");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                List<String> lnkLst = new LinkedList<>();
                lnkLst.add("element1");
                lnkLst.add("element2");
                lnkLst.add("element3");
                lnkLst.add("element4");
                displayAll(lnkLst);
                break;
            case 2:
                List<String> aryLst = new ArrayList<>();
                aryLst.add("x");
                aryLst.add("y");
                aryLst.add("z");
                aryLst.add("w");
                displayAll(aryLst);
                break;
            case 3:
                Set<String> hashSet = new HashSet<>();
                hashSet.add("set1");
                hashSet.add("set2");
                hashSet.add("set3");
                hashSet.add("set4");
                displayAll(hashSet);
                break;
            case 4:
                Set<String> treeSet = new TreeSet<>();
                treeSet.add("1");
                treeSet.add("2");
                treeSet.add("3");
                treeSet.add("4");
                displayAll(treeSet);
                break;
            case 5:
                Set<String> lnkHashset = new LinkedHashSet<>();
                lnkHashset.add("one");
                lnkHashset.add("two");
                lnkHashset.add("three");
                lnkHashset.add("four");
                displayAll(lnkHashset);
                break;
            case 6:
                Map<String, String> map1 = new HashMap<>();
                map1.put("key1", "J");
                map1.put("key2", "K");
                map1.put("key3", "L");
                map1.put("key4", "M");
                displayAll(map1.keySet());
                break;
            case 7:
                Map<String, String> map2 = new HashMap<>();
                map2.put("key1", "J");
                map2.put("key2", "K");
                map2.put("key3", "L");
                map2.put("key4", "M");
                displayAll(map2.values());
                break;
            case 8:
                SortedMap<String, String> map3 = new TreeMap<>();
                map3.put("key1", "JJ");
                map3.put("key2", "KK");
                map3.put("key3", "LL");
                map3.put("key4", "MM");
                displayAll(map3.keySet());
                break;
            case 9:
                SortedMap<String, String> map4 = new TreeMap<>();
                map4.put("key1", "JJ");
                map4.put("key2", "KK");
                map4.put("key3", "LL");
                map4.put("key4", "MM");
                displayAll(map4.values());
                break;
            case 10:
                LinkedHashMap<String, String> map5 = new LinkedHashMap<>();
                map5.put("key1", "JJJ");
                map5.put("key2", "KKK");
                map5.put("key3", "LLL");
                map5.put("key4", "MMM");
                displayAll(map5.keySet());
                break;
            case 11:
                LinkedHashMap<String, String> map6 = new LinkedHashMap<>();
                map6.put("key1", "JJJ");
                map6.put("key2", "KKK");
                map6.put("key3", "LLL");
                map6.put("key4", "MMM");
                displayAll(map6.values());
                break;
            case 12:
                running = false;
                break;
            default:
                System.out.println("Invalid choice");
                break;
            }
            }
    sc.close();
}

static void displayAll(Collection<String> col) {
    for (String str : col) {
        System.out.print(str + " ");
    }
    System.out.println();
}
}