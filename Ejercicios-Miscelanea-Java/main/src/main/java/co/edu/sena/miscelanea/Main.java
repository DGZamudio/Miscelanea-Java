package co.edu.sena.miscelanea;
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        Scanner src = new Scanner (System.in);
        double Num1, Num2, Num3, result;
        String result2;
        int Nm1,Nm2,Nm3;
        int Menu = 0;
        do {
            if (Menu == 1) {  
                //Problema 1          
                System.out.println( "Problema 1:Area de un triangulo." );
                System.out.println( "Ingresa la base:" );
                Num1 = src.nextDouble();
            
                System.out.println( "Ingresa la altura:" );
                Num2 = src.nextDouble();
            
                result = Ejercicios.areaTriangulo(Num1,Num2) ;
            
                System.out.println( "El area del triangulo es:" + result);
            
                //Problema 2
                System.out.println( "Problema 2:Suma de dos numeros." );
                System.out.println( "Ingresa el primer numero:" );
                Num1 = src.nextDouble();
            
                System.out.println( "Ingresa el segundo numero:" );
                Num2 = src.nextDouble();
            
                result= Ejercicios.SumaDeDosNum(Num1,Num2) ;; 
            
                System.out.println( "La suma de estos numeros es:" + result);

                //Problema 3
                System.out.println( "Problema 3:Numero elevado al cuadrado." );
                System.out.println( "Ingresa un numero:" );
        
                Num1 = src.nextDouble();
        
                result = Ejercicios.NumeroAlCuadrado(Num1);
        
                System.out.println( "El numero al cuadrado es:" + result);
        
                //Problema 4
                System.out.println( "Problema 4:Euros a dolares." );
                System.out.println( "Ingresa el valor en euros:" );
        
                Num1 = src.nextDouble();
        
                result = Ejercicios.EuroADolar(Num1);
        
                System.out.println( "El valor en dolares es:" + result);
        
                //Problema 5
                System.out.println( "Problema 5:Area y perimetro cuadrado." );
                System.out.println( "Ingresa el lado de un cuadrado:" );
        
                Num1 = src.nextDouble();
        
                result =Ejercicios.AreaCuadrado(Num1);
        
                System.out.println( "El area del cuadrado es:" + result);
        
                result = Ejercicios.PerimetroCuadrado(Num1);
        
                System.out.println( "El perimetro del cuadrado es:" + result);
        
                //Problema 6
                System.out.println( "Problema 6:Area y volumen de un cilindro." );
                System.out.println( "Ingresa el radio del cilindro." );
        
                Num1 = src.nextDouble();
        
                System.out.println( "Ingresa la altura del cilindro." );
        
                Num2 = src.nextDouble();
        
                result = Ejercicios.VolumenCilindro(Num1,Num2);
        
                System.out.println( "El volumen del cilindro es:" + result);
        
                result = Ejercicios.AreaCilindro(Num1,Num2);
        
                System.out.println( "El area del cilindro es:" + result);
        
                //Problema 7
                System.out.println( "Problema 7:Area y longitud de una circunferencia." );
                System.out.println( "Ingresa el radio de la circunferenia:");
        
                Num1 = src.nextDouble();
        
                result = Ejercicios.AreaCirc(Num1);
        
                System.out.println( "El area de la circunferencia es:" + result);
        
                result = Ejercicios.LongitudCirc(Num1);
        
                System.out.println( "La longitud de la circunferencia es:" + result);
        
                //Problema 8
                System.out.println( "Problema 8:Promedio." );
                System.out.println( "Ingresa el primer numero:");
                Num1 = src.nextDouble();
                System.out.println( "Ingresa el segundo numero:");
                Num2 = src.nextDouble();
                System.out.println( "Ingresa el tercer numero:");
                Num3 = src.nextDouble();
        
                result= Ejercicios.PromedioTresNumeros(Num1,Num2,Num3);
        
                System.out.println( "El promedio de estos tres numeros es:" + result);
            }
            if (Menu == 2) {

                //Problema 1
                System.out.println( "Problema 1:Ingresar un numero y identificar si es positivo o negativo." );
                System.out.println( "Ingresa un numero:" );
                Num1 = src.nextDouble();
            
                result2 = Ejercicios.PositivoONegativo(Num1) ;

                System.out.println(result2);

                //Problema 2
                System.out.println( "Problema 2:Ingresar 2 numeros y identificar cual es mayor y cual es menor." );
                System.out.println( "Ingresa un numero:" );
                Num1 = src.nextDouble();
            
                System.out.println( "Ingresa otro numero:" );
                Num2 = src.nextDouble();
            
                result2 = Ejercicios.MayorOMenor(Num1,Num2) ;

                System.out.println(result2);

                //Problema 3
                System.out.println("Problema 3: 3 numeros mayor y menor");
                System.out.println("Ingresa un numero:");
                Nm1 = src.nextInt();

                System.out.println("Ingresa un segundo numero:");
                Nm2 = src.nextInt();

                System.out.println("Ingresa un tercer numero:");
                Nm3 = src.nextInt();

                result2 = Ejercicios.Mayorde3(Nm1,Nm2,Nm3);

                System.out.println(result2);

                result2 = Ejercicios.Menorde3(Nm1,Nm2,Nm3);

                System.out.println(result2);

                //Problema 4
                System.out.println("Problema 4: Suma o resta de dos numeros");
                System.out.println("Ingresa un numero:");
                Nm1 = src.nextInt();
                System.out.println("Ingres un segundo numero:");
                Nm2 = src.nextInt();

                result2 = Ejercicios.DosN(Nm1,Nm2);
                System.out.println(result2);

                //Problema 5
                System.out.println("Problema 5: Cociente de la division");
                System.out.println("Ingresa el dividendo");
                Num1 = src.nextDouble();
                System.out.println("Ingresa el divisor:");
                Num2 = src.nextDouble();

                result2 = Ejercicios.Division(Num1, Num2);
                System.out.println(result2);

                //Problema 6
                System.out.println("Problema 6: Sumar si un numero es negativo");
                System.out.println("Ingrese un numero:");
                Nm1 = src.nextInt();
                System.out.println("Ingresar un segundo numero:");
                Nm2 = src.nextInt();

                result2 = Ejercicios.sumaomult(Nm1, Nm2);
                System.out.println(result2);

                //Problema 7
                System.out.println("Problema 7: Año bisiesto");
                System.out.println("Ingresa el año actual:");
                Num1 = src.nextDouble();

                result2=Ejercicios.bisieto(Num1);
                System.out.println(result2);
            }
            if (Menu == 3){

            }
            if (Menu == 4){

            }
            System.out.println("Bienvenido al menu selecciona una opcion:");
            System.out.println("1.Operadores");
            System.out.println("2.Condicionales");
            System.out.println("3.Ciclos");
            System.out.println("4.Arreglos");
            System.out.println("99.Salida") ;
            Menu = src.nextInt();
        } while (Menu != 99);
        System.out.println("Programa cerrado.");
    }
}