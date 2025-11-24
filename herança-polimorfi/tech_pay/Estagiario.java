package tech_pay;

class Estagiario extends Funcionario {
    private int cargaHoraria;

    public Estagiario(String nome, String matricula, double salarioBase, int cargaHoraria) {
        super(nome, matricula, salarioBase);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double salarioLiquido() {
        return getSalarioBase() * (cargaHoraria / 40.0);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Estagiário");
        System.out.println("Carga Horária: " + cargaHoraria + "h semanais");
        System.out.println("Salário Líquido: R$ " + salarioLiquido());
    }
}