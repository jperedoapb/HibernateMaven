/**
 * 
 */
package org.apb.pojo;

import java.sql.Timestamp;

/**
 * @author Alvaro Peredo
 *
 */
public class Alumno {
	
	public int idAlumno;
	public String nombre;
	public String apellidoPaterno;
	public Timestamp fechaAlta;
	/**
	 * @param nombre
	 * @param apellidoPaterno
	 * @param fechaAlta
	 */
	public Alumno(String nombre, String apellidoPaterno, Timestamp fechaAlta) {
		
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.fechaAlta = fechaAlta;
	}
	/**
	 * 
	 */
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the idAlumno
	 */
	public int getIdAlumno() {
		return idAlumno;
	}
	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	 * @return the fechaAlta
	 */
	public Timestamp getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	
	

}
