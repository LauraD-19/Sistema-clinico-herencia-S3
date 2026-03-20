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
        if (costoConsulta==400000){
           aplicarDescuento();
        }else if (costoConsulta==200000){
            aplicarDescuento();
        }

        return costoConsulta;
    }
    @Override
    public double aplicarDescuento(double costoConsulta){
        if (costoConsulta==400000){
            double c1=costoConsulta*0.15;
            double cc1=costoConsulta-c1;
            System.out.println("Descuento aplicado del 15%, la consulta queda en: "+cc1);
        }else if (costoConsulta==200000){
            double c2=costoConsulta*0.10;
            double cc2=costoConsulta-c2;
            System.out.println("Descuento aplicado del 10%, la consulta queda en: "+cc2);
        }
        return costoConsulta;
    }
    @Override
    public double aplicarRecargo(double costoConsulta){
        if (costoConsulta==50000){
            double c5=costoConsulta*0.05;
            double cc5=costoConsulta+c5;
            System.out.println("Se le aplico un recargo del 5%, la consulta queda en: "+cc5);
        }
        return costoConsulta;
    }
}
