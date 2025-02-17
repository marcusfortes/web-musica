package com.musicas;

public class Musica{

    private String nome;
    private String artista;
    private int ano;

 
    public Musica(){
        nome ="";
    }

    public Musica(String nome, String artista){

        this.nome = nome;
        this.artista = artista;


    }

    public Musica(String nome, String artista, int ano){

        this.nome = nome;
        this.artista = artista;
        this.ano = ano;

    }


    public String getNome(){

        return this.nome;

    }

    public Musica musica(){

        return new Musica(this.nome, this.artista, this.ano);

    }




}