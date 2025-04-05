package dio.web.api.repository;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    // Salva ou atualiza um usuário
    public void save(Usuario usuario) {
        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        
        System.out.println(usuario);
    }

    // Deleta um usuário por ID
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
    }

    // Retorna todos os usuários (simulação com dados fixos)
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "gleyson", "password"));
        usuarios.add(new Usuario(2, "frank", "masterpass"));
        return usuarios;
    }

    // Busca um usuário por ID (simulação)
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario(id, "gleyson", "password"); // Simulação
    }

    // Busca um usuário por username (simulação)
    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario(1, username, "password"); // Simulação
    }
}