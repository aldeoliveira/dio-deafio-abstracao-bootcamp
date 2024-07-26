import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        // Instancie um Bootcamp e a ele um nome e uma descrição
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desenvolvedor Java");
        bootcamp.setDescricao("Bootcamp para desenvolvedores Java.");

        // Crie alguns cursos que farão parte do bootcamp
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso básico de Java.");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Git");
        curso2.setDescricao("Curso avançado de Git.");
        curso2.setCargaHoraria(16);

        // E algumas mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Título da Metoria");
        mentoria1.setDescricao("Mentoria Java.");
        mentoria1.setData(LocalDate.now());

        // Por fim, adicione esses conteúdos ao bootcamp
        bootcamp.adicionarConteudo(mentoria1);
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);

        // Agora que o bootcamp está pronto, instancie os desenvolvedores e insira-os no bootcamp.
        Dev dev1 = new Dev();
        dev1.setNome("André");
        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);

        // A o se inscrever em um bootcamp, todos os seus conteúdos são inseridos na lista de conteúdos no qual o desenvolvedor está inscrito
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev2.getConteudosInscritos());

        // Ao progredir, o Dev transfere o próximo conteúdo da lista de inscritos para a lista de concluídos
        dev1.progredir();
        dev1.progredir();
        dev2.progredir();
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev2.getConteudosConcluidos());

        // Todo conteúdo fornece ao desenvolvedor uma quantidade de XP ao completá-lo. Para os cursos esse valor é 20, e para as mentorias é 30.
        System.out.println(dev1.calcularTotalXp());
        System.out.println(dev2.calcularTotalXp());
    }
}
