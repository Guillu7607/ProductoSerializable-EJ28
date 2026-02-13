import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LeerProductos {
    public static void main(String[] args) {
        double precioMinimo = 100;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productos.dat"))) {
            List<Producto> productos = (List<Producto>) ois.readObject();

            System.out.println("Productos con precio mayor a " + precioMinimo + ":");
            for (Producto p : productos) {
                if (p.getPrecio() > precioMinimo) {
                    System.out.println(p);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer productos: " + e.getMessage());
        }
    }
}