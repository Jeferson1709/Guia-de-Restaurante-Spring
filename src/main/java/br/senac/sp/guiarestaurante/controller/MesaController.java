package br.senac.sp.guiarestaurante.controller;

import br.senac.sp.guiarestaurante.model.Mesa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mesa")
public class MesaController {
    @PostMapping
    public ResponseEntity<Mesa> criarTipoRestaurante(@RequestBody Mesa mesa) {


        return null;
    }

}
