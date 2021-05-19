package paquete6;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

public class ArchivoEscritura {

    private String nombreArchivo;
    private String rutaArchivo;
    private Hospital registro;
    private Formatter salidaArchivo;

    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("C:\\Users\\pc\\Desktop\\Programación orientada a objetos\\Talleres\\clase07-JandryJaramillo/%s",
                obtenerNombreArchivo());
        // sacar la información del archivo, previo a volver 
        // a trabajar con el mimso.
        establecerInformacionAnterior();
        

    }

    public void establecerInformacionAnterior() {
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        ArrayList<Hospital> lista = lectura.obtenerLista();

        try {
            salidaArchivo = new Formatter(rutaArchivo);
            if (lista != null) {

                if (lista.size() > 0) {
                    for (int i = 0; i < lista.size(); i++) {
                        Hospital p1 = lista.get(i);
                        establecerRegistro(p1);
                        establecerSalida();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo: " + e);

        } // fin de catch
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("C:\\Users\\pc\\Desktop\\Programación orientada a objetos\\Talleres\\clase07-JandryJaramillo/%s.txt",
                obtenerNombreArchivo());;
    }

    public void establecerRegistro(Hospital n) {
        registro = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Hospital obtenerRegistro() {
        return registro;
    }

    // agrega registros al archivo
    public void establecerSalida() {
        try {
            Hospital p = obtenerRegistro();
            String cadenaRegistro = String.format("%s;%d;%2f",
                    p.obtenerNombre(), p.obtenerNumeroCamas(), p.obtenerPresupuesto());
            salidaArchivo.format("%s\n", cadenaRegistro);

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }

    }

    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        } // cierra el archivo

    }

}
