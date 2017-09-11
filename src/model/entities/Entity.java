package model.entities;

/**
 * 
 * @author _K1000_
 * define an entity, basically a monster with the ability to fight
 */
public class Entity {
	
	private Statistics stats;
	private Affinity affinity;
	private Identity identity;
	
	public Entity(Statistics stats, Affinity affinity, Identity identity) {
		super();
		this.stats = stats;
		this.affinity = affinity;
		this.identity = identity;
	}
	
	public void healed(int heal) {
		this.stats.setActualHealPoint(this.stats.getActualHealPoint() + heal);
	}
	
	public void hurtPhysically(int damage, String element) {
		this.stats.setActualHealPoint(this.stats.getActualHealPoint() - ((int)(damage * this.affinity.getAffinity(element)) - this.stats.getDefense()));
	}
	
	public void hurtPhysically(int damage) {
		this.hurtPhysically(damage, "");
	}
	
	public void hurtMagically(int damage, String element) {
		this.stats.setActualHealPoint(this.stats.getActualHealPoint() - ((int)(damage * this.affinity.getAffinity(element)) - this.stats.getResistance()));
	}
	
	public void hurtMagically(int damage) {
		this.hurtMagically(damage, "");
	}
	
	public int attack() {
		int alea = (int)(Math.random());
		if(this.stats.getAttack() > this.stats.getTechnic()) {
			alea = ((int)(Math.random())) * (this.stats.getAttack() - this.stats.getTechnic());
		}
		return this.stats.getAttack()-alea;
	}
	
	public int attack(String element) {
		return (int)(this.attack() * this.affinity.getAffinity(element));
	}
	
	public String getName() {
		return this.identity.getName();
	}
	
	public String getSpecie() {
		return this.identity.getSpecie();
	}
	
	public String getSexe() {
		return this.identity.getSexe();
	}
}
