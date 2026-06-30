package com.pweb.game_view_api.personagem;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personagem")
@CrossOrigin
public class PersonagemController {

    private final PersonagemService service;

    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Personagem> all() {
        return this.service.all();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Personagem one(@PathVariable Long id) {
        return this.service.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Personagem create(@RequestBody Personagem entity) {
        return this.service.create(entity);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Personagem update(
            @PathVariable Long id,
            @RequestBody Personagem entity) {

        entity.setIdPersonagem(id);

        return this.service.update(entity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @PatchMapping("/patch/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Personagem patch(
            @PathVariable Long id,
            @RequestBody Personagem entity) {

        return this.service.patch(id, entity);
    }
}
