public class Sleep {

    public static void main(String[] args) {

        try {
            System.out.println("Esperando...");

            Thread.sleep(2000);

            System.out.println("Continuou!");

        } catch (InterruptedException e) {
            System.out.println("Thread interrompida!");
        }
    }
}
