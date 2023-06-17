package atividade03;

    public abstract class Assalariado extends Funcionario {
    private double salarioMensal;
    
    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    public double calcularSalario() {
        return salarioMensal;
    }
}


