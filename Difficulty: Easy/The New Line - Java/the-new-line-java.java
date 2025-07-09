class Geeks {

    // Function to print each word in single line
    static void printIndividualLine() {

       // Your code here
        String s = "Geeks for Geeks";
        
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        
    }
}