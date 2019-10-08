/* SedanOrder.java */
/**
 ** Hecho por: Christian Osorio
 ** Carnet: 19003910
 ** Sección: AN
**/

package workshop.orders;

public class SedanOrder {
    protected String tipo_orden;
    protected int precio;

    public SedanOrder(int total, String tipo_orden, int precio) {
        super(total);
        this.tipo_orden = tipo_orden;
        this.precio = precio;
    }

	public String getType() {

		return tipo_orden = "SEDAN";
	}

	public String getPrice() {
        int total_precio;

		if(this.state = State.WAITING) {
			return "?";
		} else {

            total_precio = this.total * this.precio;

            return Integer.toString(total_precio);
            
		}
	}

	public void end() {
		this.state = State.Done;
	}
}