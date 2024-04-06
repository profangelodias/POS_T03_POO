package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.composicoes.Cargo;
import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.composicoes.Telefone;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario() {
    }
    public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato, int matricula,
                       Cargo cargo, double salario, LocalDate dataAdmissao) {
        super(nome, dataNascimento, endereco, telsContato);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public void reajustarSalario(double percentual){
        this.salario = this.salario * (1 + (percentual/100));
    }
    public void promover(Cargo novoCargo){
        this.cargo = novoCargo;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
