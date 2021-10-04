import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        Aulas aulas = new Aulas();

        aulas.setNomeDaAula("conhecendo a aula 1");
        aulas.setNomeDaAula("conhecendo a aula 2");
        aulas.setNomeDaAula("conhecendo a aula 3");

        ArrayList<String> aulasArr = new ArrayList<>();

//        aulas.remove(1);

        Collections.sort(aulasArr);

        System.out.println(aulas);



    }
}
