import java.util.*;

enum Status {
    // 0          1        2       3
    Running, Failed, Pending, Success;    // objects of Status class
}

public class Enums {
    public static void main(String[] args) {
        Status s = Status.Success;
        // System.out.println(s.ordinal());

        Status[] ss = Status.values();
        System.out.println(Arrays.toString(ss));
    }
}