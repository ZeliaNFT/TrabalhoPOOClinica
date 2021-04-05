
package br.edu.ifnmg.clinica.dados;
import br.edu.ifnmg.clinica.modelo.Medico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Zelia
 */
public class MedicosDAO {
    private static Map<String,Medico> medicos = new HashMap<>();
    
    public static void adicionarMedico(Medico medico){
        medicos.put(medico.getNome(), medico);
    }

    public static Medico buscarMedico(String nomeMedico) {
        Medico medico = medicos.get(nomeMedico);
        /*if(paciente == null){
            PacienteNaoEncontradoException e = new PacienteNaoEncontradoException();
            throw e;
        }*/
        
        return medico;
    }
    
    public static List<Medico> buscarTodosMedicos(){
        return new ArrayList<>(medicos.values());
    }
}
