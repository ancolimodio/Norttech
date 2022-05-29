import javax.swing.JOptionPane;

public class Producto {
	//atributos
	int id;
	String descripcion;
	double precio;
	Tipo_producto tipo_producto;
	
	
	//constructor
	
	public Producto(int id,String descripcion,double precio,Tipo_producto tipo_producto) {
		
		this.id=id;
		this.descripcion=descripcion;
		this.precio = precio;
		this.tipo_producto= tipo_producto;
		
	}
	public Producto() {}
	
	//Metodos 
	
	public void nuevoPorPantalla() {
		id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del Producto: "));
		descripcion=JOptionPane.showInputDialog("Ingrese la descripcion del Producto: ");
		precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del Producto: "));
		//tipo_producto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo producto del Producto: "));
	}
	
	public void ver()
    {
		System.out.println("descripcion: " +this.descripcion);
		System.out.println("precio: " +this.precio);
		System.out.println("tipo producto: " +this.tipo_producto.descripcion);
    }
}
