package mathias.m2i.forum.config;

import mathias.m2i.forum.repositories.MessageRepository;
import mathias.m2i.forum.repositories.SujetRepository;
import mathias.m2i.forum.services.MessageService;
import mathias.m2i.forum.services.SujetService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MessageService messageServiceFactory(MessageRepository messageRepository) {
        return new MessageService(messageRepository);
    }

    @Bean
    public SujetService sujetServiceFactory(SujetRepository sujetRepository,
                                            MessageRepository messageRepository,
                                            MessageService messageService) {
        return new SujetService(sujetRepository, messageRepository, messageService);
    }

}
