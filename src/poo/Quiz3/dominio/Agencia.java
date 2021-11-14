package poo.Quiz3.dominio;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agencia {
    private String nombre;
    private List<Inmueble> inmuebles;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }
    public void agregarInmueble(Inmueble... i){
        this.inmuebles.addAll(Arrays.asList(i));
    }
    public boolean arrendar(Inmueble Arrendable){
        if(Arrendable instanceof Arrendable && Arrendable.isArrendado() == false){
            ((Arrendable) Arrendable).arrendar();
            System.out.println(Arrendable.getDireccion()+" Arrendado exitosamente");
            return true;
        }else{
            System.out.println(Arrendable.getDireccion()+" no se puede Arrendar");
            return false;
        }
    }
    public boolean devolver(Inmueble Arrendable){
        if(Arrendable instanceof Arrendable && Arrendable.isArrendado() == true){
            ((Arrendable) Arrendable).arrendar();
            System.out.println(Arrendable.getDireccion()+" devuelto exitosamente");
            return false;
        }else{
            System.out.println(Arrendable.getDireccion()+" no se puede devolver");
            return true;
        }
    }

    public void listaArrendados(){
        this.inmuebles.forEach(inmueble -> {
            if(inmueble instanceof Arrendable && inmueble.isArrendado()== true){
                System.out.println(inmueble+" Arrendado");
            }
        });
    }

}
