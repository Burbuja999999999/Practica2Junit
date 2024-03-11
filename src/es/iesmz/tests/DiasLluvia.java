package es.iesmz.tests;

public class DiasLluvia {
    private boolean[][] registros;
    public DiasLluvia() {
        registros = new boolean[12][31];
    }

    public boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12)
            return false;
        registros[mes - 1][dia - 1] = lluvia;
        return true;
    }

    public boolean consultarDia(int dia, int mes) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12)
            return false;
        return registros[mes - 1][dia - 1];
    }

    public int contarDiasLluviosos() {
        int contador = 0;
        for (boolean[] mes : registros) {
            for (boolean dia : mes) {
                if (dia)
                    contador++;
            }
        }
        return contador;
    }

    public int trimestreLluvioso() {
        int[] trimestres = new int[4];
        for (int mes = 0; mes < 12; mes++) {
            int trimestre = mes / 3;
            for (boolean dia : registros[mes]) {
                if (dia)
                    trimestres[trimestre]++;
            }
        }
        int mesMax = 0;
        int maxLluvia = trimestres[0];
        for (int i = 1; i < 4; i++) {
            if (trimestres[i] > maxLluvia) {
                maxLluvia = trimestres[i];
                mesMax = i;
            }
        }
        return mesMax + 1;

        public int primerDiaLluvia() {
            for (int mes = 0; mes < 12; mes++) {
                for (int dia = 0; dia < 31; dia++) {
                    if (registros[mes][dia])
                        return mes * 31 + dia + 1;
                }
            }
            return -1;
        }
    }
}