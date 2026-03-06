package app;

import java.util.Scanner;
//Importamos Scanner para poder leer datos que el usuario escriba desde el teclado

public class Main {

 // Creamos un Scanner global para que todos los métodos puedan usarlo
 static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {

     int opcion; // variable que guardará la opción que el usuario elija del menú

     // Este ciclo permite que el menú se repita hasta que el usuario decida salir
     do {

         // ===== MENÚ PRINCIPAL =====
         System.out.println("\n========== MENU ==========");
         System.out.println("1. Suma de divisibles entre 4");
         System.out.println("2. Factorial");
         System.out.println("3. Positivos, negativos y ceros");
         System.out.println("4. Promedio de pares");
         System.out.println("5. Suma de digitos");
         System.out.println("6. Multiplo de 7 o 11");
         System.out.println("7. Divisible entre 3 pero no 2");
         System.out.println("8. Mañana, tarde o noche");
         System.out.println("9. Numero romano");
         System.out.println("10. Calculadora");
         System.out.println("11. Mayor, menor y diferencia");
         System.out.println("12. Tabla de división");
         System.out.println("13. Cantidad de dígitos pares");
         System.out.println("14. Número triangular");
         System.out.println("15. Promedio de números negativos");
         System.out.println("16. Primeros múltiplos de 6");
         System.out.println("17. Determinar si es potencia de 2");
         System.out.println("18. Invertir un número");
         System.out.println("19. Suma de 1 a n par o impar");
         System.out.println("20. Convertir Celsius a Fahrenheit");
         System.out.println("0. Salir");

         // Pedimos al usuario que elija una opción
         System.out.print("Seleccione una opcion: ");
         opcion = sc.nextInt();

         // Switch que ejecuta el método correspondiente según la opción elegida
         switch (opcion) {

             case 1: 
            	 ejercicio1(); 
            	 break;
             case 2: 
            	 ejercicio2(); 
            	 break;
             case 3: 
            	 ejercicio3(); 
            	 break;
             case 4: 
            	 ejercicio4(); 
            	 break;
             case 5: 
            	 ejercicio5(); 
            	 break;
             case 6: 
            	 ejercicio6(); 
            	 break;
             case 7: 
            	 ejercicio7();
            	 break;
             case 8: 
            	 ejercicio8(); 
            	 break;
             case 9: 
            	 ejercicio9(); 
            	 break;
             case 10: 
            	 ejercicio10(); 
            	 break;
             case 11: 
            	 ejercicio11(); 
            	 break;
             case 12:
            	 ejercicio12(); 
            	 break;
             case 13: 
            	 ejercicio13(); 
            	 break;
             case 14: 
            	 ejercicio14(); 
            	 break;
             case 15: 
            	 ejercicio15();
            	 break;
             case 16: 
            	 ejercicio16();
            	 break;
             case 17:
            	 ejercicio17(); 
            	 break;
             case 18:
            	 ejercicio18();
            	 break;
             case 19: 
            	 ejercicio19();
            	 break;
             case 20:
            	 ejercicio20(); 
            	 break;

             case 0:
                 // Si el usuario elige 0 el programa terminará
                 System.out.println("Saliendo del programa...");
                 break;

             default:
                 // Si escribe una opción incorrecta
                 System.out.println("Opcion invalida");
         }

     } while (opcion != 0); 
     // El menú seguirá apareciendo hasta que el usuario escriba 0

 }

 // =========================================================
 // EJERCICIO 1
 // Mostrar la suma de los números divisibles entre 4 desde 1 hasta n
 // =========================================================
 static void ejercicio1() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt(); // número límite que el usuario escribe

     int suma = 0; // variable acumuladora donde iremos guardando la suma

     // Ciclo que recorre todos los números desde 1 hasta n
     for (int i = 1; i <= n; i++) {

         // Verificamos si el número es divisible entre 4
         // El operador % obtiene el residuo de la división
         if (i % 4 == 0) {

             // Si es divisible lo sumamos
             suma = suma + i;
         }
     }

