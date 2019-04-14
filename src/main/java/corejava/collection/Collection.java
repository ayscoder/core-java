package corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Collection {

    private Collection() {
    }

    public static void sortMapByValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Add entry to LinkedHashMap
        Map<Integer, String> map2 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            map2.put(entry.getKey(), entry.getValue());
        }

        System.out.println(map2);
    }

    public static void sortMapByValueJava8() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort((o1,o2)->o2.getValue().compareTo(o1.getValue()));
        // Add entry to LinkedHashMap
        Map<Integer, String> map2 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            map2.put(entry.getKey(), entry.getValue());
        }

        System.out.println(map2);
    }


    public static void main(String[] args) {
        sortMapByValueJava8();
    }
}
