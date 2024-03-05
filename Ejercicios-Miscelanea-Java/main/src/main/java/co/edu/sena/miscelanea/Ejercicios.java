package co.edu.sena.miscelanea;

public class Ejercicios 
{
    public static double areaTriangulo(double d1, double d2){
        return (d1*d2) / 2;
    }
    public static double SumaDeDosNum(double d1, double d2){
        return d1+d2;
    }
    public static double NumeroAlCuadrado(double d1){
        return d1*d1;
    }
    public static double EuroADolar(double d1){
        return d1*1.08;
    }
    public static double AreaCuadrado(double d1){
        return d1 * d1;
    }
    public static double PerimetroCuadrado(double d1){
        return d1*4;
    }
    public static double AreaCilindro(double d1, double d2){
        return 2*3.14*d1*(d1 + d2);
    }
    public static double VolumenCilindro(double d1,double d2){
        return (3.14 * (d1 * d1)) * d2;
    }
    public static double AreaCirc(double d1){
        return 3.14 * ( d1 * d1 );
    }
    public static double LongitudCirc(double d1){
        return 2*3.14*d1;
    }
    public static double PromedioTresNumeros(double d1, double d2, double d3){
        return (d1+d2+d3)/3;
    }
    public static String PositivoONegativo(double d1){
        if (d1 > 0) {
            return (d1 + " Es un numero positivo");
        }
        else{
            if (d1 < 0) {
                return (d1 + " Es un numero negativo");
            }
            else{
                return (d1 + " Es un numero neutro");
            }
        }
    }
    public static String MayorOMenor(double d1, double d2){
        if (d1 > d2) {
            return (d1 + " Es mayor que"+ " " + d2);
        }
        else{
            if (d1 == d2) {
                return (d1 + " Es igual que"+ " " + d2);
            }
            else{
                return (d2 + " Es menor que " + d1);
            }
        }
    }
    public static String Mayorde3(int d1, int d2, int d3){
        if (d1 > d2 && d1 > d3) {
            return (d1 + " Es el numero mayor");
        }
        else{
            if (d2 > d1 && d2 > d3) {
                return (d2 +" Es el numero mayor");
            }
            else{
                return (d3 + " Es el numero mayor");
            }
        }
    }
    public static String Menorde3(int d1, int d2, int d3){
        if (d1 < d2 && d1 < d3) {
            return (d1 + " Es el numero menor");
        }
        else{
            if (d2 < d1 && d2 < d3) {
                return (d2 +" Es el numero menor");
            }
            else{
                return (d3 +" Es el numero menor");
            }
        }
    }
    public static String DosN(int d1, int d2){
        if (d1 < d2) {
            return ("La suma de los numeros es: " + (d1+d2));
        }
        else{
            return ("La resta de los numeros es: " + (d1-d2));
        }
    }
    public static String Division(double d1, double d2){
        if (d2 == 0) {
            return ("No es posible dividir entre 0");
        }
        else{
            return ("El cociente de la divison es: " + (d1/d2));
        }
    }
    public static String sumaomult(int d1, int d2){
        if (d1 < 0 || d2 < 0) {
            return ("El resultado de la suma es: " + (d1+d2));
        }
        else{
            return ("El resultado de la multiplicacion: " + (d1*d2));
        }
    }
    public static String bisieto(double d1){
        if (d1 % 4 == 0) {
            return ("El año " + d1 + " es un año bisiesto");
        }
        else{
            return ("El año "+d1+" no es bisiesto");
        }
    }
}