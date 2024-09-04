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
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }





//        알파벳과 숫자이기 때문에 - Character, Integer
//        HashMap<Character, Integer> alphabetMap = new HashMap<>();
//
//        for(char c : str.toCharArray()){
//            if(Character.isLetter(c)){
//                alphabetMap.put(c, alphabetMap.getOrDefault(c, 0)+1);
//            }
//        }
//
//        for(Map.Entry<Character, Integer> entry : alphabetMap.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }



//        Map 아닌 방법
//        String str = "to be or not to be, that is the question.";
//
//        int[] alphaCount = new int['z' - 'a' + 1];
//
//        for(int i = 0; i < str.length(); i++){
//            for(char j = 'a'; j <= 'z'; j++){
//                if(str.charAt(i) == j){
//                    alphaCount[j - 'a']++;
//                }
//            }
//        }
//
//        for(int i = 0; i < alphaCount.length; i++) {
//            System.out.println((char) (i + 'a') + " : " +  alphaCount[i]);
//        }
    }
}


