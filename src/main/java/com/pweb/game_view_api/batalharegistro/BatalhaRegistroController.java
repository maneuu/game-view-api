package com.pweb.game_view_api.batalharegistro;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batalha-registro")
@CrossOrigin
public class BatalhaRegistroController {

    private final BatalhaRegistroService service;

    public BatalhaRegistroController(BatalhaRegistroService service) {
        this.service = service;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<BatalhaRegistro> all() {
        return this.service.all();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BatalhaRegistro one(@PathVariable Long id) {
        return this.service.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public BatalhaRegistro create(@RequestBody BatalhaRegistro entity) {
        return this.service.create(entity);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BatalhaRegistro update(
            @PathVariable Long id,
            @RequestBody BatalhaRegistro entity) {

        entity.setIdBatalha(id);

        return this.service.update(entity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @PatchMapping("/patch/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BatalhaRegistro patch(
            @PathVariable Long id,
            @RequestBody BatalhaRegistro entity) {

        return this.service.patch(id, entity);
    }
}
