package com.pweb.game_view_api.jogador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogador")
@CrossOrigin
public class JogadorController {

    private final JogadorService service;

    public JogadorController(JogadorService service) {
        this.service = service;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Jogador> all() {
        return this.service.all();
    }

    @GetMapping("/top10")
    @ResponseStatus(HttpStatus.OK)
    public List<Jogador> top10() {
        return this.service.top10ByPontuacao();
    }

    @GetMapping("/get/nome/{nomeUsuario}")
    @ResponseStatus(HttpStatus.OK)
    public List<Jogador> byNomeUsuario(@PathVariable String nomeUsuario) {
        return this.service.getByNomeUsuario(nomeUsuario);
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Jogador one(@PathVariable Long id) {
        return this.service.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Jogador create(@RequestBody Jogador entity) {
        return this.service.create(entity);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Jogador update(
            @PathVariable Long id,
            @RequestBody Jogador entity) {

        entity.setIdJogador(id);

        return this.service.update(entity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @PatchMapping("/patch/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Jogador patch(
            @PathVariable Long id,
            @RequestBody Jogador entity) {

        return this.service.patch(id, entity);
    }
}