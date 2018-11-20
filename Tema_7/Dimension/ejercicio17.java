public class ejercicio17 {
    public static void main(String[] args) {

        int[] num = new int[10];
        int numUser = 0;
        boolean salida = false;

        //Generar numeros del array
        for (int i = 0; i < 10; i++) {
            num[i]=(int)(Math.random()*101);
        }

        //Mostrar array por terminal
        for(int i=0; i < 10; i++){
          System.out.println(num[i] + " en posicion del array n"+i);
        }

        while (salida == false){

            System.out.println("Por favor introduzca un numero que se encuentre en el array:");
            numUser = Integer.parseInt(System.console().readLine());

            for(int j=0; j < 10; j++){
                if (numUser == num[j]){
                    salida = true;
                }
            }
            if (salida == false){
                System.out.println("Incorrecto.");
            }
        }

        while (numUser != num[0]) {

            // Guarda el último
            int ultimo = num[9];
            
            // Rotación hacia la derecha una posición
            for (int i = 9; i > 0; i--) {
                num[i] = num[i - 1];
            }

            // Se coloca el primero
            num[0] = ultimo;
        }

        //Mostrar array por terminal
        for(int i=0; i < 10; i++){
            System.out.println(num[i] + " en posicion del array n"+i);
        }        

    }
}