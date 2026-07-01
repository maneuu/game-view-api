package com.pweb.game_view_api.guilda;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guilda")
@CrossOrigin
public class GuildaController {

    private final GuildaService service;

    public GuildaController(GuildaService service) {
        this.service = service;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Guilda> all() {
        return this.service.all();
    }

    @GetMapping("/get/jogador/{idJogador}")
    @ResponseStatus(HttpStatus.OK)
    public List<Guilda> byJogador(@PathVariable Long idJogador) {
        return this.service.getByIdJogador(idJogador);
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Guilda one(@PathVariable Long id) {
        return this.service.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Guilda create(@RequestBody Guilda entity) {
        return this.service.create(entity);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Guilda update(
            @PathVariable Long id,
            @RequestBody Guilda entity) {

        entity.setIdGuilda(id);

        return this.service.update(entity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @PatchMapping("/patch/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Guilda patch(
            @PathVariable Long id,
            @RequestBody Guilda entity) {

        return this.service.patch(id, entity);
    }
}
