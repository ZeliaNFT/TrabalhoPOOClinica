
package br.edu.ifnmg.clinica.dados;
import br.edu.ifnmg.clinica.modelo.Paciente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Zelia
 */
public class PacientesDAO {
    private static Map<String,Paciente> pacientes = new HashMap<>();
    
    public static void adicionarPaciente(Paciente paciente){
        pacientes.put(paciente.getNome(), paciente);
    }

    public static Paciente buscarPaciente(String nomePaciente) {
        Paciente paciente = pacientes.get(nomePaciente);
        /*if(paciente == null){
            PacienteNaoEncontradoException e = new PacienteNaoEncontradoException();
            throw e;
        }*/
        
        return paciente;
    }
    
    public static List<Paciente> buscarTodosPacientes(){
        return new ArrayList<>(pacientes.values());
    }
}
