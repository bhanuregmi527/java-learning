package String;

public class stringToInteger {
    public static void main(String[] args) {
        String str="-1123u3761867";
        System.out.println(stringToInt( str));


    }
    static int stringToInt(String str){
        String newStr=str.replaceAll("\\s", "");
        int minmumValu= (int) Math.pow(-2,31);
        int maxmumValu= (int) Math.pow(2,31)-1;
        StringBuilder finalString= new StringBuilder();
        int value;
        for (int i = 0; i <newStr.length() ; i++) {
            if(newStr.charAt(i)=='-' || newStr.charAt(i)=='+'){
                finalString.append(newStr.charAt(i));


            }else {
                if(newStr.charAt(i)<'0' || newStr.charAt(i)>'9' && newStr.charAt(i)!='-' && newStr.charAt(i)!='+' ){
                    String result= finalString.toString();
                    value= Integer.parseInt(result);
                    if(value>minmumValu&& value<maxmumValu){
                        return value;
                    }else return 0;

                } else if(newStr.charAt(i)>='0' &&newStr.charAt(i)<='9'){
                    finalString.append(newStr.charAt(i));


                }

            }
        }
        String result= finalString.toString();
        value= Integer.parseInt(result);
        if(value>minmumValu&& value<maxmumValu){
            return value;
        }else{
            return 0;
        }





    }

}
