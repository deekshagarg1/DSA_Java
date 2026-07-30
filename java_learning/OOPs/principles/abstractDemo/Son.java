public class Son extends abstract1{

    @Override
    public void career(String name){
        System.out.println("i'm going to be "+name);
    }

    @Override
    public void partner(String name, int age){
         System.out.println("i love "+name + " he is "+age);
    }

    @Override
    void normal(){
        super.normal();
    }
}