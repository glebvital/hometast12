import java.util.ArrayList;

public class petStore {
    ArrayList<Animal> animals = new ArrayList<>();
    public void addPet(Animal animal){
        if (animal!=null){
            animals.add(animal);
            System.out.println(animal.getName()+" have been added");
        }
    }
    public void removePet(String name){
        for (Animal animal:animals){
            if (name.equals(animal.getName())){
                System.out.println(animal.getName()+" have been removed");
                animals.remove(animal);
            }
        }
    }
    public void listPets(){
        System.out.println("------------");
        for (Animal animal:animals){
            if (animal instanceof Dog){
                System.out.println(animal.getInfo());
            } else if (animal instanceof Cat) {
                System.out.println(animal.getInfo());
            }
        }
        System.out.println("------------");
    }
    public void customizeAnimalInfo(String name,String customInfo){
        for (Animal animal:animals){
            if (name.equals(animal.getName())){
                customInfo.toLowerCase();
                animal.customizeInfo(customInfo);
            }
        }
    }
}
