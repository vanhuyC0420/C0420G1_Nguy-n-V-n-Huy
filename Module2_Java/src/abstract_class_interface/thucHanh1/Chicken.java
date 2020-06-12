package abstract_class_interface.thucHanh1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicsken:  O Ô Ơ";
    }

    @Override
    public String howToEat() {
        return "could be fried(Có thể bị chiên)";
    }
}
