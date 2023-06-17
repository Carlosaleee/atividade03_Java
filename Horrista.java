package atividade03;

    public abstract class Horrista extends Funcionario {
    private double valorHora;
    private double horasTrabalhadas;
    
    public Horrista(String nome, String cpf, String endereco, String telefone, String setor, double valorHora, double horasTrabalhadas) {
        super(nome, cpf, endereco, telefone, setor);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
