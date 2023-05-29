class CarroConcreto implements Carro {
    private String modelo;
    private String cor;

    public CarroConcreto(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Cor: " + cor);
    }
}
