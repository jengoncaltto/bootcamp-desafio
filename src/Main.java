import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("Descricao curso JAVA");
        curso1.setCargaHoraria(200);

        Curso curso2 = new Curso();
        curso2.setTitulo("SQl");
        curso2.setDescricao("Descricao curso SQL");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao bootcamp java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Jonathan");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos " + dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos " + dev1.getConteudosConcluidos());
        System.out.println("COnteudos Inscritos " + dev1.getConteudoInscritos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Jenifer");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos " + dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos " + dev2.getConteudosConcluidos());
        System.out.println("COnteudos Inscritos " + dev2.getConteudoInscritos());
        System.out.println("XP: " + dev2.calcularTotalXP());




    }
}