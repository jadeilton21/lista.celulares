package lista.celular.lista.cliente;

import com.sun.jdi.InterfaceType;
import lista.celular.lista.reponse.CelularesListResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "celulares-api", url = "https://celulares-exemplos-api.s3.us-east-2.amazonaws.com/celulares.json")
public interface CelularCliente {
    @GetMapping
    CelularesListResponse getCelulares();
}
