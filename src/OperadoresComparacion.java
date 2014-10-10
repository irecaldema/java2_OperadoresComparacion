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
"<" Menor que.
">" Mayor que. 
"<=" Menor o igual que.
">=" Mayor o igual que.
Operadores logicos: (Se utilizan con valores true y false)
"&&" AND : regresa un valor verdadero siempre y cuando los dos terminos (A y B) sean verdaderos.
"||" OR : regresaun valor verdadro siempre y cuando alguno de los dos terminos sea verdadero.
Operadores universales, pueden usarse con numeros o valores logicos.
"==" Igual a. Notese que se usan dos iguales. 
"!=" No es igual a.
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
  Scanner sc = new Scanner();
  
  System.out.print("\ncomparador para todas las edades: ");
  System.out.print("\nintroduzca su edad: ");
  edad = sc.nextint();
  while ((edad <= 0) || (edad >= 200))
  {
       System.out.print("\nla edad introducisda no cumple los requisitos edad: ");
       System.out.print("\nintroduzca su edad: ");
       edad = sc.nextint();
  }
 }
}