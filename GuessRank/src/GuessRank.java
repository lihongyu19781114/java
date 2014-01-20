//有A、B、C、D和E共5所学校。
//在一次检查评比中，已知E肯定不是第2或第3名，
//他们互相进行推测，
//A校有人说，E校肯定是第1名；
//B校有人说，我校可能是第2名；
//C校有人说，A校最差；
//D校有人说，C校不是最好；
//E校有人说，D校会获得第一名。
//结果只有第一名和第二名的学校的人猜对了。编程指出这5所学校的名次。

public class GuessRank {
    public static void main(String[] args) {
        for(int a = 1; a<=5; a++){
            for(int b = 1; b<=5; b++){
                for(int c = 1; c<=5; c++){
                    for(int d = 1; d<=5; d++){
                        for(int e = 1; e<=5; e++){
                            if(toMeetAllTheConditions(a,b,c,d,e)) {
                                System.out.println("a:"+a+" b:"+b+" c:"+c+" d:"+d+" e:"+e);
                            }
                        }
                    }
                }
            }
        }
    }
    private static boolean toMeetAllTheConditions(int a, int b, int c, int d, int e) {
        if( (a==b)||(a==c)||(a==d)||(a==e)||(b==c)||(b==d)||(b==e)||(c==d)||(c==e)||(d==e) ) return false;

        if( (e==2)||(e==3) ) return false;

        if( ((a==1)||(a==2)) && (e!=1) ) return false;
        if( ((a!=1)&&(a!=2)) && (e==1) ) return false;

        if( ((b==1)||(b==2)) && (b!=2) ) return false;
        if( ((b!=1)&&(b!=2)) && (b==2) ) {/*DoNothing*/}

        if( ((c==1)||(c==2)) && (a!=5) ) return false;
        if( ((c!=1)&&(c!=2)) && (a==5) ) return false;

        if( ((d==1)||(d==2)) && (c==1) ) return false;
        if( ((d!=1)&&(d!=2)) && (c!=1) ) return false;

        if( ((e==1)||(e==2)) && (d!=1) ) return false;
        if( ((e!=1)&&(e!=2)) && (d==1) ) return false;

        return true;
    }
}
