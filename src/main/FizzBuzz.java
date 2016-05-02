package main;

public class FizzBuzz {
    public static String calcula(int numero){
        if(numero <= 0 || numero > 100 ){
            throw new RuntimeException("numero invalido");
        }
        if(numero%3==0 && numero%5==0){
            return "FizzBuzz";
        }
        if(numero%3==0) {
            return "Fizz";
        }
        if(numero%5==0){
            return "Buzz";
        }
        return String.valueOf(numero);
    }
}