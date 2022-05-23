/*
    equals()
return boolean
case sensitive
check order of characters

    equalsIgnoreCase()
case insensitive
*/

class Main{
    public static void main(String args[]){
        String str = "Hello";
        String str2 = "hello";

        boolean ans = str.equalsIgnoreCase(str2);

        System.out.println(ans);
    }
}