import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        List<Paciente> PacienteList = new ArrayList<>();
        int op;
        int buscar;
        int op2;

        System.out.println("Bienvenido");
        do {
            System.out.println("Digite una de las siguiente opnciones:\n1.Registrar paciente particular \n2.Registrar paciente de Eps\n3.Registrar paciente VIP\n4.Buscar paciente por documento\n5.Mostrar todos los pacientes\n6.Mostrar paciente por tipo\n7.Calcular costo consulta del paciente\n8.Mostrar paciente con consulta costosa\n9.Mostrar paciente que mas pago\n10.Salir");
            op= teclado.nextInt();
            switch (op){
                case 1://particular
                    PacientePA(teclado, PacienteList);
                    break;
                case 2://eps
                    PacienteEPS(teclado, PacienteList);
                    break;

                case 3://vip
                    PacienteVIP(teclado, PacienteList);
                    break;

                case 4://Buscar
                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                    buscar = teclado.nextInt();
                    boolean encontrado = false;
                    for (Paciente P : PacienteList) {
                        if (P.getDocumento() == buscar) {
                            System.out.println(P);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Paciente no encontrado");
                    }
                    break;

                case 5://mostrar pacientes
                    System.out.println("Empleados: \n");
                    for (Paciente E : PacienteList) {
                        System.out.println(E.mostrarInfo());
                    }
                    break;

                case 6://mostrar paciente por tipo
                    System.out.println("Digite para mostrar el tipo de paciente: 1.Particular\n2.De EPS\n3.VIP");
                    op2 = teclado.nextInt();
                    switch (op2){
                        case 1://ad
                            System.out.println("Pacientes particulares: \n");
                            for(Paciente E:PacienteList){
                                if(E instanceof PacienteParticular){
                                    System.out.println(E.mostrarInfo());
                                }
                            }
                            break;

                        case 2://ve
                            System.out.println("Pacientes EPS: \n");
                            for(Paciente E:PacienteList){
                                if(E instanceof PacienteVIP){
                                    System.out.println(E.mostrarInfo());
                                }
                            }
                            break;

                        case 3://ho
                            System.out.println("Paciente VIP: \n");
                            for(Paciente E:PacienteList){
                                if(E instanceof PacienteVIP){
                                    System.out.println(E.mostrarInfo());
                                }
                            }
                            break;
                        default:
                            System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
                    }
                    break;
                case 7://calcular costo
                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                    buscar = teclado.nextInt();
                    boolean encontrado1 = false;
                    for (Paciente P : PacienteList) {
                        if (P.getDocumento() == buscar) {
                            System.out.println(P);
                            P.calcularCostoFinal();
                            encontrado1 = true;
                            break;
                        }
                    }
                    if (!encontrado1) {
                        System.out.println("Paciente no encontrado");
                    }
                    break;

                case 8://consulta costosa
                    System.out.println("--Empleados mayores de edad: ");
                    for(Paciente Pa: PacienteList){
                        if(Pa.consultaCosto()){
                            System.out.println("--"+Pa.getNombre()+ " Consulta costosa \n");
                        }
                    }
                    break;

                case 9://paciente que mas pago

                case 10:
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;

                default:

                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
            }
        }while (op!=10);

    }
    private static void PacientePA(Scanner teclado, List<Paciente> PacienteList) {
        teclado.nextLine();
        System.out.println("Nombre del paciente:");
        String nombre = teclado.nextLine();
        System.out.println("Documento del paciente (sin comas, puntos o espacios): ");
        int documento = teclado.nextInt();
        System.out.println("Costo de la consulta:");
        double costoConsulta = teclado.nextDouble();

        PacienteParticular pacienteP = new PacienteParticular(nombre, documento, costoConsulta);
        PacienteList.add(pacienteP);
        System.out.println("\n--Paciente regiustrado");
    }

    private static void PacienteEPS(Scanner teclado, List<Paciente> PacienteList) {
        teclado.nextLine();
        System.out.println("Nombre del paciente:");
        String nombre = teclado.nextLine();
        System.out.println("Documento del paciente (sin comas, puntos o espacios): ");
        int documento = teclado.nextInt();
        System.out.println("Costo de la consulta:");
        double costoConsulta = teclado.nextDouble();
        System.out.println("Nombre de la EPS: ");
        String nombreEPS= teclado.nextLine();

        PacienteEPS pacienteE = new PacienteEPS(nombre, documento, costoConsulta, nombreEPS);
        PacienteList.add(pacienteE);
        System.out.println("\n--Paciente regiustrado");
    }

    private static void PacienteVIP(Scanner teclado, List<Paciente> PacienteList) {
        teclado.nextLine();
        System.out.println("Nombre del paciente:");
        String nombre = teclado.nextLine();
        System.out.println("Documento del paciente (sin comas, puntos o espacios): ");
        int documento = teclado.nextInt();
        System.out.println("Costo de la consulta:");
        double costoConsulta = teclado.nextDouble();
        System.out.println("Años de fidelidad: ");
        int anosfidelidad= teclado.nextInt();

        PacienteVIP pacienteV = new PacienteVIP(nombre, documento, costoConsulta, anosfidelidad);
        PacienteList.add(pacienteV);
        System.out.println("\n--Paciente regiustrado");
    }
}

