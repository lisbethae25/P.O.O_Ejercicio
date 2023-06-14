/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
   static  Scanner leer= new Scanner(System.in);
    
    public static void main(String[ ]args){
        
        //Aplicacion.metodo1();
        //Aplicacion.metodo2();
        //Aplicacion.metodo3();
        //areaTriangulo();
        persona p1 = new persona();
    }
    public static void metodo1(){
         int i=1;
         while(i<=5){
             System.out.println("i");
             i++;
         }
        
    }
    
    public static void metodo2(){
         for (int i=1;1<=5;i++){
             System.out.println("i");  
         }
    }
    public static void metodo3(){
        int i=1;
        do{
            System.out.println("i");
            
        }while (i<=5);
    }
     public static void adivinaNunero(){
        int n=(int) (Math.random()*10);
        System.out.println(n+"Ingrese un numero para ver si adivinas");
        int adivina= leer.nextInt();
        if (adivina==n){
            System.out.println("Felicidades ganaste");
            
        }else{
            System.out.println("Intenta de nuevo");
        }while(adivina!=n);
    }
      public static void ejemplosWhile(){
        
        System.out.println("Mostrar los valores pares del 1 al 10");
        Integer i =1;
        while(i<=10){
            if(i%2==0){
                System.out.println(""+i);
            }
            i++;
        }
    }
      public static void tablaMultipicar5 (){
        System.out.println("tabla de multiplicacion del 5");
       Integer i =1;
        while(i<=12){
            System.out.println(i+"*5="+i*5);
              i++;
            }
    }
      
    public static void mutiplicacionValorN(){
         Scanner t = new Scanner(System.in);  
        System.out.println("Tablas de multiplicacion");
       Integer i =1,numero;
       numero=t.nextInt();
       while(i<=12){
            System.out.println(numero+"*"+i+"="+numero*i);
              i++;
            }
    }
     public static void numeroPrimo(){
         System.out.println("Numero Primo");
         Integer numeroUno,cont=0, i=1;
         Scanner t=new Scanner(System.in);
         System.out.println("Ingrese un numero");
         numeroUno = t.nextInt();
         do{
             if(numeroUno%i==0){
                 System.out.println(numeroUno+"divisible"+i);
                 cont++;
             }
             i++;
         }while(i<=numeroUno);
         if(cont==2){
             System.out.println("El numero" +numeroUno+ "Es Primo");
         }else{
             System.out.println("El numero" +numeroUno+ "No es Primo");
        }
    }
public static void valoresNumericos(){
                int numeroUno, numeroDos,nMayor = 0, nMenor = 0, contador ; 
            contador = 0;
            
            System.out.println("Ejercicio: ");
            Scanner t = new Scanner(System.in);
            System.out.println("Ingrese numeroUno:  ") ;       
            numeroUno = t.nextInt() ;
            System.out.println("Ingrese numeroDos:  ") ;       
            numeroDos = t.nextInt() ;
            
            if (numeroUno>numeroDos){
                nMayor = numeroUno;
                nMenor= numeroDos ;
                System.out.println("El primer numero es mayor");
            }
           for(int i= ++nMenor; i<nMayor ; i++ ) {
                System.out.println(i+"");
                
            if(i%3==0){
                ++contador;
            }    
      }
                System.out.println("La cantidad de multiplos de 3 en el rango son: "+contador);
                System.out.println("La mitad de todos los valores pares son:");
        for (int i = nMenor; i <= nMayor; i++) {
            if (i % 2== 0) {
                System.out.print(i / 2 + " ");
         }
       }
     } 
    public static void factorial1(){
        System.out.println("Numero Factorial");
        Scanner t=new Scanner (System.in);
        Integer numero, aux=1, factorial=1;
        System.out.println("Ingrese un valor numerico");
        numero= t.nextInt();
        while(aux<=numero){
             factorial *=aux;
            aux++;
        }
        System.out.println("Factorial de: "+numero+" = "+factorial);
    }   

    public static void areaTriangulo (){
        int base, altura;
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese la base ");
        base=leer.nextInt();
        System.out.println("Ingrese la altura");
        altura=leer.nextInt();
        int area = (base*altura)/2;
        System.out.println("El area es:"+area);
    }

    private static class persona {

        public persona() {
        }
    }
    
}
