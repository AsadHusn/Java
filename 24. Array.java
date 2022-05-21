class Main{
    public static void main(String args[]){
        int n[] = {5,4,3,2,1};
        // or
        int[] m = {1,2,3,4,5};
        // or
        char ch[] = {'H','i','!'};
        // or
        String str[] = {"Asad","Hussain"};

        // length property not function
        int l = m.length;

        for(int i=0; i<l; i++){
            System.out.print(m[i] + "\t");
        }
    }
}