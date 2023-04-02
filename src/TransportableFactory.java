public class TransportableFactory {

    private static TransportableFactory instance;

    private TransportableFactory() {

    }

    public static TransportableFactory getInstance() {
        if (instance == null) {
            instance = new TransportableFactory();
        }
        return instance;
    }

    public Transportable crearTransportable(String s) {
        switch (s) {
            case "carga1":
                return new CargaSimple("TV", "TV 32' LCD", 3.0, false);
            case "carga2":
                return new CargaSimple("Medicamento", "Caja de medicamentos", 2.0, true);
            case "contenedor1":
                CargaSimple tv = new CargaSimple("TV", "TV 32' LCD", 3.0, false);
                CargaSimple med = new CargaSimple("Medicamento", "Caja de medicamentos", 2.0, true);
                ContenedorComposite tvM = new ContenedorComposite("Contenedor", "Tv y medicamentos", 100.0);
                tvM.agregarCarga(tv);
                tvM.agregarCarga(med);

                return tvM;
            default:
                return null;


        }
    }
}