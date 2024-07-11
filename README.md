# Prueba tecnica Memorandum Tecnologia - Cálculo de IMC, Suma de Dígitos y Movimiento de Ceros
## Descripción
Este proyecto implementa tres funcionalidades principales en Java:

Cálculo del Índice de Masa Corporal (IMC)
Suma de Dígitos
Movimiento de Ceros en un Arreglo
## Contenido
Main.java: Contiene el código fuente.
## Requisitos Previos
Java Development Kit (JDK): Versión 8 o superior.
Un IDE de Java (IntelliJ IDEA, Eclipse, NetBeans) o un editor de texto con terminal.
## Instrucciones
### 1. Compilar el Proyecto
Navega al directorio que contiene Main.java y compila el proyecto:
javac Main.java
### 2. Ejecutar el Proyecto
Ejecuta el proyecto con el siguiente comando:
java Main
### 3. Resultados Esperados

La ejecución imprimirá en la consola:

Categoría del IMC para una persona con un peso de 45 kg y una altura de 1.55 metros.
Suma de los dígitos de todos los números del 1 al 12.
Arreglo modificado con ceros movidos al final.

### Ejemplo de salida:
- Infrapeso
- 15
- false 1 1 2 1 3 a 0 0 

## Personalización
Para probar con diferentes valores, edita el método main en Main.java:

- Para calcularIMC: Cambia los valores de peso y altura.
- Para sumaDigitos: Cambia el valor del número.
- Para moveZeros: Modifica el arreglo de entrada.
  
### Ejemplo: Cambiar el IMC para una persona con peso 70 kg y altura 1.75 m:
System.out.println(calcularIMC(70, 1.75));
