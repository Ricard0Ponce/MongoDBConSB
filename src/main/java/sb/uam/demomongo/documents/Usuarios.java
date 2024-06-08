package sb.uam.demomongo.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Usuarios") // Esta anotacion es usada para indicar que esta clase es un documento de MongoDB
public class Usuarios {

    @Id
    private String id;
    private String nombre;
    private String email;

}
