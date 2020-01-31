package com.company_static;
import java.util.HashSet;
import java.util.Set;

public class CollSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>() {
            {
                add("Windows");
                add("Linux");
                add("OS X");
            }
        };

        for (String str : set) {
            System.out.println(str);  // 結果：Linux、 OS X、Windows
        }

        System.out.println(set.contains("Linux"));  // 結果：true

        if (!set.isEmpty()) {
            System.out.println("要素数は" + set.size() + "個です。");
            // 結果：要素数は3個です。
        }

        set.remove("Windows");
        System.out.println(set);    // 結果：[Linux, OS X]
        set.clear();
        System.out.println(set);    // 結果：[]
    }
}
