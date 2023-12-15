package actividad2parte2;

public class coche implements Runnable {
	private puente puente;
    private String direccion;

    public coche(puente puente, String direccion) {
        this.puente = puente;
        this.direccion = direccion;
    }

    @Override
    public void run() {
        while (true) {
            puente.entrar(direccion);

            // Simulación de cruzar el puente
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            puente.salir();
        }
    }
}
