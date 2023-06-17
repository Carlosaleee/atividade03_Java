
package atividade03;

import java.util.ArrayList;
import java.util.Scanner;


public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int quantidadeFuncionarios = 0;
        
        System.out.println("CADASTRO DE FUNCIONARIOS\n");
        System.out.println("- Digite o Numero de Funcionarios que serao Cadastrados.");
        System.out.print("  Limite Maximo ( 10 Cadastros) : ");
        quantidadeFuncionarios = sc.nextInt();
        sc.nextLine();
        
        
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("\n" + (i+1) +"* Funcionario: \n");
            System.out.print("- Digite o Nome: ");
            String nome = sc.nextLine();
            System.out.print("- Digite o CPF: ");
            String cpf = sc.nextLine();
            System.out.print("- Digite o Endereco: ");
            String endereco = sc.nextLine();
            System.out.print ("- Digite o Telefone: ");
            String telefone = sc.nextLine();
            System.out.print("- Digite o Setor: ");
            String setor = sc.nextLine();
            System.out.println("\n- Qual o Tipo de Funcionario ?" ); 
            System.out.print(" [A] Assalariado  |  [H] Horista: ");
            String tipoFuncionario = sc.nextLine();
            
            if (tipoFuncionario.equalsIgnoreCase("A")) {
                System.out.print("\n- Digite o Valor do Salario atual: R$ ");
                double salario = sc.nextDouble();
                sc.nextLine();
                
                
                Assalariado funcionario = new Assalariado(nome, cpf, endereco, telefone, setor, salario) {};
                funcionarios.add(funcionario);
            } else if (tipoFuncionario.equalsIgnoreCase("H")) {
                System.out.print ("\n- Digite o valor da hora trabalhada: R$ ");
                double valorHora = sc.nextDouble();
                sc.nextLine();
                System.out.print ("- Digite o numero de horas trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                sc.nextLine();
                
                
               Horrista funcionario = new Horrista (nome, cpf, endereco, telefone, setor, valorHora, horasTrabalhadas) {};
                funcionarios.add(funcionario);
            }
        }
        
               for (Funcionario funcionario : funcionarios) {
                   
            System.out.println("\n Cadastro Finalizado.\n");
            System.out.println("- Nome: " + funcionario.getNome());
            System.out.println("- CPF: " + funcionario.getCpf());
            System.out.println("- Endereço: " + funcionario.getEndereco());
            System.out.println("- Telefone: " + funcionario.getTelefone());
            System.out.println("- Setor: " + funcionario.getSetor());
            System.out.println("- Salario: R$" + funcionario.calcularSalario());
            System.out.println();
        }
        
               System.out.print("- Digite o Aumento Percentual ( % ) para o Reajuste Salarial: ");
        double aumentoPercentual = sc.nextDouble();
        sc.nextLine();
        
        for (Funcionario funcionario : funcionarios) {
            
            System.out.println("\nCadastro de Funcionarios, apos Atualizacao Salarial: \n");
            System.out.println("- Nome: " + funcionario.getNome());
            System.out.println("- CPF: " + funcionario.getCpf());
            System.out.println("- Endereço: " + funcionario.getEndereco());
            System.out.println("- Telefone: " + funcionario.getTelefone());
            System.out.println("- Setor: " + funcionario.getSetor());
           
            funcionario.aplicarAumento(aumentoPercentual);
            System.out.println();
        }
    
                System.out.println("CADASTROS REALIZADOS COM SUCESSO.");
        
            sc.close();
    }
}