     System.out.println("La suma es: " + suma);
 }

 // =========================================================
 // EJERCICIO 2
 // Calcular el factorial de un número
 // n! = 1 * 2 * 3 * ... * n
 // =========================================================
 static void ejercicio2() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt();

     long factorial = 1; 
     // factorial empieza en 1 porque vamos a multiplicar

     // multiplicamos todos los números desde 1 hasta n
     for (int i = 1; i <= n; i++) {

         factorial = factorial * i;
     }

     System.out.println("El factorial es: " + factorial);
 }

 // =========================================================
 // EJERCICIO 3
 // Contar cuantos números son positivos, negativos o cero
 // =========================================================
 static void ejercicio3() {

     System.out.print("Cantidad de numeros: ");
     int n = sc.nextInt();

     int positivos = 0;
     int negativos = 0;
     int ceros = 0;

     // Ciclo para leer n números
     for (int i = 1; i <= n; i++) {

         System.out.print("Ingrese numero: ");
         int num = sc.nextInt();

         // Evaluamos el número
         if (num > 0)
             positivos++;

         else if (num < 0)
             negativos++;

         else
             ceros++;
     }

     System.out.println("Positivos: " + positivos);
     System.out.println("Negativos: " + negativos);
     System.out.println("Ceros: " + ceros);
 }

 // =========================================================
 // EJERCICIO 4
 // Calcular el promedio de números pares entre 1 y n
 // =========================================================
 static void ejercicio4() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt();

     int suma = 0;
     int contador = 0;

     // recorremos los números
     for (int i = 1; i <= n; i++) {

         // verificamos si es par
         if (i % 2 == 0) {

             suma += i;
             contador++;
         }
     }

     if (contador > 0)
         System.out.println("Promedio: " + (suma / contador));
 }

 // =========================================================
 // EJERCICIO 5
 // Sumar los dígitos de un número
 // ejemplo: 123 → 1+2+3
 // =========================================================
 static void ejercicio5() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     int suma = 0;

     // mientras el número tenga dígitos
     while (n > 0) {

         int digito = n % 10; // obtenemos el último dígito

         suma += digito; // lo sumamos

         n = n / 10; // eliminamos el último dígito
     }

     System.out.println("Suma de digitos: " + suma);
 }

//=========================================================
//EJERCICIO 6
//Determinar si un número es múltiplo de 7, de 11, de ambos o de ninguno
//=========================================================
static void ejercicio6() {

  // Pedimos el número al usuario
  System.out.print("Ingrese numero: ");
  int n = sc.nextInt();

  // Primero verificamos si es múltiplo de ambos
  if (n % 7 == 0 && n % 11 == 0) {

      // Si el residuo de ambas divisiones es 0 entonces es múltiplo de los dos
      System.out.println("Es multiplo de 7 y de 11");
  }

  // Si no es de ambos, verificamos si es solo de 7
  else if (n % 7 == 0) {

      System.out.println("Es multiplo de 7");
  }

  // Si no es de 7, verificamos si es solo de 11
  else if (n % 11 == 0) {

      System.out.println("Es multiplo de 11");
  }

  // Si no cumple ninguna condición
  else {

      System.out.println("No es multiplo de 7 ni de 11");
  }
}

 // =========================================================
 // EJERCICIO 7
 // Mostrar números divisibles entre 3 pero no entre 2
 // =========================================================
 static void ejercicio7() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt();

     for (int i = 1; i <= n; i++) {

         if (i % 3 == 0 && i % 2 != 0) {

             System.out.println(i);
         }
     }
 }

 // =========================================================
 // EJERCICIO 8
 // Determinar si una hora es mañana, tarde o noche
 // =========================================================
 static void ejercicio8() {

     System.out.print("Ingrese hora (0-23): ");
     int hora = sc.nextInt();

     if (hora >= 6 && hora < 12)
         System.out.println("Mañana");

     else if (hora >= 12 && hora < 18)
         System.out.println("Tarde");

     else
         System.out.println("Noche");
 }

 // =========================================================
 // EJERCICIO 9
 // Convertir números del 1 al 5 a números romanos usando switch
 // =========================================================
 static void ejercicio9() {

     System.out.print("Numero (1-5): ");
     int n = sc.nextInt();

     switch (n) {

         case 1:
             System.out.println("I");
             break;

         case 2:
             System.out.println("II");
             break;

         case 3:
             System.out.println("III");
             break;

         case 4:
             System.out.println("IV");
             break;

         case 5:
             System.out.println("V");
             break;

         default:
             System.out.println("Fuera de rango");
     }
 }

 // =========================================================
 // EJERCICIO 10
 // Calculadora básica usando switch
 // =========================================================
 static void ejercicio10() {

     System.out.print("Operacion (1 suma, 2 resta, 3 multiplicacion): ");
     int op = sc.nextInt();

     System.out.print("Numero 1: ");
     int a = sc.nextInt();

     System.out.print("Numero 2: ");
     int b = sc.nextInt();

     switch (op) {

         case 1:
             System.out.println("Resultado: " + (a + b));
             break;

         case 2:
             System.out.println("Resultado: " + (a - b));
             break;

         case 3:
             System.out.println("Resultado: " + (a * b));
             break;

         default:
             System.out.println("Operacion invalida");
     }
 }
 
