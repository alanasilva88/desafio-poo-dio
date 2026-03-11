import dio.dominio.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprendendo JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para aprender Java");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlana = new Dev();
        devAlana.setNome("Alana");
        devAlana.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Alana: " + devAlana.getConteudosInscritos());
        devAlana.progredir();
        devAlana.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos Alana: " + devAlana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Alana: " + devAlana.getConteudosConcluidos());
        System.out.println("XP: " + devAlana.calcularTotalXp());

    }

}