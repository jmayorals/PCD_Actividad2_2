package actividad2parte2;

public class main {
	public static void main(String[] args) {
        puente puente = new puente();

        for (int i = 0; i < 10; i++) {
            String direccion = (i % 2 == 0) ? "Norte" : "Sur";
            Thread coche = new Thread(new coche(puente, direccion));
            coche.start();
        }
    }
}