//================= EJERCICIO 11 =================
//Leer dos números y mostrar el mayor, el menor y la diferencia absoluta
static void ejercicio11() {

  // Pedimos el primer número
  System.out.print("Ingrese numero A: ");
  int a = sc.nextInt();

  // Pedimos el segundo número
  System.out.print("Ingrese numero B: ");
  int b = sc.nextInt();

  // Math.max obtiene el número mayor entre dos valores
  int mayor = Math.max(a, b);

  // Math.min obtiene el número menor
  int menor = Math.min(a, b);

  // Math.abs obtiene el valor absoluto (sin signo negativo)
  int diferencia = Math.abs(a - b);

  // Mostramos resultados
  System.out.println("Mayor: " + mayor);
  System.out.println("Menor: " + menor);
  System.out.println("Diferencia absoluta: " + diferencia);
}


//================= EJERCICIO 12 =================
//Mostrar la tabla de división del número ingresado entre 1 y 10
static void ejercicio12() {

  System.out.print("Ingrese numero: ");
  int n = sc.nextInt();

  // Recorremos números del 1 al 10
  for (int i = 1; i <= 10; i++) {

      // Convertimos a double para que muestre decimales
      double resultado = n / (double) i;

      // Mostramos la operación
      System.out.println(n + " / " + i + " = " + resultado);
  }
}


//================= EJERCICIO 13 =================
//Contar cuántos dígitos pares tiene un número
static void ejercicio13() {

  System.out.print("Ingrese numero: ");
  int n = sc.nextInt();

  int contador = 0;

  // Analizamos cada dígito
  while (n > 0) {

      int digito = n % 10; // obtenemos el último dígito

      // Verificamos si el dígito es par
      if (digito % 2 == 0) {
          contador++;
      }

      // Eliminamos el último dígito
      n = n / 10;
  }

  System.out.println("Cantidad de digitos pares: " + contador);
}


//================= EJERCICIO 14 =================
//Determinar si un número es triangular
static void ejercicio14() {

  System.out.print("Ingrese numero: ");
  int n = sc.nextInt();

  int suma = 0; // suma acumulada
  int k = 1;    // número que iremos sumando

  // Seguimos sumando números consecutivos
  while (suma < n) {

      suma += k;
      k++;
  }

  // Si la suma coincide con n es triangular
  if (suma == n)
      System.out.println("El numero es triangular");
  else
      System.out.println("No es triangular");
}


//================= EJERCICIO 15 =================
//Calcular el promedio de números negativos
static void ejercicio15() {

  System.out.print("Cantidad de numeros: ");
  int n = sc.nextInt();

  int suma = 0;
  int contador = 0;

  // Leemos los números
  for (int i = 1; i <= n; i++) {

      System.out.print("Ingrese numero: ");
      int num = sc.nextInt();

      // Solo trabajamos con negativos
      if (num < 0) {

          suma += num;
          contador++;
      }
  }

  // Verificamos si hubo negativos
  if (contador > 0)
      System.out.println("Promedio negativos: " + (suma / contador));
  else
      System.out.println("No hay negativos");
}


//================= EJERCICIO 16 =================
//Mostrar los primeros n múltiplos de 6
static void ejercicio16() {

  System.out.print("Ingrese n: ");
  int n = sc.nextInt();

  // Generamos los múltiplos
  for (int i = 1; i <= n; i++) {

      int multiplo = 6 * i;

      System.out.println(multiplo);
  }
}


//================= EJERCICIO 17 =================
//Determinar si un número es potencia de 2
static void ejercicio17() {

  System.out.print("Ingrese numero: ");
  int n = sc.nextInt();

  int original = n;

  // Mientras sea divisible entre 2 lo dividimos
  while (n % 2 == 0) {

      n = n / 2;
  }

  // Si terminamos en 1 entonces era potencia de 2
  if (n == 1)
      System.out.println(original + " es potencia de 2");
  else
      System.out.println(original + " NO es potencia de 2");
}


//================= EJERCICIO 18 =================
//Invertir un número
static void ejercicio18() {

  System.out.print("Ingrese numero: ");
  int n = sc.nextInt();

  int invertido = 0;

  // Mientras el número tenga dígitos
  while (n > 0) {

      int digito = n % 10; // obtenemos último dígito

      // construimos el número invertido
      invertido = invertido * 10 + digito;

      // quitamos el último dígito
      n = n / 10;
  }

  System.out.println("Numero invertido: " + invertido);
}


//================= EJERCICIO 19 =================
//Determinar si la suma de 1 a n es par o impar
static void ejercicio19() {

  System.out.print("Ingrese n: ");
  int n = sc.nextInt();

  // Fórmula matemática de suma de 1 a n
  int suma = (n * (n + 1)) / 2;

  // Verificamos si es par o impar
  if (suma % 2 == 0)
      System.out.println("La suma es PAR");
  else
      System.out.println("La suma es IMPAR");
}


//================= EJERCICIO 20 =================
//Convertir Celsius a Fahrenheit
static void ejercicio20() {

  System.out.print("Ingrese temperatura en Celsius: ");
  double c = sc.nextDouble();

  // Fórmula de conversión
  double f = (c * 9 / 5) + 32;

  System.out.println("Temperatura en Fahrenheit: " + f);
}

}