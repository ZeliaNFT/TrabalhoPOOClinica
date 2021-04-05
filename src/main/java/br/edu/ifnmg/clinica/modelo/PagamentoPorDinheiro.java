
package br.edu.ifnmg.clinica.modelo;

/**
 *
 * @author Zelia
 */
public class PagamentoPorDinheiro extends FormaDePagamento{
    private int qtdParcelas;
    private double valorParcela;
    
    public PagamentoPorDinheiro(int formaPagamento, String dataPagamento, int qtdParcelas, double valorParcela){
        super(formaPagamento,dataPagamento);
        this.qtdParcelas = qtdParcelas;
        this.valorParcela = valorParcela;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public double getValorParcela() {
        return valorParcela;
    }
    
    
}
