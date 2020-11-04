package cl.tswoo.adoptatubadbunny.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conejo")
public class Conejo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idConejo;
	
	@Column(name="nombre")
	private String nombreConejo;
	
	@Column(name="sexo")
	private String sexoConejo;
	
	@Column(name="fechaNacimiento")
	private Date fechaNac;

	public Conejo() {

	}
	public int getIdConejo() {
		return idConejo;
	}
	
	public void setIdConejo(Integer idConejo) {
		this.idConejo = idConejo;
	}
	
	public String getNombreConejo() {
		return nombreConejo;
	}
	public void setNombreConejo(String nombreConejo) {
		this.nombreConejo = nombreConejo;
	}
	public String getSexoConejo() {
		return sexoConejo;
	}
	public void setSexoConejo(String sexoConejo) {
		this.sexoConejo = sexoConejo;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	

}
