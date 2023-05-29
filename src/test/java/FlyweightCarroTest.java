import org.junit.Test;

import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertSame;

public class FlyweightCarroTest {

    @Test
    public void testFlyweightCarro() {
        FabricaCarros fabricaCarros = new FabricaCarros();


        Carro carro1 = fabricaCarros.getCarro("Modelo A");
        Carro carro2 = fabricaCarros.getCarro("Modelo B");
        Carro carro3 = fabricaCarros.getCarro("Modelo A");


        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
        carro3.exibirInformacoes();


        assertSame(carro1, carro3);
        assertNotSame(carro1, carro2);
    }
}
