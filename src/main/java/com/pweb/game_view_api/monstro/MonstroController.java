package com.pweb.game_view_api.monstro;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monstro")
@CrossOrigin
public class MonstroController {

    private final MonstroService service;

    public MonstroController(MonstroService service) {
        this.service = service;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Monstro> all() {
        return this.service.all();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Monstro one(@PathVariable Long id) {
        return this.service.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Monstro create(@RequestBody Monstro entity) {
        return this.service.create(entity);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Monstro update(
            @PathVariable Long id,
            @RequestBody Monstro entity) {

        entity.setIdMonstro(id);

        return this.service.update(entity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @PatchMapping("/patch/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Monstro patch(
            @PathVariable Long id,
            @RequestBody Monstro entity) {

        return this.service.patch(id, entity);
    }
}
