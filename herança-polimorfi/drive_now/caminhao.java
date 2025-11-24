package drive_now;

class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nCapacidade de carga: " + capacidadeDeCarga + " toneladas";
    }

    @Override
    public double calcularValorLocacao(int dias) {
        return dias * 350.0;
    }
}