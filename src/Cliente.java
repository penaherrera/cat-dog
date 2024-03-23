public class Cliente extends Usuario{
    boolean esDuenio;


    public Cliente(int usuarioId, String usuarioAlias, String contrasenia, boolean esDuenio){
        super(usuarioId, usuarioAlias, contrasenia);
        this.esDuenio = esDuenio;
    }

    public boolean getEsDuenio() {
        return esDuenio;
    }


}
