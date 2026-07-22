public class pattern{
    public static void main(String[] args){
        reverseTriangle(5);
        triangle1(5,0);
        triangle2(5,0);
    }

// -------------------------------------------
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
    static void reverseTriangle(int n){
        if(n==0){
            return;
        }
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
        reverseTriangle(n-1);
    }

    // another way---------------------
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
    static void triangle1(int r , int c){
        if(r==0){
            return;
        }

        if(c < r){
             System.out.print("* ");
             triangle1(r, c+1);
        }else{
             System.out.println();
             triangle1(r-1 , 0);
        }
    }

// ------------------------------------------------------
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
      static void triangle2(int r , int c){
        if(r==0){
            return;
        }

        if(c < r){
             triangle2(r, c+1);
             System.out.print("* ");
        }else{
             triangle2(r-1 , 0);
             System.out.println();
        }
    }



}