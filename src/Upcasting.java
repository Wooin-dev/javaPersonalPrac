public class Upcasting {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal goat = new Goat();

        Animal[] zoo = {dog, cat, goat};

//        Animal fakeDog = new Animal();
//        Dog realDog = (Dog) fakeDog;
//
//        System.out.println(realDog.size);




        for(Animal mal : zoo){
            mal.bark(); //같은 메소드이지만 각 오버라이딩된 메소드로 실행된다.
        }
    }
}

class Animal {
    String feature;
    int size;

    void bark(){
        System.out.println("짖다!");
    }
}

class Dog extends Animal {
    @Override
    void bark(){
        System.out.println("왈왈!");
    }
}

class Cat extends Animal {
    @Override
    void bark(){
        System.out.println("이야오옹~");
    }
}

class Goat extends Animal {
    @Override
    void bark(){
        System.out.println("곹.곹.");
    }
}