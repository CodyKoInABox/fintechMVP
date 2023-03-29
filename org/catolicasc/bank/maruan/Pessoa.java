package org.catolicasc.bank.maruan;
import java.util.Date;

public class Pessoa {
    
    private String nome;

    private String cpf;

    private Date nascimento;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 11 && cpf.matches("-?\\d+(\\.\\d+)?")){
            this.cpf = cpf;
        }
        else{
            System.out.println("CPF invalido.");
        }
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", nascimento='" + getNascimento() + "'" +
            "}";
    }

}
