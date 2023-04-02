public class Test {
    public static void main(String[] args) {

        TransportableFactory f = TransportableFactory.getInstance();
        Transportable TV = f.crearTransportable("carga1");
        Transportable med = f.crearTransportable("carga2");
        Transportable tvM = f.crearTransportable("contendedor1");


        Barco barco = new Barco();
        barco.agregarCarga(TV);
        barco.agregarCarga(med);
        barco.agregarCarga(tvM);

        barco.mostrarCarga();


    }

}