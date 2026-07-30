class Human{

    int age;
    String name;
    int salary;
    static long population; 

    // //if there is a static function we cannot use this in it
    //   static void greeting1(){
    //    System.out.println("hello deeksha");
    //    System.out.println(this.name); //error: non-static variable this cannot be referenced from a static context
    // }

Human(int age, String name, int salary){ //consturctor

    this.age = age;
    this.name = name;
    this.salary = salary;
    // Human.population += 1; //both Human and this are same work
    this.population += 1;
}

}

public class  staticVar{

//sttaic block
static int a =4;
static int b;

static{
    System.out.println("I am a static block"); //it woll only run once, when the first obj is created, i.e. when the class is loaded
    b = a * 5;
}


    public static void main(String[] args){

        System.out.println(Human.population); //static can be acces without creating the object of the class -- it belong to the class not the object


        Human deeksha = new Human(22, "deeksha" , 10000);
        Human sagar = new Human(20, "sagar" , 100000);

        System.out.println(deeksha.name);

        //sttaic will be same for all always -- static are not depend on object -- we does not need to create an object for them
        System.out.println(deeksha.population);
        System.out.println(sagar.population);


//calling non-sttaic function inside the static function we need to make obj refernce--
staticVar obj = new staticVar();
obj.greeting();

//calling static block funcion
System.out.println("a : " +obj.a + "  " +" b : " +obj.b);

obj.b +=3;
System.out.println("a : " +obj.a + "  " +" b : " +obj.b);

staticVar obj2 = new staticVar();
System.out.println("a : " +obj2.a + "  " +" b : " +obj2.b);


  }

//deponds on obj(non-static function) -- so did call in static main function  --- we know that something which is not static, belongs to an object/intances
    
void greeting(){
    System.out.println("hello deeksha");
}

}