import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class PacienteEPS extends Paciente{
    private String nombreEPS;

    public PacienteEPS() {
    }

    public PacienteEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    public PacienteEPS(String nombre, int documento, double costoConsulta, String nombreEPS) {
        super(nombre, documento, costoConsulta);
        this.nombreEPS = nombreEPS;
    }

    public String getNombreEPS() {
        return nombreEPS;
    }

    public void setNombreEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    @Override
    public String toString() {
        return "Paciente EPS: "+super.toString()+", --Nombre EPS='" + nombreEPS+"' }";
    }
    @Override
    public String mostrarInfo(){
        return "Paciente EPS: "+"--Nombre: "+nombre+" --Documento:"+documento+" --Costo consulta: "+costoConsulta+" --EPS: "+nombreEPS;
    }
    @Override
    public double calcularCostoFinal(){
        double porcentaje;
        if(costoConsulta==300000 ) {
            porcentaje=0.25;
        } else if (costoConsulta==80000) {
            porcentaje=(0.20);
        }else {
            porcentaje=(0.30);
        }
        double costoso= costoConsulta*porcentaje;
        if(consultaCosto()){
            costoso=costoso-(costoso*0.05);
        }
        return costoso;
    }

}
