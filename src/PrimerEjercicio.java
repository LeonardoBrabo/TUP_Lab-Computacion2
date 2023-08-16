import java.util.Scanner;

public class PrimerEjercicio {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ingrese tres numeros:");
        System.out.println( "Primer numero:");
        a = entrada.nextInt();

        System.out.println("Segundo numero: ");
        b = entrada.nextInt();

        System.out.println("Tercer numero:");
        c = entrada.nextInt();

        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
                if(b>a && a>c)
                    System.out.println(b+", "+a+", "+c);
                else{
                    if(b>c && c>a)
                        System.out.println(b+", "+c+", "+a);
                    else{
                        if(c>a && a>b)
                            System.out.println(c+", "+a+", "+b);
                        else{
                            if(c>b && b>a)
                                System.out.println(c+", "+b+", "+a);

                        }
                    }
                }
            }
        }
    }
}









