
package br.edu.ifnmg.clinica.controle;
import java.util.List;
import br.edu.ifnmg.clinica.modelo.Atendimento;
import br.edu.ifnmg.clinica.dados.AtendimentoDAO;
/**
 *
 * @author Zelia
 */
public class AtendimentoControle {
    public void cadastrarAtendimento(Atendimento atendimento){
        AtendimentoDAO.adicionarAtendimento(atendimento);
    }

    public Atendimento buscarAtendimento(String dataAtendimento) {
            return AtendimentoDAO.buscarAtendimento(dataAtendimento);
    }
    
    public List<Atendimento> buscarTodosAtendimentos(){
        return AtendimentoDAO.buscarTodosAtendimentos();
    }
}
