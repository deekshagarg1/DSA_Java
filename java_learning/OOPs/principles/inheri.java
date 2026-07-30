public class inheri{
    public static void main(String[] args){

       Box box = new Box(4);
       System.out.println(box.h +" " +box.l+" "+box.w);

       Box box2 = new Box(4,5,6);
       System.out.println(box2.h +" " +box2.l+" "+box2.w);
    
       Box box3 = new Box(box); //taking refernce from box in box3
       System.out.println(box3.h +" " +box3.l+" "+box3.w);

//childern
       Boxweight weg = new Boxweight(234, 5,6.9,8);
       System.out.println(weg.weight+" "+weg.h +" " +weg.l+" "+weg.w);
    }
}


//BASE CLASS=-----
class Box{
    double h;
    double w;
    double l;

//by default
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

//square
Box(double side){
        this.h =side;
        this.l=side;
        this.w=side;
    }
///cube
    Box(double h, double w, double l){
        this.h =h;
        this.l=l;
        this.w=w;
    }

 //by old box (previous obj ref)
 Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}


// //CHILD CLASS------ inside Boxweight.java
// public class Boxweight extends Box{
//     double weight;

//     Boxweight(){
//         this.weight = -1;
//     }

//      Boxweight(double weight, double h, double w, double l){
//         super(h,w,l);//what is this? call the parent class contructor
//         //use to intialize values present in parent class
//         this.weight = weight;
//     }
// }