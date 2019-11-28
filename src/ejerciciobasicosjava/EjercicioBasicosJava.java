package ejerciciobasicosjava;

/**
 *
 * @author :igor repyakh(chainick)
 *
 * ejercicio 1A) el da leas ardillas!
 */
public class EjercicioBasicosJava {
    
    
    public boolean menorPro(int a,int b, int c){
       if((a<10) ||(b<10) || (c<10)){
           
       }
             
            
            
        
       return false; 
    }
    
    
    
    public boolean suenaMovil(boolean matinal,boolean madre, boolean dormido){
        if(matinal && madre && !dormido){
            return true;
        }
        if(!matinal && !madre && dormido ){
            return false;
            
        }
        if ( dormido){
            return false;
            
        }
        if(matinal && !madre && !dormido){
            return false;
        }
        
        return true;
    }
    
    public boolean numeroVanidos(int numero){
        
       int numero_1=numero%11;
       
       if(numero_1==0){
           return true;
       }
       if (numero_1==1){
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
       
        System.out.println(ejercicios.suenaMovil(false,false,false));
        System.out.println(ejercicios.suenaMovil(false,false,true));
        System.out.println(ejercicios.suenaMovil(true,false,false));
    }

}
