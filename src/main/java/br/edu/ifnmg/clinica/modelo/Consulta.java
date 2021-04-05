
package br.edu.ifnmg.clinica.modelo;

import java.util.Date;

/**
 *
 * @author Zelia
 */
public class Consulta extends Atendimento{
    private double valorConsulta;
    private String motivoConsulta;
    
    public Consulta(String dataAtendimento, String horario, String situacao, double valorConsulta, String motivoConsulta){
    super(dataAtendimento, horario, situacao);
    this.valorConsulta = valorConsulta;
    this.motivoConsulta = motivoConsulta;
            
    }

   
}
