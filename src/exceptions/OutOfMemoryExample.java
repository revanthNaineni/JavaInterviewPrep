package exceptions;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            list.add(new String("OutOfMemoryError"));
        }
    }
}
