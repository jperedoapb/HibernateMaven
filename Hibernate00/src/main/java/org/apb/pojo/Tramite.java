/**
 * 
 */
package org.apb.pojo;

import java.sql.Timestamp;

/**
 * @author Alvaro Peredo
 *
 */
public class Tramite {

	private int idtram;
	private String tipoTram;
	private Timestamp fhcTram;
	
	public int getIdtram() {
		return idtram;
	}
	public void setIdtram(int idtram) {
		this.idtram = idtram;
	}
	public String getTipoTram() {
		return tipoTram;
	}
	public void setTipoTram(String tipoTram) {
		this.tipoTram = tipoTram;
	}
	public Timestamp getFhcTram() {
		return fhcTram;
	}
	public void setFhcTram(Timestamp fhcTram) {
		this.fhcTram = fhcTram;
	}
	public Tramite() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Tramite(String tipoTram, Timestamp fhcTram) {
		
		this.tipoTram = tipoTram;
		this.fhcTram = fhcTram;
	}
	@Override
	public String toString() {
		return "Tramite [idtram=" + idtram + ", tipoTram=" + tipoTram + ", fhcTram=" + fhcTram + "]";
	}
	
	
	
}
