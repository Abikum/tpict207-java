public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name=name;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        
        if(age<15){
            System.out.println("not allowed");
        }
        else{
            this.age=age;
        }

    }
    public int getAge(){
        return this.age*365;
    }

    
}
