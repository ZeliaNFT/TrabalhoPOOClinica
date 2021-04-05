
package br.edu.ifnmg.clinica.modelo;

/**
 *
 * @author Zelia
 */
public abstract class FormaDePagamento {
    private int formaPagamento;
    private String dataPagamento;
    
    public FormaDePagamento(int formaPagamento, String dataPagamento){
        this.formaPagamento = formaPagamento;
        this.dataPagamento = dataPagamento;
    }

 
    public int getFormaPagamento() {
        return formaPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }
}
