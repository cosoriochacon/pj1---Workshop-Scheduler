/* CouperOrder.java */
/**
 ** Hecho por: Christian Osorio
 ** Carnet: 19003910
 ** Sección: AN
**/

package workshop.orders;

import java.util.Random;

public class CoupeOrder {
    
    protected String tipo_orden;
    protected int precio;


	protected CoupeOrder(int number, String plate, int total, double time, String tipo_orden, int precio) {
		super(number, plate, total, time);
        this.tipo_orden = tipo_orden;
        this.precio = precio;
	}


	public String getType() {

		return tipo_orden = "COUPE";
	}

	public String getPrice() {
        Random rnd = new Random();
        int descuento;
        int total_precio;

		if(this.state = State.WAITING) {
			return "?";
		} else {
            descuento = (rnd.nextInt(5) + 5) / 100;
            total_precio = this.total * (this.precio * descuento);

            return Integer.toString(total_precio);
            
		}
	}

	public void end() {
		this.state = State.Done;
	}
}