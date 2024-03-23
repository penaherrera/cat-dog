import javax.swing.*;

public class Medico extends Usuario{
    String especialidad;

    public Medico(int usuarioId, String usuarioAlias, String contrasenia, String especialidad){
        super(usuarioId, usuarioAlias, contrasenia);
        this.especialidad = especialidad;
    }

    public void escenarioMedico(Mascota mascota, Cita cita){
        JOptionPane.showMessageDialog(null, "Bienvenido, Medico veterinario: " + this.usarioAlias);
        JOptionPane.showMessageDialog(null, "Tienes agendada una cita con " + mascota.getNombre() +
                " a las:" + cita.getHora());
    }
}
