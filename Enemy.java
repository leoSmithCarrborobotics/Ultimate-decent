public class Enemy {
    public static double damageFactor = 1;
    public static double healthFactor = 1;
    private double damage;
    private double health;
    private int turns;
    public boolean active;

    public Enemy(double health, double damage) {
        this.health = health * healthFactor;
        this.damage = damage * damageFactor;
    }
    public double doDamage() { //returns the damage an enemy would deal
        int damageTotal = 0;
        for (int i = 0; i < turns; i++) {
            damageTotal += damage * damageFactor;
        }
        return damageTotal;
    }
    public boolean takeDamage(double damage) { //returns true if the enemy is dead
        this.health -= damage;
        if (this.health <= 0) {
            return true;
        }
        return false;
    } 
}