import java.util.function.Function;

class UsuarioDTO {
    String nome;
    public UsuarioDTO(String nome) { this.nome = nome; }
}

class Usuario {
    String nome;
    public Usuario(String nome) { this.nome = nome; }
}

public class FunctionAv2 {
    public static void main(String[] args) {

        Function<UsuarioDTO, Usuario> converter =
                dto -> new Usuario(dto.nome);

        UsuarioDTO dto = new UsuarioDTO("Pedro");
        Usuario u = converter.apply(dto);

        System.out.println(u.nome);
    }
}
