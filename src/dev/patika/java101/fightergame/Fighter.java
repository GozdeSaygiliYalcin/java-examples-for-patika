package dev.patika.java101.fightergame;

public class Fighter {
	
	private String name;
    private int damage;
    private int health;
    private int weight;
    private double dodge;
	
    
	public Fighter(String name, int damage, int health, int weight, double dodge) {
		super();
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
	}
	
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " damage hit.");

        if (foe.dodge()) {
            System.out.println(foe.name + " refused damage hit.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }
    


    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getDodge() {
		return this.dodge;
	}

	public void setDodge(double dodge) {
		this.dodge = dodge;
	}
    
    

}
