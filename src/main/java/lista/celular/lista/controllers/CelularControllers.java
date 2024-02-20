package lista.celular.lista.controllers;

import lista.celular.lista.doMain.Celulares;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/celular")
public class CelularControllers {


    private final CelularService celularService;

    public CelularControllers<List<Celulares>> getCelulares(){

    }

}
