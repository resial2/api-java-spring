package br.com.resial.apijavaspring.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuarios")
public class UsuarioModel {

    @Id
    public Integer id;
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = false, length = 10)
    public String login;
    @Column(nullable = false, length = 10)
    public String password;

    public UsuarioModel() {}

    public UsuarioModel(UsuarioModelDTO usuarioModelDTO) {
        setId(usuarioModelDTO.getId());
        setNome(usuarioModelDTO.getNome());
        setLogin(usuarioModelDTO.getLogin());
        setPassword(usuarioModelDTO.getPassword());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
