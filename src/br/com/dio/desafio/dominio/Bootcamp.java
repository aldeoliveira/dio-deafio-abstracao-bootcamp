package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp() {
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
    }

    public void removerDev(Dev dev) {
        devsInscritos.remove(dev);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }
}
