package Teoria.Otros;

public class Argumentos {
    public static void main(String[] args) {
        //comprobar que lleguen 3 argumentos
        if(args.length != 3){
            System.out.println("Faltan argumentos");
            //System.exit(1);//acaba el programa
            return;
        }
        System.out.println("Leidos argumentos...");
        //convertimos y creamos las variables
        int numero1 = Integer.parseInt(args[0]);
        String operando = args[1];
        int numero2 = Integer.parseInt(args[2]);
        //segun el ordenador hacemos la operacion
        switch (operando){
            case "*" -> System.out.printf("%d %s %d = %d%n", numero1, operando, numero2, (numero1*numero2));
            case "/" -> System.out.printf("%d %s %d = %d%n", numero1, operando, numero2, (numero1/numero2));
            case "+" -> System.out.printf("%d %s %d = %d%n", numero1, operando, numero2, (numero1+numero2));
            case "-" -> System.out.printf("%d %s %d = %d%n", numero1, operando, numero2, (numero1-numero2));
            default -> System.out.printf("%s: operacion no valida", operando);
        }
    }
}
