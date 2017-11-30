public class Dinversos {
 
        public int inv (int n){
        int a = n;
        int c = 0;
        int b;
        
        do {
            a = (int)a/10;
            b = n % 10;
            c = (c*10)+b;
            n=a;
        }while(a > 0) ;
        return c;
    }
}

