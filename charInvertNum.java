class charInvertNum {
    public int chr(String s){
        int num=0;
        int pre=c(s.charAt(0));

        for (int i=1;i<s.length();i++){
            int nex=c(s.charAt(i));
            if (pre>=nex){
                num+=pre;
            }else {
                num-=pre;
            }
            pre=nex;
        }
        num+=pre;
        return num;
    }
    public int c(char a){
        switch (a){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;

        }
        return 0;
    }

    public static void main(String[] args) {
        charInvertNum charInvertNum = new charInvertNum();
        charInvertNum.chr("LXVI");
        System.out.println(charInvertNum.chr("LXVI"));
    }
}
