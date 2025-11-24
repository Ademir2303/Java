package drive_now;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    
    public String exibirDados() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano;
    }

    
    public abstract double calcularValorLocacao(int dias);
}