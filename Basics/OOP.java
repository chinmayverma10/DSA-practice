public class OOP {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("Black");
        p1.settip(5);
        System.out.println(p1.color+" "+ p1.tip_size);


        Bank myacc = new Bank();
        myacc.name = "Chinmay ";
        // myyacc.Password = "hello123" //Private cannot be accessed
        myacc.setpass("hello123"); //Public function can be accessed


        Student s1 = new Student();
        s1.setdata("Chinmay ", 2102145);
        s1.getdata();

        employee em1 = new employee("Chinmay ");
        employee em2 = new employee(5052);
        employee em3 = new employee("Ishika", 5323);
        employee em4 = new employee(em3);
        em1.getdata();
        em2.getdata();
        em3.getdata();
        em4.getdata();


        Fish shark = new Fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.color = "Black";
        System.out.println(dobby.color);

        Addition add = new Addition();
        add.sum(2, 5);
        add.sum(2, 2, 5);


        King k = new King();
        k.move();
        k.imp();
    }
}
class Bank {
    public String name;
    private String Password;
    public void setpass(String new_pass){
        Password = new_pass;
    }
}
class Pen {
    String color;
    int tip_size;

    public void setcolor(String newcolor) {
        color = newcolor;
    }

    public void settip(int tip) {
        tip_size = tip;
    }
}
class Student {
    private String name;
    private int Roll_no;

    public void setdata(String name,int Roll_no){
        this.name = name;
        this.Roll_no = Roll_no;
    }

    public void getdata(){
        System.out.println(name+" "+Roll_no);
    }
}
class employee {
    String name;
    int id;
    // Shallow Copy
    employee(employee em){
        this.name = em.name;
        this.id = em.id;
    }
    employee(String name){
        this.name = name;
    }
    employee(int id){
        this.id = id;
    }
    employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void getdata() {
        System.out.println(name+" "+id);
        
    }
}

//INHERITANCE

//Single level inheritance 
class  Animal{
    String color;
    public void eat(){
        System.out.println("eats");
    }
    public void breathe() {
        System.out.println("Breathes");
        
    }
}

class Fish extends Animal {
    int fins;
    public void swims() {
        System.out.println("Swims");
    }
}


//Multi level inheritance 

class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals {
    int bread;
}


//Polymorphism
//Function Overloading 
class Addition {
    int sum(int a,int b){
        System.out.println(a+b);
        return 0;
    }
    int sum(int a,int b,int c){
        System.out.println(a+b+c);
        return 0;
    }

}


//Interfaces
interface Chessplayer {
    void move();
}
interface Importance {
    void imp();
}
class Queen implements Chessplayer,Importance {
    public void move() {
        System.out.println("up, down, left, right");
    }
    public void imp() {
        System.out.println("Very Important ");
    }
}
class King implements Chessplayer,Importance {
    public void move() {
        System.out.println("up, down, left, right  -  by one step");
    }
    public void imp() {
        System.out.println("Very Important ");
    }
}