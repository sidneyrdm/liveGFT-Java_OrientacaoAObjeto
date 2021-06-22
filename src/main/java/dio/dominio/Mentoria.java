package dio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private LocalDateTime date;


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public double calcularXP() {
        return 0;
    }
}
