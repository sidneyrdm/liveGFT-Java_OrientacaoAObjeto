package dio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {

    public String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();;

    public void inscrever(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            System.err.println("Já inscrito nesse conteúdo.: " + conteudo);
        } else {
            conteudosInscritos.add(conteudo);
        }
    }

    public void inscrever(Bootcamp bootcamp){
        for (Conteudo conteudo : bootcamp.getConteudos()) {
            inscrever(conteudo);
        }
        bootcamp.getDevs().add(this);
        //bootcamp.getConteudos().stream().forEach(this::inscrever); mesma coisa do FOR usando API STREAM
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
