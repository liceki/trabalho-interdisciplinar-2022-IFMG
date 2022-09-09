package DTO;

public class ClienteDTO {
    //atributos
    private int cliente_id;
    private String cliente_nome;
    private String cliente_telefone;
    private String cliente_email;
    private String cliente_cpf;
    
    
    //--CONSTRUTORES--
    //dafault
    public ClienteDTO(){
        
    }
    //dados informados pelo usuário usuário
    public ClienteDTO(String cliente_nome, String cliente_telefone, String cliente_email, String cliente_cpf) {
        this.cliente_nome = cliente_nome;
        this.cliente_telefone = cliente_telefone;
        this.cliente_email = cliente_email;
        this.cliente_cpf = cliente_cpf;
    }
    //dados informados pelo Banco de Dados
    public ClienteDTO(int cliente_id, String cliente_nome, String cliente_telefone, String cliente_email, String cliente_cpf) {
        this.cliente_id = cliente_id;
        this.cliente_nome = cliente_nome;
        this.cliente_telefone = cliente_telefone;
        this.cliente_email = cliente_email;
        this.cliente_cpf = cliente_cpf;
    }
    
    

    //encapsulamento
    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getCliente_nome() {
        return cliente_nome;
    }

    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    public String getCliente_telefone() {
        return cliente_telefone;
    }

    public void setCliente_telefone(String cliente_telefone) {
        this.cliente_telefone = cliente_telefone;
    }

    public String getCliente_email() {
        return cliente_email;
    }

    public void setCliente_email(String cliente_email) {
        this.cliente_email = cliente_email;
    }

    public String getCliente_cpf() {
        return cliente_cpf;
    }

    public void setCliente_cpf(String cliente_cpf) {
        this.cliente_cpf = cliente_cpf;
    }

    
    
}
