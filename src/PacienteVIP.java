public class PacienteVIP extends Paciente{
    private int aniosFidelidad;

    public PacienteVIP() {
    }

    public PacienteVIP(int aniosFidelidad) {
        this.aniosFidelidad = aniosFidelidad;
    }

    public PacienteVIP(String nombre, int documento, double costoConsulta, int aniosFidelidad) {
        super(nombre, documento, costoConsulta);
        this.aniosFidelidad = aniosFidelidad;
    }

    public int getAniosFidelidad() {
        return aniosFidelidad;
    }

    public void setAniosFidelidad(int aniosFidelidad) {
        this.aniosFidelidad = aniosFidelidad;
    }

    @Override
    public String toString() {
        return "PacienteVIP: " + super.toString()+
                ", --años Fidelidad=" + aniosFidelidad;
    }
    @Override
    public String mostrarInfo(){
        return "Paciente VIP: "+"--Nombre: "+nombre+" --Documento:"+documento+" --Costo consulta: "+costoConsulta+" --Años de fidelidad: "+aniosFidelidad;
    }
    @Override
    public double calcularCostoFinal(){
        return costoConsulta;
    }
    @Override
    public double aplicarDescuento(){
        return costoConsulta;
    }

}
