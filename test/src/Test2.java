/*
 * 1부터 100까지의 숫자를 프린트하는 프로그램을 작성하는데 
 * 3의 배수이면 "Fizz"를, 
 * 5의 배수이면 "Buzz"를, 
 * 둘 모두의 배수 즉 15의 배수이면 "FizzBuzz" 를 프린트하도록 하라.
 * 
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * ...
 */
public class Test2 {

    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

}
