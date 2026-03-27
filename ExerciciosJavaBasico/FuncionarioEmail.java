import java.util.Objects;

class FuncionarioEmail {

    String email;

    public Funcionario(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;

        Funcionario f = (Funcionario) o;
        return email.equalsIgnoreCase(f.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email.toLowerCase());
    }

    @Override
    public String toString() {
        return email;
    }
}
