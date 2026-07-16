public class question{
    public static void main(String[] args){

        // funRev(5);
        // fun(5);
        // System.out.println(factorail(5));
        // System.out.println(sum(5));
        // System.out.println(digitSum(12345));
        // System.out.println(recurDigitSum(12345));
        // System.out.println(recurDigitProduct(12345));
        // conceptPrePost(5); //reversing the value
        // rev1(12345);
        // System.out.print(sum);
        // System.out.println(rev2(12345));
        // System.out.println(pali(1221));
        // System.out.println(countZeros(102201));
        System.out.println(numberOfSteps(17));




    }

// ------------------------------------------
    static void funRev(int n){ //5 4 3 2 1
        if(n==0){
            return;
        }
        System.out.println(n);
        funRev(n-1); //donot have to write return statement here because the return type is void
    }

// -------------------------------------------
      static void fun(int n){//1 2 3 4 5
        if(n==0){
            return;
        }
        fun(n-1); //donot have to write return statement here because the return type is void
        System.out.println(n);
    }

// ------------------------------------------------
static int factorail(int n ){
    if(n==0){
        return 1;
    }
    return n*factorail(n-1);
}

// -----------------------------------
static int sum(int n ){
    if(n==0){
        return 1;
    }
    return n+sum(n-1);
}

// ---------------------------------------
// sum of invidual digit----

static int digitSum(int n){
    int sum = 0;

    if(n==0){
        return sum;
    }

    while(n !=0 ){
        int lD = n % 10;
        sum += lD;
        n =n /10;
    }
    return sum;
}

// ---digit sum by using recursion------
static int recurDigitSum(int n){
    if(n==0){
        return 0;
    }
return (n%10) + recurDigitSum(n/10);
}

// Dry Run (n = 1234)
// digitSum(1234)
// = 4 + digitSum(123)
// = 4 + 3 + digitSum(12)
// = 4 + 3 + 2 + digitSum(1)
// = 4 + 3 + 2 + 1 + digitSum(0)
// = 4 + 3 + 2 + 1 + 0
// = 10

// ------------------------------------------
static int recurDigitProduct(int n){
    if(n%10==n){
        return n;
    }
return (n%10) * recurDigitProduct(n/10);
}

// ---------------------------------------------
static void conceptPrePost(int n){
    if(n==0){
        return;
    }

    System.out.print(n);
    // conceptPrePost(n--); //goes infinity because it will first pass the number then perform decrement

    conceptPrePost(--n);
}

// --------------------------------------
// reverse a number using recursion-----

static int sum =0;
static void rev1(int n){
     if(n==0){
        return;
    }
    int rem = n % 10;
    sum = sum * 10 + rem;
    rev1(n/10);
}

// ------------------------------------------
static int rev2(int n){
     //sometimes you might need some additional variable in the argument
     //in that class, make another function
     int digit = (int)(Math.log10(n))+1;
     return helper(n, digit);
}

private static int helper(int n  , int digits){
    if(n%10==n){
        return n;
    }
    int rem = n%10;
    return rem * (int)Math.pow(10, digits-1) + helper (n/10 , digits-1);
}


// ----------------------------------------------
// palidrome----------
static boolean pali(int n){
    return n==rev2(n);
}

// ----------------------------------
// count zeros-- important✔️

static int countZeros(int n){
    return helper1(n,0);
}

//special pattern, how to pass a vlaue to above calls (return same value to above calls)
private static int helper1(int n, int c){
    if(n==0){
        return c;
    }

    int rem = n % 10;
    if(rem == 0){
        return helper1(n/10 , c +1);
    }
    return helper1(n/10 , c);
}

// ----------------------------------------
// 1342. Number of Steps to Reduce a Number to Zero
// Given an integer num, return the number of steps to reduce it to zero.
// In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

// Example 1:

// Input: num = 14
// Output: 6
// Explanation: 
// Step 1) 14 is even; divide by 2 and obtain 7. 
// Step 2) 7 is odd; subtract 1 and obtain 6.
// Step 3) 6 is even; divide by 2 and obtain 3. 
// Step 4) 3 is odd; subtract 1 and obtain 2. 
// Step 5) 2 is even; divide by 2 and obtain 1. 
// Step 6) 1 is odd; subtract 1 and obtain 0.

// leetcode -- https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

static int numberOfSteps(int num) {
        return helper2 ( num , 0); // number ,steps
    }

    private static int helper2(int num , int steps){
        if(num == 0){
            return steps;
        }

        if( num % 2 == 0){
            return helper2( num/2 , steps+1); //if number is even then divide by 2, and increase the step by 1
        }
        return helper2(num-1 , steps+1);//if number is odd then subtract by 1, and increase the step by 1
    }
}