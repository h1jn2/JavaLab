import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.solution(new String[]{"abce", "abcd", "cdx"}, 1);
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        for (String str : strings) {
            System.out.println(str);
        }
        return answer;
    }
}

