package mathias.m2i.forum.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "message")
@CrossOrigin
public class Message {

    @Id
    private String id;

    private String content;
    private int likes;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;


}
