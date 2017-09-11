package model.entities;

import java.util.HashMap;

public class Mobility {
	private HashMap<String, Double> mobilities;
	
	public Mobility(double dirt, double grass, double bush, double trees, double sand, double gravel, double stone, double wood, double roc, double shallowWater, double deepWater) {
		mobilities = new HashMap<String, Double>();
		mobilities.put("dirt", dirt);
		mobilities.put("grass", grass);
		mobilities.put("bush", bush);
		mobilities.put("trees", trees);
		mobilities.put("sand", sand);
		mobilities.put("gravel", gravel);
		mobilities.put("stone", stone);
		mobilities.put("wood", wood);
		mobilities.put("roc", roc);
		mobilities.put("shallowWater", shallowWater);
		mobilities.put("deepWater", deepWater);
	}
	
	public double getDirt() {
		return mobilities.get("dirt");
	}
	
	public void setDirt(double dirt) {
		this.mobilities.replace("dirt", dirt);
	}
	
	public double getGrass() {
		return mobilities.get("grass");
	}
	
	public void setGrass(double grass) {
		this.mobilities.replace("grass", grass);
	}
	
	public double getBush() {
		return mobilities.get("bush");
	}
	
	public void setBush(double bush) {
		this.mobilities.replace("bush", bush);
	}
	
	public double getTrees() {
		return mobilities.get("trees");
	}
	
	public void setTrees(double trees) {
		this.mobilities.replace("trees", trees);
	}
	
	public double getSand() {
		return mobilities.get("sand");
	}
	
	public void setSand(double sand) {
		this.mobilities.replace("sand", sand);
	}
	
	public double getGravel() {
		return mobilities.get("gravel");
	}
	
	public void setGravel(double gravel) {
		this.mobilities.replace("gravel", gravel);
	}
	
	public double getStone() {
		return mobilities.get("stone");
	}
	
	public void setStone(double stone) {
		this.mobilities.replace("stone", stone);
	}
	
	public double getWood() {
		return mobilities.get("wood");
	}
	
	public void setWood(double wood) {
		this.mobilities.replace("wood", wood);
	}
	
	public double getRoc() {
		return mobilities.get("roc");
	}
	
	public void setRoc(double roc) {
		this.mobilities.replace("roc", roc);
	}
	
	public double getShallowWater() {
		return mobilities.get("shallowWater");
	}
	
	public void setShallowWater(double shallowWater) {
		this.mobilities.replace("shallowWater", shallowWater);
	}
	
	public double getDeepWater() {
		return mobilities.get("deepWater");
	}
	
	public void setDeepWater(double deepWater) {
		this.mobilities.replace("deepWater", deepWater);
	}
	
	public int getMovementOnElement (int movement, String element) {
		return (int)(movement*mobilities.get(element));
	}
}
