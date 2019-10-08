package workshop.orders;

public class BusOrder extends PaintOrder{
	
    protected String tipo_orden;
    protected int precio;


	protected BusOrder(int number, String plate, int total, double time, String tipo_orden, int precio) {
		super(number, plate, total, time);
        this.tipo_orden = tipo_orden;
        this.precio = precio;
	}


	public String getType() {

		return tipo_orden = "MICRO";
	}

	public String getPrice() {
        String tercer_digito;
        int descuento;
        int total_precio;
		if(this.state = State.WAITING) {
			return "?";
		} else {
            tercer_digito = this.plate.charAt(2);
            descuento = Integer.parseInt(tercer_digito) / 100;
            total_precio = this.total * (this.precio * descuento);

            return Integer.toString(total_precio);
            
		}
	}

	public void end() {
		this.state = State.Done;
	}

}