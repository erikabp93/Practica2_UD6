package ed.erika;
/**
 * Esta clase define una calculadora con cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1
 * @author Karlos Andrés Chávez Abrego
 */

/**
 * En esta clase se define una calculadora en la que se pueden realizar operaciones matemáticas básicas como la suma, resta, multiplicación y división de dos números enteros
 *
 * @author Érika Ballesteros Pascual
 * @version 3.7
 * @since 2.1
 */

public class Calculadora {
	
	/**
	 * Devuelve la suma de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Devuelve la resta de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la resta de los dos números enteros.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Devuelve el resultado de la multiplicación de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de los dos números enteros.
	 */
	
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Devuelve la división de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero (no puede ser cero).
	 * @throws ArithmeticException Si el segundo número es cero.
	 * @return El resultado.
       */
	
	public int diveix(int a, int b) {
		return a/b;
	}

}

