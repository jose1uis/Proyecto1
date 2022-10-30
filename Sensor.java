class Sensor extends Principal{
  public static Sensor[] sensores = new Sensor[8];
  public static int tamano = 8;
  public static int posAnadir = 0;
  
  private String tipo;
  private double valor;

  public Sensor(){
    
  }
    public Sensor(String tipo, double valor) {
    this.tipo = tipo;
    this.valor = valor;
  }

  public String getTipo() {
    return this.tipo;
  }

  public double getValor() {
    return this.valor;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public static void agregar(Sensor n){
    sensores[posAnadir] = n;
    posAnadir ++;
  }

@Override
  public String toString(){
    return "el tipo de sensor es" + tipo + "y su valor es"+ valor;
  }
  
  public static String toStringSensores() {
    String salida = "";
    for (int x = 0; x < posAnadir; x++) {
      salida = salida + sensores[x].toString();
    }
    return salida;
  }

  public static String toStringTipo(Sensor[] temperatura) {
    String salida = "";
    for (int x = 0; x < posAnadir; x++) {
      if (temperatura[x].tipo.equals("temperatura")) {
        salida += temperatura[x].toString();
      }
    }
    return salida;
  }

  public static int cantidadSensores() {
    return posAnadir;
  }

  public static Sensor[] ordenarSensores() {
    Sensor[] nuevo = sensores.clone();
    Sensor aux;
    
    for (int x = 1; x < posAnadir; x++){

      for (int y = 0; y < posAnadir - 1; y++) {
        
        if (nuevo[y].getValor() > nuevo[y + 1].getValor()) {
          aux = nuevo[y];
          nuevo[y] = nuevo[y + 1];
          nuevo[y + 1] = aux;
        }
      }
    }
    return nuevo;
  }
}