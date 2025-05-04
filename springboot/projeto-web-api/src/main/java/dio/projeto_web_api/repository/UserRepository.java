package dio.projeto_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.projeto_web_api.model.User;

@Repository
public class UserRepository {
 public void save(User usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(User usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("fernando","password"));
        usuarios.add(new User("maluke","masterpass"));
        return usuarios;
    }
    public User finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("fernando","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o nome: %s para localizar um usuário", username));
        return new User("fernando","password");
    }


}
