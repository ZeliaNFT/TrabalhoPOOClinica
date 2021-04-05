
package br.edu.ifnmg.clinica.modelo;

/**
 *
 * @author Zelia
 */
public class PagamentoPorConvenio extends FormaDePagamento {
    private String nomeConvenio;
    private double valorDesconto;
    
    public PagamentoPorConvenio(int formaPagamento, String dataPagamento, String nomeConvenio, double valorDesconto){
        super( formaPagamento, dataPagamento);
        this.nomeConvenio = nomeConvenio;
        this.valorDesconto = valorDesconto;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

   
}
