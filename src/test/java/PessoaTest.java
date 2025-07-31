import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PessoaTest {

    @Mock
    private List<String> letras;

    @Test
    void adicionarItemLista() {
        Mockito.when(letras.get(0)).thenReturn("B");
    }

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Maria", LocalDate.of(2014,5,26));
        Assertions.assertEquals(11, pessoa.getIdade());
    }


}
