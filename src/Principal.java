import java.util.Date;  
public class Principal {

	public static void main(String[] args) {
		
		//clientes
		Cliente cl1 = new Cliente(1,"Alan",3522342,115445634,"direccion1");
		Cliente cl2 = new Cliente(2,"Nicolas",3242562,1156773433,"direccion2");
		Cliente [] ListaCLientes;
		
		ListaCLientes = new Cliente [2];
		ListaCLientes[0]=cl1;
		ListaCLientes[1]=cl2;
		System.out.println("CLIENTES");
		 for (int i=0;i<ListaCLientes.length;i++) {
			  var a = ListaCLientes[i];
		      a.ver();
		 }
		 
		 
		 //proveedores
		 Proveedor pr1 = new Proveedor(1,"prov1","Tecno","30-12312331-2",1134343434,"direccion1");
		 Proveedor [] ListaProv;
		 ListaProv = new Proveedor[1];
		 ListaProv[0]=pr1;
		 System.out.println("PROVEEDORES");
		 
		 for (int i=0;i<ListaProv.length;i++) {
			  var a = ListaProv[i];
		      a.ver();
		 }
		 
		 
		 
		//productos
		Tipo_producto tipo_prod = new Tipo_producto(1,"Componente PC");
		Producto prod1 = new Producto(1,"Placa de video",12000.00,tipo_prod);
		Producto prod2 = new Producto(2,"Gabiente",7000.00,tipo_prod);
		Producto prod3 = new Producto(3,"Disco SSD",2500.00,tipo_prod);
		Producto [] ListaProductos;
		
		ListaProductos = new Producto [3];
		ListaProductos[0]=prod1;
		ListaProductos[1]=prod2;
		ListaProductos[2]=prod3;
		System.out.println("PRODCUTOS");
		 for (int i=0;i<ListaProductos.length;i++) {
			  var a = ListaProductos[i];
		      a.ver();
		 }
		 
		 
		 //nueva venta
		 Date fecha = new Date(); 
		 Venta venta1 = new Venta(1,fecha,cl1, "Efectivo",ListaProductos);
		 venta1.ver();
}

}