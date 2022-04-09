public class ReverseString {
    public static void Rev(String s ,int indx){
        if (indx==0){
            System.out.println(s.charAt(indx));
            return;
        }
        System.out.println(s.charAt(indx));
        Rev(s,indx-1);


    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println("abcd");
        Rev("abcd",s.length()-1);
    }
}
