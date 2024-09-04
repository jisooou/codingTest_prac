/**
// * int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1}
 * 
 * 배열의 일부 구간에서 가장 큰 합이 발생하는 경우의 합계 수를 구하시오
 * 
 * 33
 */

public class Test4 {
    public static void main(String[] args) {

        int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1};

        int max = -9999999;

        for(int i = 0; i<array.length; i++){
            int sum = 0;
            for(int j = i; j<array.length; j++){
                sum = sum + array[j];

                if(sum > max){
                    max = sum;
                }
            }

        }
        System.out.println(max);

//---------------------------------------------------------------------
//        int max = -999999;
//
//        for(int i = 0; i < array.length; i++) {
//            int sum = 0;
//            for(int j = i; j < array.length; j++) {
//                sum += array[j];
//                if(sum > max) {
//                    max = sum;
//                }
//            }
//        }
//        System.out.println(max);
    }
}
