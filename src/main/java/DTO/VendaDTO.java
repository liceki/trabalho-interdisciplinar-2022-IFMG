package DTO;

import java.util.Date;

public class VendaDTO {
    //atributos
    private int produto_id;
    private int cliente_id;
    private Date venda_data;
    
    //contrutores
    public VendaDTO(int produto_id, int cliente_id, Date venda_data){
        this.produto_id = produto_id;
        this.cliente_id = cliente_id;
        this.venda_data = venda_data;
    }
    
    //encapsulamento
    public int getProduto_id() {
        return produto_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public Date getVenda_data() {
        return venda_data;
    }
    
    
}
