package dio.web.api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;

    // Construtor padrão (necessário para o Spring/JPA)
    public Usuario() {}

    // Construtor com todos os campos
    public Usuario(Integer id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString() para facilitar a visualização
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}