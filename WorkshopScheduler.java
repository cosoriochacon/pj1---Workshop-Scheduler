public class WorkshopScheduler {

    public static void main(String[] args) {
        System.out.println();

        if (args.length == 6) {
            double rangoInicio, rangoFinal, sedan, microbus, coupe, precio;

            if (args[0].equals("-rr") || args[0].equals("-fcfs") || args[0].equals("-lcfs")) {

                try {
                    String rango = args[1];
                    String[] arr = rango.split("-");
                    rangoInicio = Double.parseDouble(arr[0]);
                    rangoFinal = Double.parseDouble(arr[1]);
                    if (rangoInicio >= rangoFinal) {
                        showError("El primer numero debe ser menor al segundo", "Segundo");
                    }
                } catch (Exception e) {
                    showError("El rango de tiempo debe seguir esta base: N-N donde N representan segundos", "Segundo");
                }

                try {
                    sedan = Double.parseDouble(args[2]);
                } catch (Exception e) {
                    showError("Este parametro debe ser un numero", "Tercer");
                }

                try {
                    microbus = Double.parseDouble(args[3]);
                } catch (Exception e) {
                    showError("Este parametro debe ser un numero", "Cuarto");
                }

                try {
                    coupe = Double.parseDouble(args[4]);
                } catch (Exception e) {
                    showError("Este parametro debe ser un numero", "Quinto");
                }

                try {
                    precio = Double.parseDouble(args[5]);
                } catch (Exception e) {
                    showError("Este parametro debe ser un numero", "Sexto");
                }

                for (int i = 0; i < args.length; i++) {
                    System.out.println("Parametro ingresado" + args[i]);
                }
            } else {
                showError("Solo puedes escoger estas politicas: -fcfs, -lcfs o -rr", "Primer");
            }
        } else {
            showError("No se encontraron los suficientes parametros", "seguimiento del");
        }

    }

    public static void showError(String err, String arg) {
        int num = err.length();
        String argument = "Error en el " + arg + " parametro";
        String margin = "----";
        String content = "|   " + err + "   |";
        String marginVertical = "|   ";
        for (int i = 0; i < num; i++) {
            margin += "-";
            marginVertical += " ";
        }
        margin += "----";
        marginVertical += "   |";

        System.out.println(argument);
        System.out.println(margin);
        System.out.println(marginVertical);
        System.out.println(content);
        System.out.println(marginVertical);
        System.out.println(margin);
        System.exit(0);
    }
}