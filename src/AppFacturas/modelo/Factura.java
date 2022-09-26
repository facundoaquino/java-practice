package AppFacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;

    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
//            hay que validar que item no sea null
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Facutura n° ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t Nif: ")
                .append(cliente.getNif());
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha factura: ")
                .append(df.format(this.fecha));
        for (ItemFactura item : this.items) {
            if(item == null){
                continue;
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append(calcularTotal());
        }
        return sb.toString();
    }
}
