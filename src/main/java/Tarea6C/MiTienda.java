package Tarea6C;

import java.util.*;

public class MiTienda {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        //pantalones
        Pantalon pantalon1 = new Pantalon(1, "marca1", 1, 2, 1, "pantalon 1");
        Pantalon pantalon2 = new Pantalon(2, "marca2", 2, 1, 2, "pantalon 2");
        productos.add(pantalon1);
        productos.add(pantalon2);

        //libros papel
        LibroPapel libroPapel1 = new LibroPapel(10, "2", 3, 4, 1, "libro papel 1");
        LibroPapel libroPapel2 = new LibroPapel(2, "1", 4, 4, 2, "libro papel 2");
        productos.add(libroPapel1);
        productos.add(libroPapel2);

        //libros digital
        LibroDigital libroDigital1 = new LibroDigital(1, "3", 5, 5, 3, "libro digital 1");
        LibroDigital libroDigital2 = new LibroDigital(2, "4", 6, 6, 4, "libro digital 2");
        productos.add(libroDigital1);
        productos.add(libroDigital2);

        //foreach
        productos.forEach(s -> System.out.println(s.toString()));
        System.out.println("_____________________________________");

        //Sortear precio
        Comparator<Producto> comparatorPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        Collections.sort(productos, comparatorPrecio);
        System.out.println("List sorteado de precio:");
        productos.forEach(s -> System.out.println(s.toString()));
        System.out.println("_____________________________________");

        //Sortear codigo
        Comparator<Producto> comparatorCodigo = (p1, p2) -> Double.compare(p1.getCodigo(), p2.getCodigo());
        Collections.sort(productos, comparatorCodigo);
        System.out.println("List sorteado de codigo:");
        productos.forEach(s -> System.out.println(s.toString()));
        System.out.println("_____________________________________");

        //busqueda binaria
        //lista libros
        ArrayList<Libro> listLibros = new ArrayList<>(productos.size());
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Libro) {
                listLibros.add((Libro) productos.get(i));
            }
        }

        //iterator
        Iterator<Libro> iter = listLibros.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("_____________________________________");

        //sortear sobre isbn
        Collections.sort(listLibros);
        System.out.println("List sorteado de isbn:");
        listLibros.forEach(s -> System.out.println(s.toString()));
        System.out.println("_____________________________________");

        //enviar e cargar
        ListIterator<Libro> iterLibro = listLibros.listIterator();

        while (iterLibro.hasNext()) {
            Libro tmp = iterLibro.next();

            if (tmp instanceof LibroPapel) {
                LibroPapel tmpPapel = (LibroPapel) tmp;
                tmpPapel.enviar("direccion libro papel");
            } else if (tmp instanceof LibroDigital) {
                LibroDigital tmpDigital = (LibroDigital) tmp;
                tmpDigital.descargar();
            }

        }
        System.out.println("_____________________________________");

        //contains
        System.out.println(listLibros.contains(libroDigital1));
        System.out.println("_____________________________________");

        //List con productos que se envian
        ArrayList<Producto> listEnvian = new ArrayList<>();

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Ropa | productos.get(i) instanceof LibroPapel) {
                listEnvian.add(productos.get(i));
            }
        }

        //call metodo interfaz
        for (Producto tmp : listEnvian) {
            if (tmp instanceof LibroPapel) {
                ((LibroPapel) tmp).enviar("direccion libro papel");
            } else if (tmp instanceof Ropa) {
                ((Ropa) tmp).enviar("direccion ropa");
            }
        }
        System.out.println("_____________________________________");

        //metodo abstracto de libro
        for (Libro tmp : listLibros) {
            tmp.queLibroEs();
        }
    }
}
