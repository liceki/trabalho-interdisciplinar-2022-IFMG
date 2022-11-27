package DTO;

public class FornecedorDTO {
    private int codigo;
    private String razaoSocial;
    private String cnpj;
    private String email;

    public FornecedorDTO(){
        
    }
    
    public FornecedorDTO(String razaoSocial, String cnpj, String email) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.email = email;
    }
    
    public FornecedorDTO(int codigo, String razaoSocial, String cnpj, String email) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.email = email;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
