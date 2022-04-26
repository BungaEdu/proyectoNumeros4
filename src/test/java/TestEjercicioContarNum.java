import org.example.EjercicioContarNumeros;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarNum {
    @Test
    public void testContarNumIguales() {
        String[] input= {a,b,c,d};
        String outputEsperado = "{a=1}";
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarNumNoIguales() {
        Integer[] input= {1,2,3,4};
        String outputEsperado = "{1=1, 2=1, 3=1, 4=1}";
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @org.testng.annotations.Test
    public void testContarNumerosConNull() {
        Integer [] input= {};
        String outputEsperado = "{}";
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);

    }


}
