package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    private long num;

    public SumaDescendent(long num) throws Exception {
        /**
         * Constructor de la clase.
         *
         * @param numero Numero del cual se pretende calcular la suma descendiente.
         * @throws IllegalArgumentException si el numero es negativo.
         */
        if(num < 0) {
            throw new Exception("El numero no puede ser negativo");
        }
    }
    /**
     * Calcula la suma descendiente del numero.
     *
     * @return resultado de la suma descendiente.
     */
    public long suma() {
        long suma = 0;
        String numSuma = String.valueOf(num);

        while (!numSuma.isEmpty()) {
            suma += Long.parseLong(numSuma);
            numSuma = numSuma.substring(1);
        }
        return suma;
    }
}
