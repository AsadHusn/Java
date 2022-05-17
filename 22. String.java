/*  java.lang  package
strings are immutable | not changeable
by string literal
by new keyword
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

        
    }
}