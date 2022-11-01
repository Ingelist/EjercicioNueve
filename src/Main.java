public class Main {
    public static void main(String[] args) {

                Cliente cliente = new Cliente();
                Trabajador trabajador = new Trabajador();
                cliente.edad = 55;
                cliente.nombre = "Ingelist";
                cliente.telefono = 123456789;
                cliente.credito = 200.55;

                System.out.println("Mi Nombre es: " + cliente.nombre + ", hoy cumplí " + cliente.edad
                        + " años y mi numero de telefono es: " + cliente.telefono
                        + " tengo credito de: $" + cliente.credito + " pesos");
                trabajador.edad = 50;
                trabajador.nombre = "David";
                trabajador.telefono = 987654321;
                trabajador.salario = 1822.22;
                System.out.println("Mi nombre es: " + trabajador.nombre +
                        ", tengo " + trabajador.edad + " años y mi numero de telefono es: "
                        + trabajador.telefono
                        + " y Gano un salario minimo de: $" + trabajador.salario + " pesos");

            }
        }

    class Persona{
        int edad;
        String nombre;
        int telefono;

        }

        class Cliente extends Persona{
            double credito;
        }

        class Trabajador extends Persona {
            double salario;

}