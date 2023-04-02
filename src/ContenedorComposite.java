import java.util.ArrayList;

public class ContenedorComposite implements Transportable{

    private String nombre;
    private String descripcion;
    private Double peso;

    private ArrayList<Transportable> cargas;

    public ContenedorComposite(String nombre, String descripcion, Double peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.cargas= new ArrayList<>();
    }


    @Override
    public Double calcularPeso() {
        Double valorTotal = this.peso;
        for(Transportable t: this.cargas) {
            valorTotal += t.calcularPeso();
        }
        return valorTotal;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public void agregarCarga (Transportable t) {
        this.cargas.add(t);
    }



}
