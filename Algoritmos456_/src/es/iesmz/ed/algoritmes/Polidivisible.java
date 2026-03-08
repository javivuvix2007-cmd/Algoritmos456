package es.iesmz.ed.algoritmes;

public class Polidivisible {
    private long num;


    /**
     * Constructor de la clase.
     *
     * @param num número que se quiere comprobar.
     * @throws IllegalArgumentException si el número es negativo.
     */
    public Polidivisible(long num) {
        this.num = num;
    }


    /**
     * Comprueba si el número es polidivisible.
     *
     * @return true si el número cumple la propiedad de polidivisibilidad,
     * false en caso contrario.
     */
    public boolean esPolidivisible() {
        if (!ValidaDigitos()) {
            return false;
        }

        String numeroTexto = String.valueOf(num);
        for (int i = numeroTexto.length(); i > 0; i--) {
            long subNumero = Long.parseLong(numeroTexto.substring(0, i));

            if (subNumero % i != 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * Comprueba si el número contiene todos los dígitos desde 0
     * hasta longitud-1 sin repetirse.
     *
     * @return true si los dígitos son correctos.
     */
    private boolean ValidaDigitos() {

        String numeroTexto = String.valueOf(num);
        int longitud = numeroTexto.length();
        boolean[] usados = new boolean[10];

        for (int i = 0; i < longitud; i++) {
            int digito = numeroTexto.charAt(i) - '0';

            if (digito >= longitud || usados[digito]) {
                return false;
            }
            usados[digito] = true;
        }
        return true;
    }
}