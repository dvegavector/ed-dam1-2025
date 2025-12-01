import Dominio.Clientes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Clientes cliente = new Clientes();

        cliente.setNombre();
        cliente.setApellidos();
        cliente.setDireccion();
        cliente.setNIF();
        cliente.setLocalidade();
        cliente.setProvincia();
        cliente.setTelefono();
        cliente.setEmail();


    }
}