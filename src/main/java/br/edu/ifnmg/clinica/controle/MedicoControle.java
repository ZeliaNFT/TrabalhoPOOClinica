
package br.edu.ifnmg.clinica.controle;
import java.util.List;
import br.edu.ifnmg.clinica.modelo.Medico;
import br.edu.ifnmg.clinica.dados.MedicosDAO;
/**
 *
 * @author Zelia
 */
public class MedicoControle {
    public void cadastrarMedico(Medico medico){
        MedicosDAO.adicionarMedico(medico);
    }

    public Medico buscarMedico(String nomeMedico) {
            return MedicosDAO.buscarMedico(nomeMedico);
    }
    
    public List<Medico> buscarTodosMedicos(){
        return MedicosDAO.buscarTodosMedicos();
    }
}
