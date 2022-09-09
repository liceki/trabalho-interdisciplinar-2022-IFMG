package DTO;

public class EnderecoDTO {
    //atributos
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private int cliente_id;
    
    
    //--CONSTRUTORES--
    public EnderecoDTO(){
        
    }
    
    public EnderecoDTO(String estado, String cidade, String bairro, String rua, int numero, int cliente_id) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cliente_id = cliente_id;
    }
    
    
    //encapsulamento
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
    
    
}
