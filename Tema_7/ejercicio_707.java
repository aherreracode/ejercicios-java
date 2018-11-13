public class ejercicio7 {
    public static void main(String[] args) {
			
		int[] num; // se define num como un array de enteros
		num = new int[100]; // se reserva espacio para 100 enteros
		
		for (int i = 0; i < 100; i++) {

      num[i]=(int)(Math.random()*21);
      System.out.println(num[i]);
		
		}
		
		System.out.println("Inserte los numeros a cambiar(Valor 1):");
		int valor1 = Integer.parseInt(System.console().readLine());

		System.out.println("Inserte los numeros a cambiar(Valor 2):");
		int valor2 = Integer.parseInt(System.console().readLine());

		for (int i = 0; i < 100;i++) {
			
			if (num[i] == valor1){
			
				num[i] = valor2;
				System.out.println("'"+num[i]+"'");
			
			}else{
			
				System.out.println(num[i]);
			
			}
			
		}
	
  }  
}  