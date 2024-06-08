package sb.uam.demomongo.repository;

import sb.uam.demomongo.documents.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuarios, Integer> {

}
