import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner ent = new Scanner(System.in);
        while (true) {
            System.out.println("0: Salir");
            System.out.println("1: Nuevo vehiculo");
            System.out.println("2: Ver informacion de vehiculos");
            System.out.println("3: Numero de vehiculos almacenados");
            System.out.println("4: Ver informacíon de vehículos verdes");
            System.out.println("5: vehículos modelos entre 2000 y 2021");
            System.out.println("6: Nuevo sensor");
            System.out.println("7: Ver informacíon de sensores");
            System.out.println("8: Numero de sensores almacenados");
            System.out.println("9: Ver informacíon de sensores tipo: temperatura");
            System.out.println("666: Ver informacíon de sensores temperatura ordenados por valor\n");
            int num = ent.nextInt();
            if (num == 0) {
                break;
            }else if (num == 1){
                if (Vehiculo.posAnadir < 10) {
                    System.out.println("Digite modelo");
                    int modelo = ent.nextInt();
                    System.out.println("Digite marca:");
                    String marca = ent.next();
                    System.out.println("Digite valor comercial");
                    double valor = ent.nextDouble();
                    System.out.println("Digite color");
                    String color = ent.next();
                    Vehiculo vehiculo = new Vehiculo(modelo, marca, valor, color);
                    Vehiculo.agregar(vehiculo);
                } else {
                    System.out.println("Error base de datos llena");
                }
            }else if(num == 2){
                System.out.println(Vehiculo.toStringVehiculos());
            }else if(num == 3){
                System.out.println("Cantidad de vehiculos en la base de datos: " + Vehiculo.cantidadVehiculos());
            }else if(num == 4){
                System.out.println("Los vehiculos verdes son:");
                System.out.println(Vehiculo.toStringColor());
            }else if(num == 5){
                System.out.println("Vehículos con modelo del 2000 hasta 2021 son: ");
                System.out.println(Vehiculo.vehiculoModelo());
            }else if(num == 6){
                if (Sensor.posAnadir < 8) {
                    System.out.println("Digite tipo:");
                    String tipo = ent.next();
                    System.out.println("Digite valor:");
                    int valor = ent.nextInt();
                    Sensor sensor = new Sensor(tipo, valor);
                    Sensor.agregar(sensor);
                }else{
                    System.out.println("Error base de datos llena");
                }
            }else if(num == 7){
                System.out.println(Sensor.toStringSensores());
            }else if(num == 8){
                System.out.println("Cantidad de sensores en la base de datos: " + Sensor.cantidadSensores());
            }else if(num == 9){
                System.out.println("Los sensores de tipo temperatura son:");
                System.out.println(Sensor.toStringTipo(Sensor.sensores));
            }else if(num == 666){
                System.out.println("Los sensores de tipo temperatura ordenados son:");
                System.out.println(Sensor.toStringTipo(Sensor.ordenarSensores()));    
            }
        }
        ent.close();
    }
}