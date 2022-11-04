package tareametodos;

import java.util.Scanner;

public class TareaMetodos {


   
    public static void main(String[] args) {
        Scanner vini = new Scanner(System.in);
        Scanner rm = new Scanner(System.in);//scanner solo para strings para evitar error
        boolean bandera = true;
        try{//es un extra que quise añadir
            do{
                System.out.println("________________________________________________________");
                System.out.println("Ingrese Opcion (7. para salir)");
                System.out.println("1. Replace     2. Factorial     3. Mensajes     4. Promedios        5. Aprobado o Reprobado     6. Contains  ");
                int opc = vini.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("Ingrese Cadena");
                        String cad = rm.nextLine();
                        System.out.println("Ingrese caracter a reemplazar");
                        String letra = rm.next();
                        System.out.println("Ingrese nuevo caracter");
                        String letraNueva = rm.next();
                        System.out.println("La cadena nueva es: " + replace(cad, letra, letraNueva));
                        break;

                    case 2:
                        System.out.println("Ingrese un numero");
                        int num = vini.nextInt();
                        System.out.println("El Factorial de "+num+" es: "+factorial(num));
                        break;

                    case 3:
                        System.out.println("Ingrese una cadena");
                        String mensaje = rm.nextLine();
                        mensaje(mensaje);break;

                    case 4:
                        System.out.println("El promedio es: "+promedio());break;

                    case 5:
                        System.out.println("Ingrese Nota ");
                        int nota = vini.nextInt();
                        boolean a = pasaste(nota);
                        //System.out.println(a);
                        if(a==true){System.out.println("Aprobado");
                        }else{System.out.println("Reprobado");}break;

                    case 6:
                        System.out.println("Ingrese cadena principal");
                        String prin = rm.nextLine();
                        System.out.println("Ingrese segunda cadena");
                        String seg = rm.nextLine();
                        boolean b = contains(prin,seg);
                        if(b==true){System.out.println("La cadena principal contiene a la segunda cadena");}
                        else{System.out.println("La cadena principal no contiene a la segunda cadena");}break;

                    case 7:bandera=false;break;

                    default: System.out.println("Opcion no valida");break;
                }
            }while(bandera == true);
        }catch(Exception e){System.out.println("Usted ingreso un caracter no valido ");
    }
    
    }    
public static String replace(String cad, String letra, String letraNueva){
        String cadNueva = cad.replace(letra, letraNueva);
        return cadNueva;
    }
    
    public static int factorial(int num){
        int facto = 1;
        for(int i=1; i<=num; i++){
            facto *= i;
        }
        return facto;
    }
    
    public static void mensaje(String mensaje){
        System.out.println("Su mensaje es: "+mensaje);
    }
    
    public static double promedio(){
        Scanner vini = new Scanner(System.in);
        System.out.println("Ingrese Nota");
        double nota1 = vini.nextDouble();
        System.out.println("Ingrese Nota");
        double nota2 = vini.nextDouble();
        System.out.println("Ingrese Nota");
        double nota3 = vini.nextDouble();
        System.out.println("Ingrese Nota");
        double nota4 = vini.nextDouble();
        double sum = nota1+nota2+nota3+nota4;
        double promedio = sum/4;
    return promedio;
    }
    
    public static boolean pasaste(int _nota){
        boolean pasaste=false;
        if(_nota>=60){
            pasaste = true;
        }
        return pasaste;
    }

    public static boolean contains(String prin, String seg){
        boolean contenido=false;
        if(prin.contains(seg)){
            contenido=true;
        }
        return contenido;
    }
}