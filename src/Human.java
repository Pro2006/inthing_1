import com.nikita.*;
public class Human {
    int age = 17; // возраст
    double weight = 189.5; // рост
    int intelect = 100; // интелект
    Car car;

    public static void main(String[] args) {
        Human human = new Human();
        human.birthday();
        System.out.println(human.smart());
        human.BuyBread();
        System.out.println(human.love(human.age, human.intelect, human.weight, false));
    }

    void birthday() { // день рождения
        age += 1;
        weight += 10;
        intelect += 5;
    }

    void BuyMilk() {
        System.out.println("I buyed bread");
    } // купить молоко

    void BuyBread() {
        System.out.println("I buyed milk");
    } // купить хлеб

    int smart() {
        return intelect;
    } // возвращает интелект

    boolean love(int age, double intel, double weight, boolean drunk) { // определяет привлеккательность для женщин
        if (age >= 18 && intel > 100 && weight >= 185 && !drunk) {
            return true;
        } else return false;
    }
}
/* В основном, всё, что я буду писать в этой программе будет
 просто обучением или тренировкой, которая будет, по моему плану проходить каждый день*/