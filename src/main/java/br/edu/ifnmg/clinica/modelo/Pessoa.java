
package br.edu.ifnmg.clinica.modelo;

/**
 *
 * @author Zelia
 */
public abstract class Pessoa{
    protected String nome;
    protected String dataNascimento;
    protected String telefone;
    protected String endereco;

    public Pessoa(String nome, String dataNacimento, String telefone, String endereco){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
  
    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}

