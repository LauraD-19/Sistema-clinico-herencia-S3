public class PacienteParticular extends Paciente{

    public PacienteParticular() {
    }

    public PacienteParticular(String nombre, int documento, double costoConsulta) {
        super(nombre, documento, costoConsulta);
    }

    @Override
    public String toString() {
        return "Paciente particular: " + super.toString();
    }

    @Override
    public String mostrarInfo(){
        return "Paciente Particular: "+"--Nombre: "+nombre+" --Documento:"+documento+" --Costo consulta: "+costoConsulta;
    }
    @Override
    public double calcularCostoFinal(){
        double total;
        if(costoConsulta==400000) {
            System.out.println("Se le hizo un descuento del 15%");
            total=aplicarDescuento(0.15);
        } else if (costoConsulta==200000) {
            System.out.println("Se le hizo un descuento del 10%");
            total=aplicarDescuento(0.10);
        } else if (costoConsulta==50000) {
            System.out.println("Se le hizo un recargo del 5%");
            total=aplicarRecargo(0.05);
        } else {
            total=costoConsulta;
        }
        return total;
    }
}
