import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de java Script");
        mentoria2.setDescricao("Descrição mentoria java Script");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Bootcamp bootcampJS = new Bootcamp();
        bootcampJS.setNome("Bootcamp Java Script Developer");
        bootcampJS.setDescricao("Descrição Bootcamp Java Script Developer");
        bootcampJS.getConteudos().add(curso2);
        bootcampJS.getConteudos().add(mentoria2);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Contreudos inscritos"+devPaulo.getConteudoInscritos());
        devPaulo.progredir();
        System.out.println("Contreudos inscritos"+devPaulo.getConteudoInscritos());
        System.out.println("Contreudos concluidos"+devPaulo.getConteudoConcluidos());
        System.out.println(devPaulo.calcularXpTotal());


        Dev devFran = new Dev();
        devFran.setNome("Franciele");
        devFran.inscreverBootcamp(bootcampJS);
        System.out.println("Contreudos inscritos"+devFran.getConteudoInscritos());
        devFran.progredir();
        devFran.progredir();
        System.out.println("Contreudos inscritos"+devFran.getConteudoInscritos());
        System.out.println("Contreudos concluidos"+devFran.getConteudoConcluidos());
        System.out.println(devFran.calcularXpTotal());
    }
}
