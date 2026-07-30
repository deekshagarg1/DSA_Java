public abstract class abstract1{

abstract void career(String name);
abstract void partner(String name, int age);

static void hello(){
     System.out.println("i'm hello");
    }

void normal(){
     System.out.println("i'm normal");
    }


    public static void main(String[] args){
        Son son = new Son();
        son.career("son");

        son.partner("deeksha",22);

        Daughter daughter = new Daughter();
        daughter.career("daughter");

        abstract1.hello(); //static call

        son.normal(); //non-static call

    }
}

//you cannot create a object and constructor,non-static of an abstract class --- static method can be made