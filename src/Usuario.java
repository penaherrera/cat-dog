public class Usuario {
    public int usuarioId;
    public String usarioAlias;
    public String contrasenia;

    public Usuario(int usuarioId, String usuarioAlias, String contrasenia){
        this.usuarioId = usuarioId;
        this.contrasenia = contrasenia;
        this.usarioAlias = usuarioAlias;
    }

    public String getUsarioAlias() {
        return usarioAlias;
    }
}
