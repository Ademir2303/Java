package tech_pay;

class Dev extends Funcionario {
    private String nivel;

    public Dev(String nome, String matricula, double salarioBase, String nivel) {
        super(nome, matricula, salarioBase);
        this.nivel = nivel;
    }

    @Override
    public double salarioLiquido() {
        double fator;

        switch (nivel.toLowerCase()) {
            case "junior" -> fator = 1.1;
            case "pleno" -> fator = 1.3;
            case "senior" -> fator = 1.5;
            default -> fator = 1.0;
        }

        return getSalarioBase() * fator;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Dev");
        System.out.println("Nível: " + nivel);
        System.out.println("Salário Líquido: R$ " + salarioLiquido());
    }
}