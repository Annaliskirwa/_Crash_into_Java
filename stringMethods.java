public static void main(String[]args){
    String text = "The simple text string";

    boolean empty = text.isEmpty(); // false

    String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"

    boolean startsWith = textInUpperCase.startsWith("THE"); // true

    /* replace all space characters with empty strings */
    String noSpaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"

    String textWithWhitespaces = "\t text with whitespaces   !\n  \t";

    String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"

    // substring(beginIndex, endIndex)
    // endsWith(suffix)

    // string exceptions
    // NullPointerException: on null strings
    // StringOutOfBoundsException: trying to access a non-existing cahacter
}