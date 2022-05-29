
public class Venta {
	
	//atributos
	int id;
	java.util.Date fecha;
	Cliente cliente;
	double precio_total;
	String forma_pago;
	Producto[] productos;
	
	
	//constructor
	public Venta(int id,java.util.Date fecha,Cliente cliente,String forma_pago, Producto[] productos){ 
		this.id=id;
		this.cliente=cliente;
		this.fecha=fecha;
		this.forma_pago=forma_pago;
		//this.precio_total= precio_total;
		this.productos = productos;
	}
		
	
	//metodos	
	public void ver()
    {
		var total = 0.0;
		System.out.println("Nombre y Apellido: " +this.cliente.apenom);
		System.out.println("Fecha: " +this.fecha);
	    System.out.println("Productos: ");
		 for (int i=0;i<this.productos.length;i++) {
			  var p = this.productos[i];
			  System.out.println("Item: " +p.descripcion + "Precio: "+ p.precio);
			  total = total + p.precio;
			  
		 }
		 System.out.println("Total: "+total);
    }
}	
	