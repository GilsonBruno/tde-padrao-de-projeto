package atividade1;

/**
 * ATIVIDADE 1 — SRP: classe de modelo (dados apenas).
 *
 * Antes da refatoração, Usuario também autenticava (duas responsabilidades).
 * Agora ela tem UMA única razão para mudar: a estrutura dos dados do usuário.
 */
public class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
