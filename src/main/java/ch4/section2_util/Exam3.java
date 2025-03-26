package ch4.section2_util;

import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("서울");
        list.add("뉴욕");

        for (String data: list) {
            System.out.println(data);
        }

        // 중복 허용 X
        HashSet<String> set = new HashSet<>();
        set.add("서울");
        set.add("뉴욕");

        for (String data: set) {
            System.out.println(data);
        }

        // 데이터 key-value
        HashMap<String, String> map = new HashMap<>();
        map.put("one", "서울");
        map.put("two", "뉴욕");

        System.out.println(list.get(0));
        System.out.println(map.get("one"));

        // 모든 키 획득
        System.out.println(map.keySet());
        // 모든 데이터
        System.out.println(map.values());

        // Entry: 키-값
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // iterator -> 모든 collection 에서 지원
        // 모든 collection type의 데이터를 동일 api 로
        // 데이터를 순차적으로 이용하면서 삭제 기능까지 제공
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
