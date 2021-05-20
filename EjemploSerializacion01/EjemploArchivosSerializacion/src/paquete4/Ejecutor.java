package paquete4;

public class Ejecutor {
    public static void main(String[] args) {       

        // nombre del archivo
        String nombreArchivo = "Hospital.data";
        
        Hospital hospital1 = new Hospital("Clínica Jaramillo",50,3550);        

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospital(hospital1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();        
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
    }
}
