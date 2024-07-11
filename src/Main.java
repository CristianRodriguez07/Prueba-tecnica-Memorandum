
public class Main {


    public static void main(String[] args) {
        System.out.println(calcularIMC(45, 1.55));
        System.out.println(sumaDigitos(12));
        Object[] array = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
        moveZeros(array);
        for (Object element : array) {
            System.out.print(element + " ");
        }
    }



    //PRUEBA 2.1 Escribir una función que calcule el Índice de Masa Corporal (IMC =
    //Peso/Altura2)

    /**
 * Calcula el Índice de Masa Corporal (IMC) y devuelve la categoría de peso correspondiente.
 * El IMC se calcula usando la fórmula: IMC = peso / (altura * altura).
 *
 * @param peso El peso de la persona en kilogramos.
 * @param altura La altura de la persona en metros.
 * @return Una {@code String} indicando la categoría de peso basada en el valor del IMC:
 *         - "Infrapeso" si IMC <= 18.5
 *         - "Normal" si IMC > 18.5 y <= 25
 *         - "Sobrepeso" si IMC > 25 y <= 30
 *         - "Obeso" si IMC > 30
 */

public static String calcularIMC(double peso, double altura) {
    double imc = peso / (altura * altura);
    if (imc <= 18.5) {
        return "Infrapeso";
    } else if (imc <= 25) {
        return "Normal";
    } else if (imc <= 30) {
        return "Sobrepeso";
    } else {
        return "Obeso";
    }
}



    //PRUEBA 2.2 Encuentra la suma de los dígitos de todos los números de 1 a N (Ambos incluidos)

    /**
     * Calcula la suma de los dígitos de un número dado.
     *Este método analiza un número dígito por dígito, sumando cada dígito a un total y luego eliminando ese dígito del número al dividir el número por 10.
     *Este proceso continúa hasta que no quedan dígitos en el número.
     * @param n El número al cual se le sumarán los dígitos.
     *  @return La suma de los dígitos del número dado.
     */

public static int sumarDigitos(int n) {
    int suma = 0;
    while (n != 0) {
        suma += n % 10; // Añade el último dígito de n a suma
        n = n / 10;     // Elimina el último dígito de n
    }
    return suma;
}

/**
 * Calcula la suma de los dígitos de todos los números desde 1 hasta n (inclusive).
 * Este método utiliza el método sumarDigitos para calcular la suma de los dígitos de cada número en el rango
 * de 1 a n y acumula estas sumas en una suma total.
 *
 * @param n El límite superior del rango que comienza desde 1.
 * @return La suma de los dígitos de todos los números desde 1 hasta n.
 */

public static int sumaDigitos(int n) {
    int suma = 0;
    for (int i = 1; i <= n; i++) {
        suma += sumarDigitos(i); // Suma los dígitos de i y los añade a la suma total
    }
    return suma;
}



    //PRUEBA 2.3 Moviendo ceros al final:


    /**
 * Mueve todos los ceros en un arreglo hacia el final, manteniendo el orden de los demás elementos.
 * Este método itera a través del arreglo, desplazando los elementos no cero hacia el frente
 * y llenando las posiciones restantes con ceros.
 *
 * @param array El arreglo de objetos (incluyendo números) a reorganizar.
 */

public static void moveZeros(Object[] array) {
    int n = array.length;
    int count = 0; // Contador para elementos no cero
    for (int i = 0; i < n; i++) {
        if (!array[i].equals(0)) {
            array[count++] = array[i]; // Desplaza el elemento no cero al índice actual de count
        }
    }
    while (count < n) {
        array[count++] = 0; // Llena las posiciones restantes con ceros
    }
}


}