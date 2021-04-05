
package br.edu.ifnmg.clinica.apresentacao;
import br.edu.ifnmg.clinica.modelo.Atendimento;
import br.edu.ifnmg.clinica.modelo.Consulta;
import br.edu.ifnmg.clinica.modelo.Retorno;
import br.edu.ifnmg.clinica.modelo.FormaDePagamento;
import br.edu.ifnmg.clinica.modelo.PagamentoPorDinheiro;
import br.edu.ifnmg.clinica.modelo.PagamentoPorConvenio;
import br.edu.ifnmg.clinica.modelo.Pessoa;
import br.edu.ifnmg.clinica.modelo.Medico;
import br.edu.ifnmg.clinica.modelo.Paciente;
import java.util.Scanner;
import br.edu.ifnmg.clinica.controle.PacienteControle;
import br.edu.ifnmg.clinica.controle.MedicoControle;
import br.edu.ifnmg.clinica.controle.AtendimentoControle;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Zelia
 */
public class MenuClinica {

    public static void main(String[] parametros){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do{
            try{
                System.out.println("\n\n==============Menu==============");
                System.out.println("Operacao: ");
                System.out.println("1 - Cadastrar Paciente/Medico");
                System.out.println("2 - Agendar Atendimento");
                System.out.println("3 - Listar Pacientes");
                System.out.println("4 - Listar Medicos");
                System.out.println("5 - Listar Atendimentos");
                System.out.println("6 - Informar Pagamento");
                System.out.println("0 - Sair");
                
                System.out.println("Informe a opcao desejada: ");
                opcao = Integer.parseInt(scanner.nextLine());
                 
                switch (opcao) {
                    case 1:
                        cadastros(scanner);
                        break;
                    case 2:
                        agendamento(scanner);
                        break;
                    case 3:
                        listarPacientes();
                        break;
                    case 4:
                        listarMedicos();
                        break;
                    case 5:
                        listarAtendimento();
                        break;
                    case 6:
                        pagamento(scanner);
                        break;
                }
        }catch(NumberFormatException e){
                System.out.println("\nOpcao Invalida! Tente novamente.");
                opcao = -1;
        }catch(Exception e){
                System.out.println("\nErro! Tente Novamente.");
                opcao = -1;                
        }
            
        }while(opcao != 0);
    }
    
    
    private static void cadastros(Scanner scanner) {
        System.out.println("\n=======Cadastros=======");
        System.out.println("\nCadastrar: Medico (M) ou Paciente (P): ");
        char pessoa = scanner.nextLine().charAt(0);
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Data Nascimento: ");
        String dataNascimento = scanner.nextLine(); 
        
        System.out.println("Endereco: ");
        String endereco = scanner.nextLine();
        
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        
        Medico medico = null;
        Paciente paciente = null; 
        if(pessoa == 'M' || pessoa == 'm'){
            System.out.println("CRM: ");
            String crm = scanner.nextLine();
            System.out.println("Especializacao: ");
            String especializacao = scanner.nextLine();
            medico = new Medico(nome,dataNascimento,telefone,endereco,crm,especializacao);
            MedicoControle medicoControle = new MedicoControle();
            medicoControle.cadastrarMedico(medico);
            System.out.println("Medico cadastrado com sucesso!");
            
        }else if(pessoa == 'P' || pessoa == 'p'){
            System.out.println("CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Historico: ");
            String historico = scanner.nextLine();
            paciente = new Paciente(nome,dataNascimento,telefone,endereco,cpf, historico);
            PacienteControle pacienteControle = new PacienteControle();
            pacienteControle.cadastrarPaciente(paciente);
            System.out.println("Paciente cadastrado com sucesso!");
        }
    }

    
    private static void agendamento(Scanner scanner) {
        System.out.println("\n=======Agendamento=======");
        System.out.println("\nAgendar: Consulta (C) ou Retorno (R): ");
        char atendimento = scanner.nextLine().charAt(0);
        
        System.out.println("Data do Atendimento: ");
        String dataAtendimento = scanner.nextLine();
        
        System.out.println("Horario do Atendimento: ");
        String horario = scanner.nextLine(); 
        
        System.out.println("Situacao: ");
        String situacao = scanner.nextLine();

        
        Consulta consulta = null;
        Retorno retorno = null; 
        if(atendimento == 'C' || atendimento == 'c'){
            System.out.println("Valor: ");
            double valorConsulta = Double.parseDouble(scanner.nextLine());
            System.out.println("Motivo: ");
            String motivo = scanner.nextLine();
            consulta = new Consulta(dataAtendimento, horario, situacao, valorConsulta,motivo);
            AtendimentoControle atendimentoControle = new AtendimentoControle();
            atendimentoControle.cadastrarAtendimento(consulta);
            System.out.println("Consulta Agendada com sucesso!");
        }else if(atendimento == 'R' || atendimento == 'r'){
            System.out.println("Motivo do Retorno: ");
            String motivoRetorno = scanner.nextLine();
            System.out.println("Possui consulta anterior: ");
            boolean possuiConsulta= Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Ha quantos dias foi a consulta anterior: ");
            int qtdDiasConsultaAnterior = Integer.parseInt(scanner.nextLine());
            if (qtdDiasConsultaAnterior > 30){
                System.out.println("Numero de dias excedido, agente nova consulta!");
            }else if (qtdDiasConsultaAnterior < 31){
                retorno = new Retorno(dataAtendimento, horario, situacao, motivoRetorno, qtdDiasConsultaAnterior,possuiConsulta);
                AtendimentoControle atendimentoControle = new AtendimentoControle();
                atendimentoControle.cadastrarAtendimento(retorno);
                System.out.println("Retorno Agendado com sucesso!");
            }
        }
    }
    
