import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria curso java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohnny = new Dev();
        devJohnny.setNome("Johnny");
        devJohnny.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Johnny:" + devJohnny.getConteudosInscritos());
        devJohnny.progredir();
        devJohnny.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Johnny:" + devJohnny.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Johnny: " + devJohnny.getConteudosConcluidos());
        System.out.println("XP: " + devJohnny.calcularTotalXp());

        System.out.println("----------");

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renato:" + devRenato.getConteudosInscritos());
        devRenato.progredir();
        devRenato.progredir();
        devRenato.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Renato:" + devRenato.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Renato: " + devRenato.getConteudosConcluidos());
        System.out.println("XP: " + devRenato.calcularTotalXp());
    }
}
