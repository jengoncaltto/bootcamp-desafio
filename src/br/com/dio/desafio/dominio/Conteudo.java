package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double  XP_Padrao = 10d;

    private String titulo;
    private String descricao;

    public abstract double calculaXP();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