    private static void pagamento(Scanner scanner) {
        System.out.println("\n=======Pagamento=======");
        System.out.println("\nPagar com: Convenio(C) ou Dinheiro (D): ");
        char formaPagamento = scanner.nextLine().charAt(0);
        
        System.out.println("Data Pagamento: ");
        String dataPagamento = scanner.nextLine();
        
        PagamentoPorConvenio pagamentoPorConvenio = null;
        PagamentoPorDinheiro pagamentoPorDinheiro = null; 
        if(formaPagamento == 'C' || formaPagamento == 'c'){
            System.out.println("Nome do Convenio: ");
            String nomeConvenio = scanner.nextLine();
            System.out.println("Valor do Desconto: ");
           double valorDesconto= Double.parseDouble(scanner.nextLine());
            pagamentoPorConvenio = new PagamentoPorConvenio(formaPagamento,dataPagamento,nomeConvenio,valorDesconto);
            System.out.println("Pagamento Realizado com sucesso!");
            
        }else if(formaPagamento == 'D' || formaPagamento == 'd'){
            System.out.println("Quantidade de Parcela: ");
            int qtdParcelas = Integer.parseInt(scanner.nextLine());
            System.out.println("Valor da Parcela: ");
            double valorParcela= Double.parseDouble(scanner.nextLine());
            pagamentoPorDinheiro = new PagamentoPorDinheiro(formaPagamento,dataPagamento,qtdParcelas, valorParcela);
            System.out.println("Pagamento Realizado com sucesso!");
        }
    }
    
    
    private static void listarPacientes(){
            System.out.println("\n=====Pacientes cadastrados=====");

            PacienteControle pacienteControle = new PacienteControle();        
            List<Paciente> pacientes = pacienteControle.buscarTodosPacientes();
            Collections.sort(pacientes);
        
            for(Paciente paciente : pacientes){
                System.out.println("\nNome: "+paciente.getNome()+" CPF:"+(paciente.getCpf())+"\n====================================");
            }
    }
    private static void listarMedicos(){
            System.out.println("\n=====Medicos Cadastrados=====");

            MedicoControle medicoControle = new MedicoControle();        
            List<Medico> medicos = medicoControle.buscarTodosMedicos();
            Collections.sort(medicos);
        
            for(Medico medico : medicos){
                System.out.println("\nNome: "+medico.getNome()+" CRM: "+(medico.getCrm())+" Especializacao:"+(medico.getEspecializacao())+"\n====================================");
                
            }
        }
    
    private static void listarAtendimento(){
            System.out.println("\n=====Atendimentos Agendados=====");

            AtendimentoControle atendimentoControle = new AtendimentoControle();        
            List<Atendimento> atendimentos = atendimentoControle.buscarTodosAtendimentos();
            Collections.sort(atendimentos);
        
            for(Atendimento atendimento : atendimentos){
                System.out.println("\n Data: "+atendimento.getDataAtendimento()+
                        " Horario: "+atendimento.getHorario()+" Paciente: "+atendimento.getPaciente()+
                        " Medidco:"+atendimento.getMedico()+" Situacao:"+atendimento.getSituacao()+"\n====================================");
            }
    }
    
}

 

