package com.mycompany.sistemagestaoprojetos;

import java.util.ArrayList;
public class Equipe {
    private int id;
    private String nome;
    private String descricao;
    private ArrayList<Usuario> membros;
    private ArrayList<Projeto> projetos;
    public Equipe(int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Usuario> membros) {
        this.membros = membros;
       
    }
     public void adicionarMembro(Usuario u){
         membros.add(u);
         
     }
     public void exibir(){
         System.out.println("ID: " + id);
         System.out.println("Nome: " + nome);
         System.out.println("Descrição: " + descricao);
         System.out.println("Membros: " + membros);
         System.out.println("-------------------------");
     }
        public void adicionarProjeto(Projeto p){
            projetos.add(p);
        }
 
}
