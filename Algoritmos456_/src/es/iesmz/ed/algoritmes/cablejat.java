package es.iesmz.ed.algoritmes;

public class cablejat {
    private String[] cables;
    /**
     * Constructor de la clase.
     *
     * @param cables vector que contiene la descripción de los cables.
     * @throws IllegalArgumentException si el vector es nulo o está vacío.
     */
    public cablejat(String[] cables) {
        if (cables == null || cables.length == 0) {
            throw new IllegalArgumentException("El vector de cables no puede estar vacío");
        }
        this.cables = cables;
    }

    /**
     * Comprueba si es posible conectar todos los cables
     * formando un círculo.
     *
     * @return true si el número total de conectores macho
     * es igual al número total de conectores hembra.
     */
    public boolean esPotConnectar() {
        int M = 0;
        int H = 0;
        for (int i = 0; i < cables.length; i++) {
            String cable = cables[i];

            char extremo1 = cable.charAt(0);
            char extremo2 = cable.charAt(1);

            if (extremo1 == 'M') M++;
            if (extremo1 == 'H') H++;
            if (extremo2 == 'M') M++;
            if (extremo2 == 'H') H++;
        }
        return M == H;
    }
}