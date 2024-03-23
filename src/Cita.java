class Cita {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mascota mascota;

    public Cita(String fecha, String hora, Cliente cliente, Mascota mascota) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mascota = mascota;
    }

    public String getHora() {
        return hora;
    }
}
