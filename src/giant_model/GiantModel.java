package giant_model;

public class GiantModel {
	
	HealthModel health;
	FatigueModel fatigue;
	NourishmentModel nourishment;
	
	public GiantModel() {
		//for default constructor
	}
	
	
	public GiantModel(HealthModel health, FatigueModel fatigue, NourishmentModel nourishment) {
		this.health = health;
		this.fatigue = fatigue;
		this.nourishment = nourishment;
	}


	public HealthModel getHealth() {
		return health;
	}


	public void setHealth(HealthModel health) {
		this.health = health;
	}


	public FatigueModel getFatigue() {
		return fatigue;
	}


	public void setFatigue(FatigueModel fatigue) {
		this.fatigue = fatigue;
	}


	public NourishmentModel getNourishment() {
		return nourishment;
	}


	public void setNourishment(NourishmentModel nourishment) {
		this.nourishment = nourishment;
	}


	@Override
	public String toString() {
		return "GiantModel [health=" + health + ", fatigue=" + fatigue + ", nourishment=" + nourishment + "]";
	}
	

}