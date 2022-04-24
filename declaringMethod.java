public static void isPositive(int num) {
    if (num > 0) {
        System.out.println("the number is positive");
    } else {
        return;
    }
}

// methods with void return nothing, here used return to exit the method with condition.
//trying to return a value from a method with a void return type throws a compiler error.