package com.biblioteca.gestion.service;
import java.util.ArrayList;
import com.biblioteca.gestion.model.Libro;

public class LibroService {
    private ArrayList<Libro> libros = new ArrayList<>();
    public void agregarLibro(Libro libro){
        
        libros.add(libro);
        System.out.println("Libro agregado correctamenta");
    }
    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }
        for(Libro l : libros){
            System.out.println(l.resumen());
            
        }
    }
    public void eliminarLibro(String isbn){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getIsbn().equals(isbn)){
                libros.remove(i);
                System.out.println("libro eliminado");
                return;
            }
        }
        System.out.println("libro no encontrado");
    }

    public void consultarLibro(String valor){
        for(Libro l : libros){
            if(l.getIsbn().equals(valor)){
                System.out.println(l.resumen());
                return;
            }
            if(l.getTitulo().equals(valor)){
                System.out.println(l.resumen());
                
            }
            if(l.getAutor().equals(valor)){
                System.out.println(l.resumen());
                
            }
        }
        System.out.println("Libro no encontrado");
    }
     public void consultarLibro2(String valor){
        for(Libro l : libros){
            if(l.getIsbn().equalsIgnoreCase(valor) || l.getTitulo().equalsIgnoreCase(valor) || l.getAutor().equalsIgnoreCase(valor)){
                System.out.println(l.resumen());
                return;
            }
           
        }
        System.out.println("Libro no encontrado");
    }

}
