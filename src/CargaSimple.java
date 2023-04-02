public class CargaSimple implements Transportable {

    private String nombre;
    private String descripcion;
    private Double peso;
    private boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, Double peso, boolean refrigeracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.refrigeracion = refrigeracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPeso() {
        return peso;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    @Override
    public Double calcularPeso() {

        if(this.refrigeracion == true){
            return this.peso += this.peso*0.10;
        }
        else return this.peso;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
