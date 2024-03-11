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

}