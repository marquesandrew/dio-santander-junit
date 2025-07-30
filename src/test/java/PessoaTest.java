import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Maria", LocalDate.of(2014,5,26));
        Assertions.assertEquals(11, pessoa.getIdade());
    }
}
