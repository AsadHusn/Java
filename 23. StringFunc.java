class Main{
    public static void main(String args[]){
        String str = "Hello";

        // change string into char array
        char[] array = str.toCharArray();

        // length
        int l = str.length();

        // concatenate
        str = str + "Java";
        // or
        String str1 = str.concat("programming");

        // compareTo method
        // compare on unicode basis
        // return 0 or 1 or -1
        int n = str.compareTo(str1);
        

        System.out.println(str1);
    }
}