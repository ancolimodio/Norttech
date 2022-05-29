import javax.swing.JOptionPane;

public class Proveedor {
	
	//atributos
	int id;
	String razon_social;
	String rubro;
	String cuit;
	int telefono;
	String direccion;
	
	
	//constructor
	
	public Proveedor(int id,String razon_social,String rubro,String cuit,int telefono,String direccion) {
		this.id=id;
		this.cuit = cuit;
		this.direccion = direccion;
		this.rubro = rubro;
		this.razon_social = razon_social;
		this.telefono= telefono;
		
	}
	//metodos
	public void nuevoPorPantalla() {
		id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del Proveedor: "));
		razon_social=JOptionPane.showInputDialog("Ingrese el Nombre del Proveedor: ");
		cuit=(JOptionPane.showInputDialog("Ingrese el CUIT del Proveedor: "));
		telefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del Proveedor: "));
		direccion=JOptionPane.showInputDialog("Ingrese la direccion del Proveedor: ");
		
	}
	
	public void ver() {
		System.out.println("Nombre: " +this.razon_social);
		System.out.println("CUIT: " +this.cuit);
		System.out.println("Telefono: " +this.telefono);
		System.out.println("Direccion: " +this.direccion);
	}
}