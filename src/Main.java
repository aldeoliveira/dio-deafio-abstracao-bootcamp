import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso básico de Java.");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Git");
        curso2.setDescricao("Curso avançado de Git.");
        curso2.setCargaHoraria(16);
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Título da Metoria");
        mentoria1.setDescricao("Mentoria Java.");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desenvolvedor Java");
        bootcamp.setDescricao("Bootcamp para desenvolvedores Java.");
        bootcamp.adicionarConteudo(mentoria1);
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("André");
        Dev dev2 = new Dev();
        dev2.setNome("Camila");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev2.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        dev2.progredir();

        System.out.println(dev1.calcularTotalXp());
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev2.calcularTotalXp());
        System.out.println(dev2.getConteudosConcluidos());
    }
}
