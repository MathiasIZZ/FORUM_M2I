package mathias.m2i.forum.services;

import mathias.m2i.forum.entities.Message;
import mathias.m2i.forum.entities.Sujet;
import mathias.m2i.forum.repositories.MessageRepository;
import mathias.m2i.forum.repositories.SujetRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class SujetService {

    private SujetRepository sujetRepository;
    private MessageRepository messageRepository;
    private MessageService messageService;

    public SujetService(SujetRepository sujetRepository, MessageRepository messageRepository, MessageService messageService) {
        this.sujetRepository = sujetRepository;
        this.messageRepository = messageRepository;
        this.messageService = messageService;
    }

    public List<Sujet> findAll() {
        return this.sujetRepository.findAll();
    }

    public Sujet findById(String id) {
        return this.sujetRepository.findById(id).get();
    }

    public void like(String id) {
        Sujet sujet = this.sujetRepository.findById(id).get();
        sujet.setLikes(sujet.getLikes() + 1);
        this.sujetRepository.save(sujet);
    }

    public void unlike(String id) {
        Sujet sujet = this.sujetRepository.findById(id).get();
        sujet.setLikes(sujet.getLikes() - 1);
        this.sujetRepository.save(sujet);
    }

    public Sujet ajoutMessage(String id, Message message) {
        Sujet sujet = this.sujetRepository.findById(id).get();
        message = this.messageService.save(message);
        sujet.addMessage(message);

        return this.sujetRepository.save(sujet);
    }

    public List<Message> loadMessageFromSujet(String id) {
        Sujet sujet = this.sujetRepository.findById(id).get();
        return this.sujetRepository.
    }

    public Sujet save(Sujet sujet) {
        sujet.setCreatedDate(LocalDateTime.now());
        sujet.setUpdatedDate(LocalDateTime.now());
        sujet.setLikes(0);
        sujet.setMessages(new ArrayList<>());
        return this.sujetRepository.save(sujet);
    }

    public void delete(String id) {
        this.sujetRepository.deleteById(id);
    }



}
