package org.example.homework7.arena.heroes;

public class Knight extends Hero {
    private int armor;

    public Knight(String name, int level, int health, int armor) {
        super(name, level, health);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("Рыцарь бьёт мечом!");
    }

//    @Override
//    public final void rest() {
//        System.out.println("Герой отдыхает и восстанавливает силы.");
//    }

    @Override
    public String toString() {
        return "Имя рыцаря: " + super.getName() + "\n Броня: " + armor;
    }
}
