package paquetes;

//Definimos un "grupo" llamado funciones
public class funciones {

  // Comprobar si un numero es capicua
  public static boolean esCapicua(long numeroIntroducido) {

    boolean capicua = false;

    if (funciones.volteado(numeroIntroducido) == numeroIntroducido) {
      capicua = true;
    }
    return capicua;
  }

  // Comprobar si un numero es primo
  public static boolean esPrimo(int num) {

    int resultado;
    boolean primo = true;

    for (int i = 2; i < num; i++) {

      resultado = num % i;

      if (resultado == 0) {
        primo = false;
      }

    }
    return primo;
  }

  public static int siguientePrimo(int numero) {

    do {
      numero++;
    } while (funciones.esPrimo(numero) == false);

    return numero;
  }

  public static int numPotencia(int base, long l) {

    int total = 1;

    for (int i = 1; i <= l; i++) {

      total = total * base;

    }
    return total;
  }

  public static long digitos(long numero) {

    long digitos = 0;

    while (numero != 0) {
      numero = numero / 10;
      digitos++;
    }
    return digitos;
  }

  public static long volteado(long numero) {

    long volteado = 0;

    while (numero > 0) {

      volteado = (volteado * 10) + (numero % 10);

      numero /= 10;
    }
    return volteado;
  }

  public static int digitoN(long x, int n) {
    x = volteado(x);

    while (n-- > 0) {
      x = x / 10;
    }
    return (int) x % 10;
  }

  public static int posicionDeDigito(long x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {
    }
    ;

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }

  public static long quitaPorDetras(long x, int n) {
    return x / (long) numPotencia(10, n);
  }

  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = volteado(quitaPorDetras(volteado(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  public static int quitaPorDelante(int x, int n) {
    return (int) quitaPorDelante((long) x, n);
  }

  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  public static long juntaNumeros(long x, long y) {
    return (long) (x * numPotencia(10, digitos(y))) + y;
  }

  public static int trozoDeNumero(long x, int inicio, int fin) {
    return (int) trozoDeNumero((long) x, inicio, fin);
  }

  public static String convierteEnPalotes(int num){

    long vuelta = volteado(num);
    String palotes = "";
    
    while (vuelta >0){

      long aux = vuelta % 10;

      for (int i = 0; i<aux ;i++){
        palotes += "|";
      }
      vuelta = vuelta/10;
      if (vuelta != 0){palotes += "-";}
    }
    return palotes;
  }

  public static int[] filtraPrimos(int x[], int aux[]){
    int contador = 0;
    for (int i = 0; i < x.length; i++){
      if(funciones.esPrimo(x[i])){
        aux[contador] = x[i];
        contador++;
      }
    }
    return aux;
  }

  ///////////////////////////////////////////

  public static int[] mostrarArray(int x[]){
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i]+" ");
    }
    return x;
  }

  public static int[][] mostrarArrayBi(int x[][],int fil, int col){

    for (int i=0; i < fil ;i++){

      for (int j=0; j < col ; j++){

        System.out.print(x[i][j]+" ");

      }
      System.out.println("");
    }
    return x;
  }

  //EJ20

  public static int[] generaArrayInt(int tamano,int min, int max){
    int[] nuevoArray = new int[tamano];
    int range = (max - min) + 1;

    for (int i=0; i < nuevoArray.length; i++){

      nuevoArray[i] = (int)(Math.random() * range) + min;
           
    }
    return nuevoArray;
  }

  public static int minimoArrayInt(int x[]){
    int numMin = x[0];

    for (int c=0; c < x.length; c++){
      if (numMin > x[c]){
        numMin = x[c];
      }
    }
    return numMin;
  }

  public static int maximoArrayInt(int x[]){
    int numMax = x[0];

    for (int c=0; c < x.length; c++){
      if (numMax < x[c]){
        numMax = x[c];
      }
    }
    return numMax;
  }

  public static float mediaArrayInt(int x[]){
    float media = 0;

    for (int c=0; c < x.length; c++){
      media += x[c];
    }

    media = media / x.length;

    return media;
  }

  public static Boolean estaEnArrayInt(int x[], int num){
    
    boolean esta = false;

    for (int c=0; c < x.length; c++){
      if(num == x[c]){
        esta = true;
      }
    }

    return esta;
  }

  

  public static int posicionEnArray(int x[], int num){
    int posicion = 0;
    
    for (int c=0; c < x.length; c++){
      if(num == x[c]){
        posicion = c;
      }
    }
    
    return posicion;
  }

  public static int[] voltearArray(int x[]){

    int contador = 1;
    for (int i=0; i < x.length / 2; i++){
      int aux = x[x.length-contador];
      x[x.length-contador] = x[i];
      x[i] = aux;
      contador++;
    }
    return x;
  }

  public static int[] rotaIzquierdaArrayInt(int x[],int posiciones){
   
    for (int c =0; c <posiciones;c++){
      int aux = x[0];
      for (int i =1; i < x.length; i++){
        x[i-1] = x[i];
      }
      x[x.length -1] = aux;
    }
    return x;
  }

  public static int[] rotaDerechaArrayInt(int x[],int posiciones){
   
    for (int c =0; c <posiciones;c++){
      int aux = x[x.length-1];
      for (int i =x.length -2; i >=0 ; i--){
        x[i+1] = x[i];
      }
      x[0] = aux;
    }
    return x;
  }

  //EJ29

  public static int[][] generaArrayBiInt(int fil,int col, int min, int max){
    int[][] nuevoArray = new int[fil][col];
    int range = (max - min) + 1;

    for (int i=0; i < fil ;i++){

      for (int j=0; j < col ; j++){

        nuevoArray[i][j] = (int)(Math.random() * range) + min;

      }

    }
    return nuevoArray;
  }

  public static int[][] filaDeArrayBiInt(int x[][], int fil, int col, int filQuiere){

    for (int i=0; i < fil ;i++){

      for (int j=0; j < col ; j++){
      
        if(i == filQuiere){
          System.out.print(x[i][j]+" ");
        }        
        
      }
    }
    return x;
  }
  
  public static int[][] columnaDeArrayBiInt(int x[][], int fil, int col, int colQuiere){

    for (int i=0; i < fil ;i++){

      for (int j=0; j < col ; j++){
      
        if(j == colQuiere){
          System.out.print(x[i][j]+" ");
        }        
        
      }
      System.out.println("");
    }
    return x;
  }

  public static int[][] coordenadasEnArrayBiInt(int x[][], int fil, int col, int numQuiere){
    boolean paso = false;

    for (int i=0; i < fil ;i++){

      for (int j=0; j < col ; j++){
      
        if((x[i][j] == numQuiere)&&(paso == false)){
          System.out.print("Posicion en el array de ["+i+"]["+j+"].");
          paso = true;
        }        
        
      }
    }
    if (paso == false){
      System.out.print("No hay ninguna ocurrencia, {-1, -1}");
    }

    return x;
  }

}
