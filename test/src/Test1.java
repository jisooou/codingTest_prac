/*
 * int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1}
 * 
 * 위 배열에서 최소값, 최대, 평균, 합계를 구해서 출력하시오.
 */
public class Test1 {
    public static void main(String[] args) {

        int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1};

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        int min = 9999999;
//        int max = -999999;

        for(int i = 0; i < array.length; i++){
            sum = sum + i;

            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }

        int ave = sum / array.length;

        System.out.println("sum :" + sum);
        System.out.println("ave :" + ave);
        System.out.println("min :" + min);
        System.out.println("max :" + max);

    }
}
