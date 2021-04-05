
package br.edu.ifnmg.clinica.dados;
import br.edu.ifnmg.clinica.modelo.Atendimento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Zelia
 */
public class AtendimentoDAO {
    private static Map<String,Atendimento> atendimentos = new HashMap<>();
    
    public static void adicionarAtendimento(Atendimento atendimento){
        atendimentos.put(atendimento.getDataAtendimento(), atendimento);
    }

    public static Atendimento buscarAtendimento(String nomeAtendimento) {
        Atendimento atendimento = atendimentos.get(nomeAtendimento);
        /*if(paciente == null){
            PacienteNaoEncontradoException e = new PacienteNaoEncontradoException();
            throw e;
        }*/
        
        return atendimento;
    }
    
    public static List<Atendimento> buscarTodosAtendimentos(){
        return new ArrayList<>(atendimentos.values());
    }
}
