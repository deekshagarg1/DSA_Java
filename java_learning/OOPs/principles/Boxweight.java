
//CHILD CLASS------ of inheri-- Box
public class Boxweight extends Box{
    double weight;

    Boxweight(){
        this.weight = -1;
    }

     Boxweight(double weight, double h, double w, double l){
        super(h,w,l);//what is this? call the parent class contructor
        //use to intialize values present in parent class
        this.weight = weight;
    }

    Boxweight(Boxweight other){
        super(other);
        this.weight = other.weight;
    }
}