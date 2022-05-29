import javax.swing.JOptionPane;

public class Cliente {
	
	//atributos
	
	int id;
	String apenom;
	int dni;
	int telefono;
	String direccion;
	
	//constructor
	
	public Cliente(int id,String apenom,int dni,int telefono,String direccion) {
		this.apenom = apenom;
		this.id=id;
		this.direccion=direccion;
		this.dni=dni;
		this.telefono=telefono;
	}
	public Cliente() {}
	
	//metodos
	
	public void nuevoPorPantalla() {
		id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del Cliente: "));
		apenom=JOptionPane.showInputDialog("Ingrese el Nombre y Apellido del Cliente: ");
		dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del Cliente: "));
		telefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del Cliente: "));
		direccion=JOptionPane.showInputDialog("Ingrese la direccion del Cliente: ");
		
	}
	
	public void ver()
    {
		System.out.println("Nombre y Apellido: " +this.apenom);
		System.out.println("DNI: " +this.dni);
		System.out.println("Telefono: " +this.telefono);
		System.out.println("Direccion: " +this.direccion);
    }
	
}