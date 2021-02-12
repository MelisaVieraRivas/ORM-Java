package modelo.entidades;
// Generated 12-feb-2021 20:59:22 by Hibernate Tools 5.2.12.Final

/**
 * ContactousuarioId generated by hbm2java
 */
public class ContactousuarioId implements java.io.Serializable {

	private int idUsuario;
	private String email;
	private String telefonoMovil;
	private String telefonoFijo;

	public ContactousuarioId() {
	}

	public ContactousuarioId(int idUsuario, String email, String telefonoMovil, String telefonoFijo) {
		this.idUsuario = idUsuario;
		this.email = email;
		this.telefonoMovil = telefonoMovil;
		this.telefonoFijo = telefonoFijo;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoMovil() {
		return this.telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getTelefonoFijo() {
		return this.telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContactousuarioId))
			return false;
		ContactousuarioId castOther = (ContactousuarioId) other;

		return (this.getIdUsuario() == castOther.getIdUsuario())
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getTelefonoMovil() == castOther.getTelefonoMovil())
						|| (this.getTelefonoMovil() != null && castOther.getTelefonoMovil() != null
								&& this.getTelefonoMovil().equals(castOther.getTelefonoMovil())))
				&& ((this.getTelefonoFijo() == castOther.getTelefonoFijo())
						|| (this.getTelefonoFijo() != null && castOther.getTelefonoFijo() != null
								&& this.getTelefonoFijo().equals(castOther.getTelefonoFijo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdUsuario();
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getTelefonoMovil() == null ? 0 : this.getTelefonoMovil().hashCode());
		result = 37 * result + (getTelefonoFijo() == null ? 0 : this.getTelefonoFijo().hashCode());
		return result;
	}

}
