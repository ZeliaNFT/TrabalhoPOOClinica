
package br.edu.ifnmg.clinica.modelo;
import java.util.Objects;
/**
 *
 * @author Zelia
 */
public class Paciente extends Pessoa implements Comparable<Paciente>{
    private String cpf;
    private String historico;
    public Paciente(String nome, String dataNascimento, String telefone,String endereco, String cpf, String historico){
        super(nome, dataNascimento,telefone,endereco);
        this.cpf = cpf;
        this.historico = historico;
    }
      public String getCpf() {
        return cpf;
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
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
       @Override
    public int compareTo(Paciente paciente){
        return this.getNome().compareToIgnoreCase(paciente.getNome())+ this.getCpf().compareToIgnoreCase(paciente.getCpf());
    }

  
}
