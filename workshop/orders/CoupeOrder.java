package workshop.orders;

import java.util.Random;

public class CoupeOrder {
    
    protected String tipo_orden;
    protected int precio;


	public CoupeOrder(int total, String tipo_orden, int precio) {
		super(total);
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