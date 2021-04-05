
package br.edu.ifnmg.clinica.controle;
import java.util.List;
import br.edu.ifnmg.clinica.modelo.Paciente;
import br.edu.ifnmg.clinica.dados.PacientesDAO;
/**
 *
 * @author Zelia
 */
public class PacienteControle {
    public void cadastrarPaciente(Paciente paciente){
        PacientesDAO.adicionarPaciente(paciente);
    }

    public Paciente buscarPaciente(String nomePaciente) {
            return PacientesDAO.buscarPaciente(nomePaciente);
    }
    
    public List<Paciente> buscarTodosPacientes(){
        return PacientesDAO.buscarTodosPacientes();
    }
}
