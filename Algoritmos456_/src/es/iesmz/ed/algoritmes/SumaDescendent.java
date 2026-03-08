package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    private long num;

    public SumaDescendent(long num) {
        this.num = num;
    }

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
