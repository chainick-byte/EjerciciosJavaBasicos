package ejerciciobasicosjava;

/**
 *
 * @author :igor repyakh(chainick)
 *
 * ejercicio 1A) el da leas ardillas!
 */
public class EjercicioBasicosJava {

    public boolean fiestaArdilla(int numeroBellotas, boolean finSemana) {
        if (finSemana == true) {
            return true;
        }
        if (numeroBellotas >= 40 && numeroBellotas <= 60) {
            return true;
        }
        return false;

    }

    public int multa(int velocidad, boolean cumpleannos) {

        if (cumpleannos == true) {
            velocidad -= 5;
        }

        if (velocidad < 60) {
            return 0;
        }
        if (velocidad < 61 && velocidad > 80) {
            return 1;
        }

        if (velocidad > 81) {
            return 2;

        }
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjercicioBasicosJava ejercicios = new EjercicioBasicosJava();
        /* System.out.println(ejercicios.fiestaArdilla(39, false));
        System.out.println(ejercicios.fiestaArdilla(50, false));
        System.out.println(ejercicios.fiestaArdilla(70, true));*/

        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));

    }

}
