package mathias.m2i.forum.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sujets")
public class Sujet {

    @Id
    private String id;

    private String title;
    private int likes;
    private List<Message> messages;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public void addMessage(Message message) {
        this.messages.add(message);
    }

}
