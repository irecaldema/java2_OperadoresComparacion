import java.util.Scanner;
public class OperadoresComparacion
{
public static void main (String args[]) 
 {
	    int edad;
/*
El uso mas comun para los operadores de comparacion es en las estructuras IF, si una propocicon es verdadera o falsa.
 
Normalmente una expresion usando operadores es imilar a esto:  A "operador" B. 
 
Operadores numericos: 
1 "<" Menor que.
2 ">" Mayor que. 
3 "<=" Menor o igual que.
4 ">=" Mayor o igual que.
Operadores logicos: (Se utilizan con valores true y false)
5 "&&" AND : regresa un valor verdadero siempre y cuando los dos terminos (A y B) sean verdaderos.
6 "||" OR : regresaun valor verdadro siempre y cuando alguno de los dos terminos sea verdadero.
Operadores universales, pueden usarse con numeros o valores logicos.
7 "==" Igual a. Notese que se usan dos iguales. 
8 "!=" No es igual a.
*/	    
	    
/*
Ejemplos de operadores: 
 1==1 da un valor: VERDADERO
 1==2 da un valor: FALSO
 1>2 da un valor: VERDADERO
 10>=5 da un valor VERDADERO
 4!=5 da un valor VERDADERO
 true!=true da un valor FALSO
 true && true da un valor VERDADERO
*/
  Scanner sc = new Scanner(System.in);
  
  System.out.print("\ncomparador para todas las edades: ");
  System.out.print("\nintroduzca su edad: ");
  edad = sc.nextInt();
  while /*3, 4, 6 */((edad <= 0) || (edad >= 200))
  {
       System.out.print("\nla edad introducisda no cumple los requisitos edad");
       System.out.print("\n");
       System.out.print("\n");
       System.out.print("\nintroduzca su edad: ");
       edad = sc.nextInt();
  }
  System.out.print("\nSu edad es de "+edad+" anos");
  System.out.print("\n");
  if /*1*/(edad<100)
   {
    System.out.print("\nSu edad es menor a 100");
    System.out.print("\n");
   }
   if /*2*/(edad>100)
   {
    System.out.print("\nSu edad es mayor a 100");
    System.out.print("\n");
   }
   if /*3*/(edad>=120)
   {
    System.out.print("\nSu edad es mayor o igual a 120");
    System.out.print("\n");
   }
   if /*4*/(edad<=80)
   {
    System.out.print("\nSu edad es menor o igual a 80");
    System.out.print("\n");
   }
   if /*5, 8*/((edad!=30)&&(edad!=50))
   {
    System.out.print("\nSu edad no es 30 y tampoco es 50");
    System.out.print("\n");
   }
    if /*6, 7*/((edad==30)||(edad==50))
   {
    System.out.print("\nSu edad es 30 o 50");
    System.out.print("\n");
   }
   
   //fin de main
 }
 //fin de clase
}