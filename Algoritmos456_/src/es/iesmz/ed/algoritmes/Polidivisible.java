package es.iesmz.ed.algoritmes;

public class Polidivisible {
    private long num;

    public Polidivisible(long num) {
        this.num = num;
    }

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
