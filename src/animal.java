class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;

    Animal(){}
    Animal(String family,String name,int age,boolean isMammal){
        this.name=name;
        this.age=age;
        this.family=family;
        this.isMammal=isMammal;
    }
    void displayAnimal(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(family);
        System.out.println(isMammal);
    }

}