package lista.celular.lista.controllers;

import lista.celular.lista.doMain.Celulares;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/celular")
public class CelularControllers {


    private final CelularService celularService;


    public CelularControllers(CeluaresService celuaresService){
        this.celularService = celuaresService;
    }
    @GetMapping
    public ResponseEntity<List<Celulares>> getCelulares(){
        List<Celulares> celulares = this.celularService.getCelularesFromLibriary();
        return ResponseEntity.ok().body(Celulares);
    }

}
