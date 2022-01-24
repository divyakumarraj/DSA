//removing character from word
public class Scratch {
    public static String remove(String str){
        if(str.length()==0){
            return str;
    }
        String result="";
        if(str.charAt(0)!='a'){
            result=result+str.charAt(0);
    }
        String recans=remove(str.substring(1));
        return result + recans;
    }
    public static void main(String[] args) {
        String name="divya";
        System.out.println(remove(name));
    }
    }

