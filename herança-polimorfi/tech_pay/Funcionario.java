package tech_pay;

abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {return nome;}
    public String getMatricula() {return matricula;}
    public double getSalarioBase() {return salarioBase;}


    public void setNome (String nome) {this.nome = nome;}
    public void setMatricula (String matricula) {this.matricula = matricula;}
    public void setSalarioBase (double salarioBase) {this.salarioBase = salarioBase;}

    //o tipo do metodo (double)//
    public abstract double salarioLiquido();

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("matricula: " + matricula);
        System.out.println("salario base: R$" + salarioBase);
    }
}
