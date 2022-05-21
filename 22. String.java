/*  java.lang  package
strings are immutable | not changeable
by string literal
by new keyword
Strings are object in java not array of chars
Strings are not ends with '\0' in java
You can read a char from a specific index with charAt(int index) but you can not modify it.
*/

class Main{
    public static void main(String args[]){
        // by string literal
        String str = "Hello";

        // by new keyword
        String str2 = new String("Java");
        
        // character array
        char name[] = {'R', 'A', 'M', 'A', 'N'};
        // using range
        String str3 = new String(name, 2, 3);

        // length
        int len = str.length();

        // concatenate
        String str4 = "Java" + "Programming";
        System.out.println(str4);
        
    }
}