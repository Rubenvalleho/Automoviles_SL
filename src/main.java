import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Vehiculos vehiculo1 = new Vehiculos();
        vehiculo1.setMarca("Dacia");
        vehiculo1.setModelo("Sandero");
        vehiculo1.setColor("Gris");
        vehiculo1.setCombustible("Diesel");
        vehiculo1.setMotor("1.5 DCI");
        vehiculo1.setCv("95 cv");
        vehiculo1.setMatricula("7777hrf");

        Vehiculos vehiculo2 = new Vehiculos();
        vehiculo2.setMarca("Mazda");
        vehiculo2.setModelo("3");
        vehiculo2.setColor("Negro");
        vehiculo2.setCombustible("Gasolina");
        vehiculo2.setMotor("SkyActive X");
        vehiculo2.setCv("185 cv");
        vehiculo2.setMatricula("9999hhh");

        Ventas venta1 = new Ventas();
        venta1.setCodigoVenta("001");
        venta1.setFechaVenta("Dia 19");
        venta1.setVehiculos(vehiculo1);
        venta1.setPrecio("10.000€");

        ArrayList<Ventas> ventas = new ArrayList<>();
        ventas.add(venta1);

        Clientes cliente1 = new Clientes();
        cliente1.setNombre("Antonio");
        cliente1.setApellidos("Perez");
        cliente1.setDireccion("Calle XXX");
        cliente1.setDni("000000000h");
        cliente1.setVentas(ventas);

        Altas alta1 = new Altas();
        alta1.setCodigoAlta("001");
        alta1.setFechaAlta("Dia 12");
    }

}
