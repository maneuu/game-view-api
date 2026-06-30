package com.pweb.game_view_api.missaoregistro;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao-registro")
@CrossOrigin
public class MissaoRegistroController {

    private final MissaoRegistroService service;

    public MissaoRegistroController(MissaoRegistroService service) {
        this.service = service;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<MissaoRegistro> all() {
        return this.service.all();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MissaoRegistro one(@PathVariable Long id) {
        return this.service.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public MissaoRegistro create(@RequestBody MissaoRegistro entity) {
        return this.service.create(entity);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MissaoRegistro update(
            @PathVariable Long id,
            @RequestBody MissaoRegistro entity) {

        entity.setIdMissaoRegistro(id);

        return this.service.update(entity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @PatchMapping("/patch/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MissaoRegistro patch(
            @PathVariable Long id,
            @RequestBody MissaoRegistro entity) {

        return this.service.patch(id, entity);
    }
}
