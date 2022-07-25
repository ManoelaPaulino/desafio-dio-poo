import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição curso java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devManoela = new Dev();
        devManoela.setNome("Manoela");
        devManoela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Manoela: " + devManoela.getConteudosInscritos());
        devManoela.progredir();
        devManoela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Manoela: " + devManoela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Manoela: " + devManoela.getConteudosConcluidos());
        System.out.println("XP: " + devManoela.calcularTotalXp());

        System.out.println("-------");

        Dev devJoão =new Dev();
        devJoão.setNome("João");
        devJoão.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoão.getConteudosInscritos());
        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoão.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoão.getConteudosConcluidos());
        System.out.println("XP: " + devJoão.calcularTotalXp());
    }
}
