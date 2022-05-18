package mathias.m2i.forum.controllers;

import mathias.m2i.forum.entities.Message;
import mathias.m2i.forum.entities.Sujet;
import mathias.m2i.forum.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("messages")
@CrossOrigin
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> findAll() {
        return this.messageService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMessage(@PathVariable() String id) {
        this.messageService.deleteById(id);
    }
    @PostMapping
    public Message save(@RequestBody Message message) {
        return this.messageService.save(message);
    }

    @GetMapping("/like/{id}")
    public void likeTheSujet(@PathVariable String id) {
        this.messageService.like(id);
    }

    @GetMapping("/unlike/{id}")
    public void unlikeTheSujet(@PathVariable String id) {
        this.messageService.unlike(id);
    }





}
