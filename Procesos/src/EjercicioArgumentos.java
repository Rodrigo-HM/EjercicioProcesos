import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class EjercicioArgumentos {
    public static void main(String[] args) {

            String []comandos={"java","-jar","C:\\Users\\RodrigoHernandezMart\\Documents\\GitHub\\Programacion\\Procesos\\out\\artifacts\\EjercicioArgumentos\\Clase.jar","notepad.exe" };


        ProcessBuilder pb = new ProcessBuilder(comandos);

        try {
                Process p = pb.start();  //siempre hay que hacerlo en try catch

        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
