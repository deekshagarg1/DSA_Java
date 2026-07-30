
//creating the class
// for a every single student
class Student {
    int rno;
    String name;
    float percentage;

    //function
    void greeting(){
        System.out.println("hello my name is " +this.name);
    }

    void changeName(String newName){
        name = newName;
    }

    //we need a way to add the value  of the below -- properties object by object
    //we need one word to access every object -- this keyword
    
    Student(){ //constructor -- by default
        // this.rno = 34;
        // this.name ="deeksha garg";
        // this.percentage = 334.55f;

        //this is how you can call a constructor from another constructor
        this(13,"default person",100.0f);

    }

    //if variable name is same as constructor variable then we use this keyword, if not then there id no nedd of this keyword

    //Student sagar = new Student(12, "sagar garg", 99.7f);
    //here this is replaced by the sagar---
     Student(int roll , String name, float percecntage){ //constructor -- modifed
        rno = roll;
        this.name = name;
        this.percentage = percentage; 
    }

    //taking data from other object
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.percentage = other.percentage;
    }
}


public class basic{
    public static void main(String[] args){

        Student[] students = new Student[5];

        //declearing the object of the class

        // Student dee = new Student(); //dee is refernce for the class student

        // System.out.println(dee.name); //by default -- null
        // System.out.println(dee.rno); //by default -- 0
        // System.out.println(dee.percentage); //by default -- 0.0


        Student deeksha = new Student(); //deeksha is refernce for the class student

        // deeksha.rno = 2345;
        // deeksha.name = "deeksha";
        // deeksha.percentage = 99.5f;

        deeksha.greeting();
        deeksha.changeName("hello garg");
        System.out.println(deeksha.name);
        System.out.println(deeksha.rno);
        System.out.println(deeksha.percentage);


        //by using contructor--
        Student sagar = new Student(12, "sagar garg", 99.7f);
        System.out.println(sagar.rno+ " "+sagar.name +" "+ sagar.percentage);


        //taking things from other person;
        Student ak = new Student(deeksha);
        System.out.println(ak.name);//helllo garg


        //randomly calling -- by default
        Student random = new Student();
        System.out.println(random.name);


        //refercing the other object
        Student one = new Student();
        Student two = one;
        one.name = "something something";
        System.out.println(two.name);




// ---------------------------final classes--------------------

    // if you do not modify the variable then use final keyword--
    // always initilize while decalreing -- final 
    // final int bonus = 4;
    // bonus =6; //error: cannot assign a value to final variable bonus
    // System.out.println(bonus);


    final A hello = new A ("a's final"); 
    System.out.println(hello.naam);
    hello.naam = "other name";
    System.out.println(hello.naam);

    //when a non primitive is final, you cannot reassign it.
    // hello = new A ("new object"); //error :cannot assign a value to final variable hello



    //garbage collection works -- by using finialize ketword -- it will destroy the extra overloaded memory by default


    }
}

//hamesa main function k bhar hi class banti h
class A{
        final int num = 10;
        String naam;

        public A(String name){ //constructor
            this.naam = name;
        }
    }

