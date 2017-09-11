package model.environnement;

public class Tile {
	public static final String[] TILE_TYPES = {"dirt", "grass", "bush", "trees", "sand", "gravel", "stone", "wood", "roc", "shallow water", "deep water"};
	
	private String tileType;
	
	public Tile(String tileType) {
		this.setType(tileType);
	}
	
	public String getTileType() {
		return tileType;
	}
	
	public void setType(String tileType) {
		int i = 0;
		boolean isAValidType = false;
		while (!isAValidType && i < Tile.TILE_TYPES.length) {
			isAValidType = tileType.equalsIgnoreCase(Tile.TILE_TYPES[i]);
			i++;
		}
		if (isAValidType) {
			this.tileType = tileType;
		}
	}
}
