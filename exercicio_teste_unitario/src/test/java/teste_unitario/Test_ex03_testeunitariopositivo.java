package teste_unitario;

import org.junit.Test;
import org.junit.Assert;

public class Test_ex03_testeunitariopositivo {

    @Test
    public void validaPalavra (){
        Assert.assertEquals("socorro Deus",Ex03_testunitariopositivo.retornaPalavra());


    }
    
}
