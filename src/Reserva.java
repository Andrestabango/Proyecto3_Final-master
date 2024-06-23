public class Reserva {
    protected int horasReserva;
    protected String dia;
    protected Parqueadero parqueadero;
    protected Vehiculo vehiculo;
    protected Persona persona;

    public Reserva(int horasReserva, String dia, Parqueadero parqueadero, Vehiculo vehiculo, Persona persona) {
        this.horasReserva = horasReserva;
        this.dia = dia;
        this.parqueadero = parqueadero;
        this.vehiculo = vehiculo;
        this.persona = persona;
    }

    public int getHorasReserva() {
        return horasReserva;
    }

    public void setHorasReserva(int horasReserva) {
        this.horasReserva = horasReserva;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


}
