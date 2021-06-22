package dio;

import dio.dominio.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("JAva Básico");
        cursoJava.setDescricao("Aprenda os conceitos básicos de Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJavaII = new Curso();
        cursoJavaII.setTitulo("JAva Avançado");
        cursoJavaII.setDescricao("Aprenda os conceitos Avançados de Java");
        cursoJavaII.setCargaHoraria(10);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo(".Net");
        cursoDotNet.setDescricao("Aprenda os conceitos básicos de C#");
        cursoDotNet.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo orientação a objeto com java");
        mentoria.setDescricao("Imersão sobre os pilares da orientação a objeto");
        mentoria.setDate(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setInicio(LocalDateTime.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(30));
        List<Conteudo> conteudos = Arrays.asList(cursoJava, cursoJavaII, cursoDotNet, mentoria);
        bootcamp.setConteudos(conteudos);

        Dev dev = new Dev();
        dev.setNome("Sidney");
        dev.inscrever(cursoDotNet);
        dev.inscrever(bootcamp);


    }


}
