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
        return "Paciente VIP: " + super.toString()+
                ", --años Fidelidad='" + aniosFidelidad+"' }";
    }
    @Override
    public String mostrarInfo(){
        return "Paciente VIP: "+"--Nombre: "+nombre+" --Documento:"+documento+" --Costo consulta: "+costoConsulta+" --Años de fidelidad: "+aniosFidelidad;
    }
    @Override
    public double calcularCostoFinal(){
        double descuento;
        if(aniosFidelidad==10) {
            System.out.println("Se le hizo un descuento del 40%");
            descuento=(0.40);
        } else if (aniosFidelidad==5) {
            System.out.println("Se le hizo un descuento del 30%");
            descuento=(0.30);
        } else {
            System.out.println("Se le hizo un descuento del 20%");
            descuento=(0.20);
        }
        double total = aplicarDescuento(descuento);
        if (total>300000) {
            return total=300000;
        }
        return total;

    }

}
