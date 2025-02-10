import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Procesos {
    public static void main(String[] args) {

        if(args.length==1){
            System.out.println(args[0]); //saca el argugmento que pongamos en la consola
        }
        String nombre="notepad.exe";
        ProcessBuilder pb=new ProcessBuilder(nombre);
        try {
            Process p = pb.start();  //siempre hay que hacerlo en try catch
            p.waitFor(10, TimeUnit.SECONDS); //se para durante x tiempo, pide hacer una excepcion
            p.destroy(); //se destruye despues de 10 segundos, ya que antes esta bloqueado
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }


 /*
        Runtime r=Runtime.getRuntime();  //este está en desuso
        try {
            Process p= r.exec(nombre);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */
    }
}
