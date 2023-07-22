package com.example.jesusbom;

public class Cadastros {
    private int id;
    private String login;
    private String nome;

    public Cadastros(int id, String login, String nome, String sobrenome) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private String sobrenome;

    // Construtor, getters e setters
}
