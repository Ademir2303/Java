package drive_now;

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nCilindradas: " + cilindradas;
    }

    @Override
    public double calcularValorLocacao(int dias) {
        return dias * 120.0;
    }
}
