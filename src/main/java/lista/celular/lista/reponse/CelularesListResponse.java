package lista.celular.lista.reponse;

import lista.celular.lista.doMain.Celulares;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CelularesListResponse {


    private List<Celulares> celularesList;
}
