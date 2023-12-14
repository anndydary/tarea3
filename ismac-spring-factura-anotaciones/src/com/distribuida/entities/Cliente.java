package com.distribuida.entities;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	private int idCliente;
	private String nombre;
	private String apellido;
	private String cedula;
	private int edad; 
	private Date fechaNacimiento;
	private String direccion;
	private String correo;
	private String telefono;
	
	public Cliente() {
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("se ejecutan tereas despues de la construccion bean");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("se ejecutan tareas antes de la ejecucion del bean");
	}
	
	

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
				+ cedula + ", edad=" + edad + ", direccion=" + direccion + ", correo=" + correo + ", telefono="
				+ telefono + "]";
	}
	
}
