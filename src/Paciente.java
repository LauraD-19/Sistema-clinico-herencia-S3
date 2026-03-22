public class Paciente {
    protected String nombre;
    protected int documento;
    protected double costoConsulta;

    public Paciente() {
    }

    public Paciente(String nombre, int documento, double costoConsulta) {
        this.nombre = nombre;
        this.documento = documento;
        this.costoConsulta = costoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                " --Nombre='" + nombre + '\'' +
                ", --Documento=" + documento +
                ", --CostoConsulta=" + costoConsulta;
    }
    public String mostrarInfo(){
        return "--Nombre: "+nombre+" --Documento:"+documento+" --Costo consulta: "+costoConsulta;
    }

    public double calcularCostoFinal(){
        return costoConsulta;

    }
    public double aplicarDescuento(double porcentaje){
        double des1=costoConsulta*porcentaje;
        double des2=costoConsulta-des1;
        return  des2;
    }
    public double aplicarRecargo(double porcentaje){
        double des1=costoConsulta*porcentaje;
        double des2=costoConsulta+des1;
        return  des2;

    }
    public boolean consultaCosto(){
        return this.costoConsulta>300000;
    }

}
