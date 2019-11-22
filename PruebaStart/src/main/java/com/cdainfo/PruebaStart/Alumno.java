package com.cdainfo.PruebaStart;

import javax.persistence.*;
@Entity
public class Alumno {
	//Dockers, hiroku(server)
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idalumno;
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "apellido")
		private String apellido;
		
		@Column(name = "numero")
		private int numero;
		@Column(name = "dni")
		private String dni;
		
		
		
		public Long getIdAlumno() {
			return idalumno;
		}
		public void setIdAlumno(Long idAlumno) {
			this.idalumno = idAlumno;
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
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		@Override
		public String toString() {
			return "Alumno: \n" +
	                "   idAlumno: " + this.idalumno +
	                "\n   Nombre: " + this.nombre +
	                "\n   Apellido:  " + this.apellido;
		}
}
