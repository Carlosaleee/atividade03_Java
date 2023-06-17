  
package atividade03;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;
    
    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getSetor() {
        return setor;
    }
    
    public abstract double calcularSalario();
    
    public void aplicarAumento(double percentual) {
        double novoSalario = calcularSalario() * (1 + percentual / 100);
        
        System.out.println("\n- Reajuste Salarial: \n");
        System.out.println("- Funcionario : " + nome);
        System.out.println("- Salario: R$ " + novoSalario);
    }
}