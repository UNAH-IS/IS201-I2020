public class HolaMundoArgumentos{ //UpperCamelCase
    public static void main(String[] args){
        System.out.println("Cantidad de argumentos: " + args.length);
        if (args.length == 2)
            System.out.println("Hola " + args[0] + " " + args[1]);
    }
}