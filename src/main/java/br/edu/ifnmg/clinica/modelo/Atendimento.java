
package br.edu.ifnmg.clinica.modelo;

import java.util.Objects;

/**
 *
 * @author Zelia
 */
public abstract class Atendimento implements Comparable<Atendimento> {
    private String dataAtendimento;
    private String horario;
    private String situacao;
    private Medico medico;
    private Paciente paciente;
    
    public Atendimento(String dataAtendimento, String horario, String situacao){
        this.dataAtendimento = dataAtendimento;
        this.horario = horario;
        this.situacao = situacao;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    public String getDataAtendimento() {
        return dataAtendimento;
    }


    public String getHorario() {
        return horario;
    }

    public String getSituacao() {
        return situacao;
    }

    public Medico getMedico() {
        return medico;
    }

 
    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.getDataAtendimento());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atendimento other = (Atendimento) obj;
        if (!Objects.equals(this.dataAtendimento, other.dataAtendimento)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Atendimento atendimento){
        return this.getDataAtendimento().compareToIgnoreCase(atendimento.getDataAtendimento()+
                this.getHorario()+this.getPaciente()+this.getMedico()+this.getSituacao());
    }

    
}
    

