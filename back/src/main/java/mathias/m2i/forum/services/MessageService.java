package mathias.m2i.forum.services;

import mathias.m2i.forum.entities.Message;
import mathias.m2i.forum.repositories.MessageRepository;

import java.time.LocalDateTime;
import java.util.List;

public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<Message> findAll() {
        return this.repository.findAll();
    }
    public Message save(Message message) {
        message.setCreatedDate(LocalDateTime.now());
        message.setUpdatedDate(LocalDateTime.now());
        message.setLikes(0);
        return this.repository.save(message);
    }
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
    public Message findById(String id) {
        return this.repository.findById(id).get();
    }

    public void like(String id) {
        Message message = this.repository.findById(id).get();
        message.setLikes(message.getLikes() + 1);
        this.repository.save(message);
    }
    public void unlike(String id) {
        Message message = this.repository.findById(id).get();
        message.setLikes(message.getLikes() - 1);
        this.repository.save(message);
    }








}
