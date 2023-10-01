
public class Main {
    public  static void main(String[] args){
        Animal lion=new Animal("","lion",20,true);
        Zoo myzoo=new Zoo("Myzoo","manouba",5);
        System.out.println(myzoo);
        System.out.println(myzoo.toString());
        myzoo.displayZoo();
        lion.displayAnimal();
        Animal tigre=new Animal("","tigre",20,true);
        Animal singe=new Animal("","singe",20,true);
        Animal elephant=new Animal("","elephant",20,true);
        Animal chat=new Animal("","chat",20,true);
        Animal chien=new Animal("","chien",20,true);
        myzoo.AddAnimal(lion);
        myzoo.AddAnimal(singe);
        myzoo.AddAnimal(elephant);
        myzoo.AddAnimal(tigre);
        myzoo.AddAnimal(chat);
        myzoo.AddAnimal(chien);



    }
}