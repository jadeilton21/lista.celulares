package lista.celular.lista.service;


import lista.celular.lista.cliente.CelularCliente;
import lista.celular.lista.doMain.Celulares;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelularService {

    private final CelularCliente celularCliente;


    public CelularService(CelularCliente cliente){
        this.celularCliente = cliente;
    }


    public List<Celulares> getCelularesFromLibriary(){

        CelularesListResponse response = this.celularCliente.getCelulares();
        return response.getCelularesList();
    }



}
