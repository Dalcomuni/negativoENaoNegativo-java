import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);

  int numero = sc.nextInt();

  if (numero<0){   
    System.out.println("negativo");
  } 
  else{    
    System.out.println("nao negativo");
  }
}
}


