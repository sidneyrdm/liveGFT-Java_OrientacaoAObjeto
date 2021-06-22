package dio.dominio;

public class Curso extends Conteudo {


    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
