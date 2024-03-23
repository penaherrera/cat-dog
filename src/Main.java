import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        // Crear usuarios para el escenario
        Administrador admin = new Administrador(1, "Daniel", "admin123");
        Cliente cliente = new Cliente(2, "Carlos", "cliente123", true);
        Medico medico = new Medico(2, "Jorge", "medico123", "Medico en Gatos");

        // Simular creación de cita
        if (cliente.getEsDuenio()) {
            JOptionPane.showMessageDialog(null, "Bienvenido, cliente: " + cliente.getUsarioAlias());

            String mascotaNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de su mascota:");

            String[] fechasDisponibles = {"01/03/2024","03/03/2024","04/03/2024","05/03/2024"};
            String fecha = (String) JOptionPane.showInputDialog(null, "Seleccione la hora de la cita:",
                    "Seleccione la fecha de la cita", JOptionPane.QUESTION_MESSAGE, null, fechasDisponibles,
                    fechasDisponibles[0]);


            String[] horasDisponibles = {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00"};

            // Crear el selector de hora
            String hora = (String) JOptionPane.showInputDialog(null, "Seleccione la hora de la cita:",
                    "Seleccione la hora de la cita", JOptionPane.QUESTION_MESSAGE, null, horasDisponibles,
                    horasDisponibles[0]);

            Mascota mascota = new Mascota(mascotaNombre,null,null,0);

            Cita cita = new Cita(fecha, hora, cliente, mascota);

            JOptionPane.showMessageDialog(null, "Cita creada exitosamente para la mascota " + mascota.getNombre() +
                    " el " + fecha + " a las " + hora + ".");

            //Continuando al simulacion del lado del medico veterinario
            JOptionPane.showMessageDialog(null, "...El dia de la cita");

            medico.escenarioMedico(mascota, cita);

        } else {
            JOptionPane.showMessageDialog(null, "No puedes crear una cita ya que no eres dueño de una mascota.");
        }
    }
}