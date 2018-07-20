
package model;

public class Cliente {
    private int codigo;
    private String nome, endereco, cpf , rg , cidade ;
    
    public Cliente(){
        
    }
    
    public Cliente (String nome){
        this.nome = nome;
        
    }
    
    public Cliente (String nome, String endereco, String cpf , String rg , String cidade ){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.cidade = cidade;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    
    public String getCPF (){
        return cpf;
    }
    
    public void setCPF (String cpf){
        this.cpf = cpf;
    }
    
    public String getRG (){
        return cpf;
    }
    
    public void setRG (String rg){
        this.cpf = rg;
    }
    
    public String getCidade (){
        return cidade;
    }
    
    public void setCidade (String cidade){
        this.cidade = cidade;
    }
}
