package util;

public class Cliente {
    
    private static Integer codigo;
    private String nome;
    private Endereco endereco;
    private String telefone;
    
    public Cliente(){
        Cliente.codigo++;
        this.nome = "";
        this.endereco = null;
        this.telefone = "";
    }
    
    public Cliente(String nome, Endereco endereco, String telefone){
        Cliente.codigo++;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
