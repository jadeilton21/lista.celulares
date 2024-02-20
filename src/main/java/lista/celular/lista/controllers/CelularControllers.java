package lista.celular.lista.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/celular")
public class CelularControllers {


    private final CelularService celularService;

    public CelularControllers<List<Celulares>> getCelulares(){

    }

}
