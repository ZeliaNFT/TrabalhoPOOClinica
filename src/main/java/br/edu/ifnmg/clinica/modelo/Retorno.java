
package br.edu.ifnmg.clinica.modelo;

import java.util.Date;

/**
 *
 * @author Zelia
 */
public class Retorno extends Atendimento{
    private String motivoRetorno;
    private int qtdDiasConsultaAnterior;
    private boolean possuiConsulta;
    
    public Retorno(String dataAtendimento, String horario, String situacao, String motivoRetorno,int qtdDiasConsultaAnterior,boolean possuiConsulta ){
        super(dataAtendimento, horario, situacao);
        this.motivoRetorno = motivoRetorno;
        this.qtdDiasConsultaAnterior= qtdDiasConsultaAnterior;
        this.possuiConsulta= possuiConsulta;
        
    }

    
    
    
    
    
}
