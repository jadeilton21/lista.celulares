package lista.celular.lista.doMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Celulares {



    public String marca;
    public String fabricante;
    public String cor;
    public String imagem;
    @JsonProperty("year_of_publication")
    public String ano_fabricacao;
    public String isbn;
    

}
