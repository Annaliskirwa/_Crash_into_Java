public static void isPositive(int num) {
    if (num > 0) {
        System.out.println("the number is positive");
    } else {
        return;
    }
}

// methods with void return nothing, here used return to exit the method with condition.
//trying to return a value from a method with a void return type throws a compiler error.


// An example of a method with a return type:
public static int countSeeds(int pWeight, int pAge){
    return pWeight/5 + pAge;
}