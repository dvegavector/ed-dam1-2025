package features;

public class facturas {
    private int id;
    private int coste;
    private int idClientes;
    private String numFacturas;
    private String fechas;
    private String conceptos;
    private double importes;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumFacturas() {
        return numFactura;
    }

    public void setNumFacturas(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getFechas() {
        return fecha;
    }

    public void setFechas(String fecha) {
        this.fecha = fecha;
    }

    public String getConceptos() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}
