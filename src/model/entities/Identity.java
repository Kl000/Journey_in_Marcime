package model.entities;

public class Identity {
	
	private String name, specie, sexe;

	public Identity(String name, String specie, String sexe) {
		super();
		this.name = name;
		this.specie = specie;
		this.sexe = sexe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
}
