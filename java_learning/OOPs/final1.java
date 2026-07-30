public class final1{
    public static void main(String[]args){

        final A dee = new A("deeksha garg");

        A obj = new A ("sagar");
        System.out.println(obj);

    }  
}

 class A{
    final int num =10;
    String name;

    public A(String name){
         this.name = name;
     }
        
    // @Override
    // protected void finalize() throws Throwable{ //-- used for garbage collection
    //     System.out.println("Object is destroyed");
    // }


    @Override
    public String toString() {
        // return "A{name='" + name + "', num=" + num + "}";
        return name;
    }

    }




//  final on a primitive means value cannot change.

// final on an object reference means the reference cannot point to another object.

// The object’s non-final fields can still change.

// finalize() is deprecated and should not be relied upon.

// Override toString() if you want meaningful output.

// Expected visible output after adding toString(): A{name='sagar', num=10}

// Without toString(), output will be something like: A@2f92e0f4