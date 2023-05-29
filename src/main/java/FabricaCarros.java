import java.util.HashMap;
import java.util.Map;

class FabricaCarros {
    private Map<String, Carro> carrosCache = new HashMap<>();

    public Carro getCarro(String chave) {
        Carro carro = carrosCache.get(chave);

        if (carro == null) {

            carro = new CarroConcreto(chave, "Cor Padrão");
            carrosCache.put(chave, carro);
        }

        return carro;
    }
}