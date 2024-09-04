/*
 * int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1}
 * 
 * 위 배열에서 최소값, 최대, 평균, 합계를 구해서 출력하시오.
 */
public class Test1 {
    public static void main(String[] args) {

        int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1};

        int sum = 0;
        int min = 999999;
        int max = -999999;

        for(int i = 0; i<array.length; i++){

//            합계 구하기
            sum = sum + i;

//            최소값 구하기
            if(array[i] < min){
                min = array[i];
            }

//            최대값 구하기
            if(array[i] > max){
                max = array[i];
            }
        }

//        평균 구하기
        int avg = sum / array.length;

        System.out.println("sum:" + sum);
        System.out.println("min:" + min);
        System.out.println("max:" + max);
        System.out.println("avg:" + avg);

//        -------------------------------------------------------------

//        int sum = 0;
//        int min = 999999;
//        int max = -999999;
//
//        for(int i = 0; i < array.length; i++){
////            합계 구하기
//            sum = sum+i;
////            최소값 구하기
//            if(array[i] < min){
//                min = array[i];
//            }
////            최대값 구하기
//            if(array[i] > max){
//                max = array[i];
//            }
//        }
////        평균 구하기
//        int aver = sum / array.length;
//
//        System.out.println("합계:" + sum);
//        System.out.println("평균:" + aver);
//        System.out.println("MIN:" + min);
//        System.out.println("MAX:" + max);

    }
}
