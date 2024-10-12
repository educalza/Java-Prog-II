package com;

public class Cliente {
    
    private static Integer codigo = 0;
    private String nome;
    private Endereco endereco;
    private String telefone;
    
    public Cliente(){
        codigo++;
        nome = "";
        endereco = null;
        telefone = "";
    }
    
    public Cliente(String nome, Endereco endereco, String estado){
        codigo++;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = estado;
    }
    
    public static Integer getCodigo(){
        return codigo;
    }
    public static void setCodigo(Integer codigo){
        Cliente.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String estado){
        this.telefone = estado;
    }
}
