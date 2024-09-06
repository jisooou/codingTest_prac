import java.util.HashMap;
import java.util.Map;

/**
 * String str = "to be or not to be, that is the question.";
 * 
 * 알파벳별로 몇번씩 나타났는지 세는 프로그램을 작성하시오.
 * 
 * a = 1
 * b = 2
 * ...
 */
public class Test3 {
    public static void main(String[] args) {


//        Map 이용해서 풀어보기
        String str = "to be or not to be, that is the question.";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}


