import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devYgor = new Dev();
        devYgor.setNome("Ygor");
        devYgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ygor: " + devYgor.getConteudosInscritos());

        devYgor.progredir();
        devYgor.progredir();
        devYgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ygor: " + devYgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ygor: " + devYgor.getConteudosConcluidos());
        System.out.println("XP: " + devYgor.calcularTotalXp());

        System.out.println("--------------");

        Dev devRomero = new Dev();
        devRomero.setNome("romero");
        devRomero.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Romero: " + devRomero.getConteudosInscritos());
        devRomero.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Romero: " + devRomero.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Romero: " + devRomero.getConteudosConcluidos());
        System.out.println("XP: " + devRomero.calcularTotalXp());

    }
}
