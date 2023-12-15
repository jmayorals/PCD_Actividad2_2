package actividad2parte2;

public class puente {
	private int cochesEnElPuente = 0;
    private String direccionActual = null;

    public synchronized void entrar(String direccion) {
        if (direccionActual == null || direccion.equals(direccionActual)) {
            cochesEnElPuente++;
            if (direccionActual == null) {
                direccionActual = direccion;
            }
            System.out.println("Coche desde el " + direccion + " entrando al puente.");
        } else {
            System.out.println("Esperando: Coche desde el " + direccion + " esperando a cruzar.");
        }
    }

    public synchronized void salir() {
        cochesEnElPuente--;
        if (cochesEnElPuente == 0) {
            direccionActual = null;
            System.out.println("Puente vacío.");
        }
        System.out.println("Coche saliendo del puente.");
    }
}