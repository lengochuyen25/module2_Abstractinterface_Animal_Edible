package animal;

import Ediable.Ediable;

public class Tiger extends Animal implements Ediable {
    @Override
    public String makeSound(){
        return "Tiger: roarrr!";
    }

    @Override
    public String howToEat() {
        return "eat meat";
    }


}
