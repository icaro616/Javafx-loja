package com.example.jesusbom;

public class Produto {
    private int id;
    private String login;
    private String nome;
    private double valor;

    public Produto(int id, String login, String nome, double valor) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.valor = valor;
    }

    // Métodos getters para acessar os atributos

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}