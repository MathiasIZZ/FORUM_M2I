package mathias.m2i.forum.controllers;

import mathias.m2i.forum.entities.Message;
import mathias.m2i.forum.entities.Sujet;
import mathias.m2i.forum.services.SujetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("sujets")
public class SujetController {

    @Autowired
    private SujetService sujetService;

    @GetMapping("/all")
    public List<Sujet> findAll() {
        return this.sujetService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        this.sujetService.delete(id);
    }

    @PostMapping
    public Sujet postSujet(@RequestBody Sujet sujet) {
        return this.sujetService.save(sujet);
    }

    @PostMapping("/{id}/message")
    public Sujet addMessage(@PathVariable String id,
                            @RequestBody Message message) {
        return this.sujetService.ajoutMessage(id, message);
    }



    @GetMapping("like/{id}")
    public void likeTheSujet(@PathVariable String id) {
        this.sujetService.like(id);
    }

    @GetMapping("unlike/{id}")
    public void unlikeTheSujet(@PathVariable String id) {
        this.sujetService.unlike(id);
    }









}
