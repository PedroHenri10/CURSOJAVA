package domain.animal;

public abstract class Animal {
    private static int contador =1;
    private int id;
    private String nome;
    private int idade;
    private TipoPelo tipoPelo;
    private String nomeDono;

    public Animal(String nome, int idade, TipoPelo tipoPelo, String nomeDono) {
        this.id = contador++;
        this.nome = nome;
        this.idade = idade;
        this.tipoPelo = tipoPelo;
        this.nomeDono = nomeDono;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public TipoPelo getTipoPelo() {
        return tipoPelo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s | Idade: %d | Pelo: %s | Tutor: %s",
                id, nome, idade, tipoPelo.name(), nomeDono);
    }
}
