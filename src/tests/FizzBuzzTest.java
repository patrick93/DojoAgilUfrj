package tests;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void dado2Retorna2() {
        int entrada = 2;
        String esperado = "2";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }
    @Test
    public void dado4Retorna4() {
        int entrada = 4;
        String esperado = "4";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }
    @Test
    public void dado7Retorna7() {
        int entrada = 7;
        String esperado = "7";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }


    @Test
    public void dado1Retorna1() {
        int entrada = 1;
        String esperado = "1";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado100RetornaBuzz() {
        int entrada = 100;
        String esperado = "Buzz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado3RetornaFizz() {
        int entrada = 3;
        String esperado = "Fizz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado6RetornaFizz() {
        int entrada = 6;
        String esperado = "Fizz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado9RetornaFizz() {
        int entrada = 9;
        String esperado = "Fizz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado5RetornaBuzz() {
        int entrada = 5;
        String esperado = "Buzz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado10RetornaBuzz() {
        int entrada = 10;
        String esperado = "Buzz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado20RetornaBuzz() {
        int entrada = 20;
        String esperado = "Buzz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado15RetornaFizzBuzz() {
        int entrada = 15;
        String esperado = "FizzBuzz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado30RetornaFizzBuzz() {
        int entrada = 30;
        String esperado = "FizzBuzz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test
    public void dado45RetornaFizzBuzz() {
        int entrada = 45;
        String esperado = "FizzBuzz";

        String retorno = FizzBuzz.calcula(entrada);

        assertEquals(esperado, retorno);
    }

    @Test(expected = Exception.class)
    public void dadoMenosUmRetornaException() {
        int entrada = -1;
        FizzBuzz.calcula(entrada);
    }

    @Test(expected = Exception.class)
    public void dadoZeroRetornaException() {
        int entrada = 0;
        FizzBuzz.calcula(entrada);
    }

    @Test(expected = Exception.class)
    public void dadoMenosDoisRetornaException() {
        int entrada = -2;
        FizzBuzz.calcula(entrada);
    }

    @Test(expected = Exception.class)
    public void dado101RetornaException() {
        int entrada = 101;
        FizzBuzz.calcula(entrada);
    }

    @Test(expected = Exception.class)
    public void dadoMaiorInteiroPossivelRetornaException() {
        int entrada = Integer.MAX_VALUE;
        FizzBuzz.calcula(entrada);
    }

    @Test(expected = Exception.class)
    public void dado103RetornaException() {
        int entrada = 103;
        FizzBuzz.calcula(entrada);
    }




}