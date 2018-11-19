interface StringFunc {
    String func(String n);
}

class LambdaArgDemo {
    public static void main(String args[]) {
static String stringOp(StringFunc sf, String s) {
    returh sf.func(s);
}

        String inStr = "Lambdas Using In Java";
        String outStr;

        System.out.println("out string: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase() , inStr);
        System.out.println("The string in uppercase: " + outStr);

        outStr = stringOp((str) -> {
                        String result = "";
                        int i;
                        for(i = 0; i <str.length(); i++) {
                            if(str.charAt(i) != ' ')
                                result += str.Char(i);
                        }
                        return result;
        }, inStr);

        System.out.println("The string with spaces removed: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("The string reversed: " + 
                            stringOp(reverse, inStr));
    }
}