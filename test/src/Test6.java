public class Test6 {

    public static void main(String[] args) {
//        6. int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1};    int[] find = new int[]{-35, 12, 21};
//        위와 같은 배열이있을때
//        find가 array의 몇번째 인덱스에 있는지 출력하는 프로그램을 작성하시오
//
        int[] array = new int[]{10, -4, 3, 1, 5, 6, -35, 12, 21, -1};
        int[] find = new int[]{-4, 3, 1};

        for(int i = 0; i < array.length; i++){
            int count = 0;

            for(int j = 0; j < find.length; j++){

                if(array[i + j] == find[j] ) {
                    count++;
                }

                if(count == find.length){
                    System.out.println(i);
                    break;
                }
            }
        }

    }


}
