import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Integer a = 10;
        testInteger(a);
        System.out.println(a);

        String str = "First";
        testString(str);
        System.out.println(str);

        mod(3, 2);
        mod(3, 4);
        add(3, 4);
        arrayList();
        hashMapList();
    }

    public static void hashMapList() {
        HashMap<Integer, String> list = new HashMap<Integer, String>();
        list.put(1, "First value");
        list.put(2, "Second value");
        list.put(3, "Third value");
        System.out.println("list size=" + list.size());
        for (String i : list.values()) {
            System.out.println(i);
        }
        System.out.println("    ");
        System.out.println(list);
    }

    public static void arrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1, 20);
        System.out.println("list size=" + list.size());
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("    ");
        System.out.println(list);
    }

    public static void add(int x, int y) {
        System.out.printf("mod %1$d+%2$d=%3$f\n", x, y, (double) (x + y));
    }

    public static void mod(int x, int y) {
        System.out.printf("mod %1$d/%2$d=%3$d\n", x, y, x % y);
    }

    public static void testString(String st) {
        st = st + "ssss";
    }

    public static void testInteger(Integer i) {
        i = i + 10;
    }
}
