package Conversor;
/**
 * 
 * 
 * @author Alvaro Aparicio Pacheco DAM1
 * @version v1.2023 
 *
 *
 * <h2> Esto es mi clase Binario </h2>
 *
 **/

public class Binario {
	
	/**
	 * Esto es un<b> atributo </b>
	 * */
	private long valor;
	
	/**
	 * Esto es un<b> constructor</b> pero sin parametros
	 * */
    public Binario() {

    }
    
    /**
	 * Esto es otro<b> constructor</b> 
	 * @param un long
	 * */
    public Binario(long n) {
        valor = n;
    }
    
    /**
	 * Esto es otro<b> constructor</b> 
	 * @param un int
	 * */
    public Binario(int n) {
        valor = toBinario(n);
    }
    
    /**
	 * Esto es un<b> metodo</b> 
	 * @param int
	 * que utiliza condicionales 
	 * @return un long 
	 * */
    public long toBinario(int n) {
        if (n < 2) {
            return n;
        } else {
            return toBinario(n / 2) * 10 + (n % 2);
        }
    }
    
    /**
	 * Esto es un<b> metodo guetter</b> 
	 * @return un long
	 * */
    public long getValor() {
        return valor;
    }
    
    /**
	 * Esto es un<b> metodo setter</b> 
	 * @param un long
	 * y sirve para poder modificar un valor
	 * */
    public void setValor(long valor) {
        this.valor = valor;

    }
    
    /**
   	 * Esto es un<b> metodo</b> sin parametros
   	 * que utiliza un bucle
   	 * @return un int
   	 * */
    public int toDecimal() {
        long n = valor;
        int nDec = 0;
        int pos = 0;
        while (n > 0) {
            nDec = nDec + (int) (n % 10) * (int) Math.pow(2, pos);
            pos++;
            n = n / 10;
        }
        return nDec;
    }
    
    /**
   	 * Esto es un<b> metodo estatico</b> 
   	 * @param un long
   	 * que utiliza condicionales
   	 * @return un booleano
   	 * */
    public static boolean esValido(long n) {
        if (n == 0 || n == 1) {
            return true;
        } else {
            int ultima = (int) n % 10;

            return (ultima == 0 || ultima == 1) && esValido(n / 10);

        }
    }
    
    /**
   	 * Esto es un<b> metodo</b> sin parametros
   	 * @return un booleano
   	 * */
    public boolean esValido() {
        return esValido(valor);
    }
	
}