public class p2{
    public static void main(String[] args) {
        double a , x , y , b , c , d , e , f ;
        int fx , fy ;
        a = 3.4 ;
        b = 50.2 ;
        e = 44.5 ;
        c = 2.1 ;
        d = 0.55 ;
        f = 5.9 ;

        x = ( ( e * d ) - ( b * f ) ) / ( ( a * d ) - ( b * c ) );
        y = ( ( a * f ) - ( e * c ) ) / ( ( a * d ) - ( b * c ) );

        fx = (int) x ;
        fy = (int) y ;

        System.out.println("3.4x+50.2y=44.5");
        System.out.println("2.1x+.55y=5.9");
        System.out.println("The x for this equation is : - "+ fx);
        System.out.println("The y for this equation is : - "+ fy);

    }
}