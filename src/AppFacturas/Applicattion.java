package AppFacturas;

import AppFacturas.modelo.Cliente;
import AppFacturas.modelo.Factura;
import AppFacturas.modelo.ItemFactura;
import AppFacturas.modelo.Producto;

public class Applicattion {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5484-51");
        cliente.setNombre("Facundo");


        Factura factura = new Factura("factura de facu", cliente);
        Producto producto;
        String nombre = "F";
        float precio = 0;
        int cantidad = 1;

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            producto.setNombre(nombre += "a");
            producto.setPrecio(i);
            cantidad++;
            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
        }
        System.out.println(factura.generarDetalle());
    }
}
