package tech_pay;

class Gerente extends Funcionario {
    //atributo//
    private double bonus;
    
    public Gerente (String nome, String matricula, double salarioBase, double bonus ){
        //chamando superclasse//
        super( nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double salarioLiquido(){
        return getSalarioBase() + bonus;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cargo Gerente");
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Líquido: R$ " + salarioLiquido());
    }
}


