public class Warrior extends Hero{
    public int healPoints;
    public String increaseExperience(){
        double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Уровень здоровья: " + healPoints + " увеличелся на 10% стало: " + tenPercent;
    }
    @Override
    public String applySuperAbility() {
        return "BerserkMood";
    }
}
