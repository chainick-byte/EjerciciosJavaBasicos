package ejerciciobasicosjava;

/**
 *
 * @author :igor repyakh(chainick)
 *
 * ejercicio 1A) el da leas ardillas!
 */
public class EjercicioBasicosJava {

    public boolean menorPro(int a, int b, int c) {
        if ((a < 10) || (b < 10) || (c < 10)) {

        }

        return false;
    }

    public boolean suenaMovil(boolean matinal, boolean madre, boolean dormido) {
        if (matinal && madre && !dormido) {
            return true;
        }
        if (!matinal && !madre && dormido) {
            return false;

        }
        if (dormido) {
            return false;

        }
        if (matinal && !madre && !dormido) {
            return false;
        }

        return true;
    }

    public boolean numeroVanidos(int numero) {

        int numero_1 = numero % 11;

        if (numero_1 == 0) {
            return true;
        }
        if (numero_1 == 1) {
            return true;

        }

        return false;

    }

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
//si es me cumple me emboracho a toda hostia
        if (cumpleannos) {
            velocidad -= 5;

        }
        if (velocidad <= 60) {
            return 0;
        }
        if (velocidad >= 61 && velocidad <= 80) {
            return 1;
        }

        if (velocidad > 81) {
            return 2;

        }

        return 0;
    }

    public boolean tresEnteros(int a, int b, int c) {

        if (Math.abs(c - a) >= 10 || Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10) {
            return true;
        }

        return false;

    }

    public boolean dosEnteros(int a, int b) {
        if (a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || b / 10 == a % 10) {
            return true;
        }
        return false;
    }

    public boolean multiplo(int a) {
        int num1 = 3;
        int num2 = 5;
        if (a % num1 == 0 && a % num2 != 0) {
            return true;
        }
          if (a % num1 != 0 && a % num2 == 0) {
            return true;
        }

        if (a % 3 == 0 && a % 5 == 0) {
            return false;
        }

        return false;

    }
    
    public int billeteLoteria(int a, int b, int c){
         
        if((a==b)&&(b==c)&&(a==c)&&(a==2)){
            return 10;
        }
         if((a==b)&&(b==c)&&(a==c)&&(a!=2)){
            return 5;
        }
        return 0;
    }
    
    public int sumaDados(int a,int b,boolean noDouble){
        if((a==b) && noDouble==true){
            return a+b+1;
        }   
        return a+b;
    }
    public boolean palindormo(String s){
      String  auxiliar="";
      int numero=s.length();
        for(int i =0;i<numero;i++){
            if(s.charAt(i)!=' '){
                auxiliar=auxiliar+s.charAt(i);
            }
        }
        for(int i=0; i<numero;i++){
         String auxiliarInversa =auxiliar+s.charAt(numero-i);
        }
        if(auxiliar.equals(auxiliarInversa)){
            return true;
        }
     return false;
      
  
       
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjercicioBasicosJava ejercicios = new EjercicioBasicosJava();
        /* System.out.println(ejercicios.fiestaArdilla(39, false));
        System.out.println(ejercicios.fiestaArdilla(50, false));
        System.out.println(ejercicios.fiestaArdilla(70, true));*/

 /*System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));*/
 /* System.out.println(ejercicios.numeroVanidos(22));
        System.out.println(ejercicios.numeroVanidos(23));
        System.out.println(ejercicios.numeroVanidos(24));*/
 /*System.out.println(ejercicios.suenaMovil(false,false,false));
        System.out.println(ejercicios.suenaMovil(false,false,true));
        System.out.println(ejercicios.suenaMovil(true,false,false));_*/
 /*System.out.println(ejercicios.tresEnteros(1,7,11));
        System.out.println(ejercicios.tresEnteros(1,7,10));
        System.out.println(ejercicios.tresEnteros(11,1,7));*/
 /*System.out.println(ejercicios.dosEnteros(12, 23));
        System.out.println(ejercicios.dosEnteros(12, 43));
        System.out.println(ejercicios.dosEnteros(12, 44));*/
       /* System.out.println(ejercicios.multiplo(3));
        System.out.println(ejercicios.multiplo(10));
        System.out.println(ejercicios.multiplo(15));*/

       /*System.out.println(ejercicios.billeteLoteria(2,2,2));
         System.out.println(ejercicios.billeteLoteria(2,2,1));
           System.out.println(ejercicios.billeteLoteria(0,0,0));*/
       
         /*System.out.println(ejercicios.sumaDados(2,3,true));
         System.out.println(ejercicios.sumaDados(3,3,true));
         System.out.println(ejercicios.sumaDados(3,3,false));
         System.out.println(ejercicios.sumaDados(6,6,true));*/


                  System.out.println(ejercicios.palindormo("taccat"));


                
    }

}
