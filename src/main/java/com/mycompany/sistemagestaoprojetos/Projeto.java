package com.mycompany.sistemagestaoprojetos;

public class Projeto {
    private int id;
    private String nome;
    private String descricao;
    private String responsavel;
    private String dataInicio;
    private String dataTermino;
    private String status; // planejado, em andamento, concluido, cancelado
      
    public Projeto( int id, String nome, String descricao, String responsavel,
           String dataInicio, String dataTermino,String status){ 
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.status = status;
       
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void exibir(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("responsavel: " + responsavel);
        System.out.println("Inicio: " + dataInicio);
        System.out.println("Término: " + dataTermino);
        System.out.println("Status: " + status);
        System.out.println("-------------------");
    }
}
        
        
        
        
        
        
          
       
        
        
        
    
     

            
     
    

