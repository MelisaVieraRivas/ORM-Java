package modelo.entidades;
// Generated 11-feb-2021 18:18:30 by Hibernate Tools 5.2.12.Final

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contactousuario generated by hbm2java
 */
@Entity
@Table(name = "ContactoUsuario")
public class Contactousuario implements java.io.Serializable {

	private ContactousuarioId id;

	public Contactousuario() {
	}

	public Contactousuario(ContactousuarioId id) {
		this.id = id;
	}

	public ContactousuarioId getId() {
		return this.id;
	}

	public void setId(ContactousuarioId id) {
		this.id = id;
	}

}
