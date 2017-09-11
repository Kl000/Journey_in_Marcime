package model.entities;

public class Statistics {
	private int maxHealPoint, actualHealPoint, attack, actualAttack, defense, actualDefense, magic, actualMagic,
			resistance, actualResistance, technic, actualTechnic, speed, actualSpeed, mobility, actualMobility, temperature;
	private State state;
	private Mobility mobilityByTile;
	public Statistics(int maxHealPoint, int attack, int defense, int magic, int resistance, int technic, int speed,
			int mobility, Mobility mobilityByTile, int temperature, State state) {
		super();
		this.maxHealPoint = maxHealPoint;
		this.actualHealPoint = maxHealPoint;
		this.attack = attack;
		this.actualAttack = attack;
		this.defense = defense;
		this.actualDefense = defense;
		this.magic = magic;
		this.actualMagic = magic;
		this.resistance = resistance;
		this.actualResistance = resistance;
		this.technic = technic;
		this.actualTechnic = technic;
		this.speed = speed;
		this.actualSpeed = speed;
		this.mobility = mobility;
		this.actualMobility = mobility;
		this.mobilityByTile = mobilityByTile;
		this.temperature = temperature;
		this.state = state;
	}

	public Statistics(int maxHealPoint, int attack, int defense, int magic, int resistance, int technic, int speed,
			int mobility, Mobility mobilityByTile, int temperature) {
		this(maxHealPoint, attack, defense, magic, resistance, technic, speed, mobility, mobilityByTile, 
				temperature, new State("alive"));
	}

	public int getMaxHealPoint() {
		return maxHealPoint;
	}

	public void setMaxHealPoint(int maxHealPoint) {
		this.maxHealPoint = maxHealPoint;
	}
	
	public int getActualHealPoint() {
		return actualHealPoint;
	}

	public void setActualHealPoint(int actualHealPoint) {
		if(actualHealPoint <= 0) {
			this.actualHealPoint = 0;
			this.setState("dead");
		} else {
			if(this.actualHealPoint == 0) {
				this.setState("alive");
			}
			this.actualHealPoint = actualHealPoint;
		}
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getActualAttack() {
		return actualAttack;
	}
	
	public void setActualAttack(int actualAttack) {
		this.actualAttack = actualAttack;
	}
	
	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getActualDefense() {
		return actualDefense;
	}

	public void setActualDefense(int actualDefense) {
		this.actualDefense = actualDefense;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}
	
	public int getActualMagic() {
		return actualMagic;
	}

	public void setActualMagic(int actualMagic) {
		this.actualMagic = actualMagic;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	
	public int getActualResistance() {
		return actualResistance;
	}

	public void setActualResistance(int actualResistance) {
		this.actualResistance = actualResistance;
	}

	public int getTechnic() {
		return technic;
	}

	public void setTechnic(int technic) {
		this.technic = technic;
	}
	
	public int getActualTechnic() {
		return actualTechnic;
	}

	public void setActualTechnic(int actualTechnic) {
		this.actualTechnic = actualTechnic;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getActualSpeed() {
		return actualSpeed;
	}

	public void setActualSpeed(int actualSpeed) {
		this.actualSpeed = actualSpeed;
	}

	public int getMobility() {
		return mobility;
	}

	public void setMobility(int mobility) {
		this.mobility = mobility;
	}
	
	public int getActualMobility() {
		return actualMobility;
	}

	public void setActualMobility(int actualMobility) {
		this.actualMobility = actualMobility;
	}
	
	public Mobility getMobilityByTile() {
		return mobilityByTile;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public String getState() {
		return this.state.getActualState();
	}
	
	public void setState(String state) {
		this.state.setActualState(state);
	}
}
