package com.distribuida.principal;
import java.util.Date;
import javax.naming.Context;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Producto;

public class Principal {
public static void main(String[]args) {
	
	System.out.println("***************1******************");
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
	System.out.println("***************2******************");
	
	Cliente cliente = context.getBean("cliente",Cliente.class);
	Producto producto = context.getBean("producto",Producto.class);
	Factura factura = context.getBean("factura",Factura.class);
	DetalleFactura detalleFactura = context.getBean("detalleFactura",DetalleFactura.class);
	DatosEmpresa datosEmpresa=context.getBean("datosEmpresa",DatosEmpresa.class);
	cliente.setIdCliente(1);
	cliente.setCedula("1752242360");
	cliente.setNombre("Daryn");
	cliente.setApellido("Ñacato");
	cliente.setEdad(21);
	cliente.setFechaNacimiento(new Date());
	cliente.setDireccion("Pifo");
	cliente.setTelefono("0992998429");
	cliente.setCorreo("darynrespeto135@gmail.com");
	
	
	producto.setIdProducto(1);
	producto.setNombre("Peras");
	producto.setDescripcion("caja de peras");
	producto.setPrecio(14.50);
	producto.setStock(200);
	

	factura.setIdFactura(1);
	factura.setNumFactura("FAC-001");
	factura.setFecha(new Date());
	factura.setTotalNeto(56.50);
	factura.setIva(0.12);
	factura.setTotal(60.45);
	
	detalleFactura.setIdFacturaDetalle(1);
	detalleFactura.setCantidad(8);
	detalleFactura.setSubtotal(84.60);
	System.out.println(factura.toString());
	System.out.println(detalleFactura.toString());
	System.out.println(datosEmpresa.toString());
	System.out.println("***************3******************");
	context.close();
	System.out.println("***************4******************");
}

}
