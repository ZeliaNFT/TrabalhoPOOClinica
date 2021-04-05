
package br.edu.ifnmg.clinica.modelo;
import java.util.Objects;
/**
 *
 * @author Zelia
 */
public class Medico extends Pessoa implements Comparable<Medico>{
    private String crm;
    private String especializacao;
   
    public Medico(String nome, String dataNascimento, String telefone,String endereco, String crm, String especializacao){
        super(nome, dataNascimento, telefone, endereco);
        this.crm = crm;
        this.especializacao = especializacao;
    }

    public String getCrm() {
        return crm;
    }
    public String getEspecializacao() {
        return especializacao;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nome);
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.crm, other.crm)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Medico medico){
        return this.getNome().compareToIgnoreCase(medico.getNome())+this.getCrm().compareToIgnoreCase(medico.getCrm()+this.getEspecializacao());
    }
}   
   