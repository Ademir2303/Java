package drive_now;

class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nQuantidade de portas: " + quantidadeDePortas;
    }

    @Override
    public double calcularValorLocacao(int dias) {
        return dias * 200.0;
    }
}

