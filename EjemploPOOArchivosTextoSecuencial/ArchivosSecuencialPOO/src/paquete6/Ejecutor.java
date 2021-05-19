package paquete6;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "ciudades.txt";
        
        Hospital c1 = new Hospital("Clínica Jaramillo",12,1550);
        

        ArchivoEscritura escritura = new ArchivoEscritura(nombreArchivo);
        // establecer el valor del atributo registro
        escritura.establecerRegistro(c1);
        // estabalecer en el archivo el atributo del registro
        escritura.establecerSalida(); 
        
        escritura.cerrarArchivo();
        
        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
