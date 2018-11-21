public class ejercicio8 {
    public static void main(String[] args) {
			
    int[] temp = new int[12];
    
    String[] mes = {"Enero", "Febrero", "Marzo" ,"Abril" ,"Mayo" ,"Junio" ,"Julio" ,"Agosto" ,"Septiembre" ,"Octubre" ,"Noviembre" ,"Diciembre"};
		
		for (int i = 0; i < 12; i++) {

      System.out.println("Introduzca la temperatura del "+ mes[i] +" (Separando cada uno por una pulsacion de enter):");
      temp[i] = Integer.parseInt(System.console().readLine());
		
		}

    for (int i=0; i<12;i++){

      System.out.printf("%20s |",mes[i]);
      
      for(int j=0; j<=temp[i]; j++){
        System.out.print("- ");
      }
      
      System.out.print(temp[i]+"º");
      System.out.println(" ");
    }
  }  
}  