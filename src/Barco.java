import java.util.ArrayList;

public class Barco {

    private ArrayList<Transportable> cargas;

    public void agregarCarga (Transportable t) {
        if(this.cargas == null){
            this.cargas = new ArrayList<>();
        }
        this.cargas.add(t);
    }


    public void mostrarCarga(){
        for(Transportable t: this.cargas){
            System.out.println("El producto " + t.getNombre() + " tiene un peso de " + t.calcularPeso());
        }

    };

}
