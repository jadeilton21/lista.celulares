package lista.celular.lista.cliente;

import com.sun.jdi.InterfaceType;
import lista.celular.lista.reponse.CelularesListResponse;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
public interface CelularCliente {

    CelularesListResponse getCelulares();
}
