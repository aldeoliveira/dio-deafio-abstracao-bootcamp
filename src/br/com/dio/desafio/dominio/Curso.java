package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10;
    }

    @Override
    public String toString() {
        return String.format(
            "Curso{titulo='%s', descricao='%s', cargaHoraria=%d}",
            getTitulo(), getDescricao(), getCargaHoraria()
        );
    }
}
