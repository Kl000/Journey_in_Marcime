package model.entities;

public class Affinity {
	//each affinity is a percentage : 0 to less than 1 = weakness ; more than 1 = strong point
	private double fire, ice, ground, shadow, light, wind;

	public Affinity(double fire, double ice, double ground, double shadow, double light, double wind) {
		super();
		this.fire = fire;
		this.ice = ice;
		this.ground = ground;
		this.shadow = shadow;
		this.light = light;
		this.wind = wind;
	}

	public double getFire() {
		return fire;
	}

	public void setFire(double fire) {
		this.fire = fire;
	}

	public double getIce() {
		return ice;
	}

	public void setIce(double ice) {
		this.ice = ice;
	}

	public double getGround() {
		return ground;
	}

	public void setGround(double ground) {
		this.ground = ground;
	}

	public double getShadow() {
		return shadow;
	}

	public void setShadow(double shadow) {
		this.shadow = shadow;
	}

	public double getLight() {
		return light;
	}

	public void setLight(double light) {
		this.light = light;
	}

	public double getWind() {
		return wind;
	}

	public void setWind(double wind) {
		this.wind = wind;
	}
	
	public double getWater() {
		return (this.fire+this.ice)/2;
	}
	
	public double getMagma() {
		return (this.fire+this.ground)/2;
	}
	
	public double getElectric() {
		return (this.fire+this.wind)/2;
	}
	
	public double getLaser() {
		return (this.fire+this.light)/2;
	}
	
	public double getNature() {
		return (this.ice+this.ground)/2;
	}
	
	public double getDeath() {
		return (this.ice+this.wind)/2;
	}
	
	public double getHeal() {
		return (this.ice+this.light)/2;
	}
	
	public double getPortal() {
		return (this.ground+this.wind)/2;
	}
	
	public double getCristal() {
		return (this.ground+this.light)/2;
	}
	
	public double getPsy() {
		return (this.wind+this.light)/2;
	}
	
	public double getAffinity(String element) {
		double elementAffinity = 1;
		
		switch(element) {
		case ("fire") :
			elementAffinity = this.getFire();
			break;
		case ("ice") :
			elementAffinity = this.getIce();
			break;
		case ("ground") :
			elementAffinity = this.getGround();
			break;
		case ("wind") :
			elementAffinity = this.getWind();
			break;
		case ("light") :
			elementAffinity = this.getLight();
			break;
		case ("shadow") :
			elementAffinity = this.getShadow();
			break;
		case ("water") :
			elementAffinity = this.getWater();
			break;
		case ("magma") :
			elementAffinity = this.getMagma();
			break;
		case ("electric") :
			elementAffinity = this.getElectric();
			break;
		case ("laser") :
			elementAffinity = this.getLaser();
			break;
		case ("nature") :
			elementAffinity = this.getNature();
			break;
		case ("death") :
			elementAffinity = this.getDeath();
			break;
		case ("heal") :
			elementAffinity = this.getHeal();
			break;
		case ("portal") :
			elementAffinity = this.getPortal();
			break;
		case ("cristal") :
			elementAffinity = this.getCristal();
			break;
		case ("psy") :
			elementAffinity = this.getPsy();
			break;
		}
		return elementAffinity;
	}
	
	
}
