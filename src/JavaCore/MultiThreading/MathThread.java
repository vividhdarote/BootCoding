package JavaCore.MultiThreading;

class MathSin extends Thread{
    public double deg;
    public double res;
    public MathSin(int degree){
        deg=degree;
    }
    public void run(){
        System.out.println("Executing sin of : "+(int)deg);
        double Deg2Rad =Math.toRadians(deg);
        res= Math.sin(Deg2Rad);
        System.out.println("Exit from MathSin.. Result: "+res);
    }
}


class MathCos extends Thread{
    public double deg;
    public double res;
    public MathCos(int degree){
        deg=degree;
    }
    public void run(){
        System.out.println("Executing Cos of : "+(int)deg);
        double Deg2Rad =Math.toRadians(deg);
        res= Math.cos(Deg2Rad);
        System.out.println("Exit from MathCos.. Result: "+res);
    }
}


class MathTan extends Thread{
    public double deg;
    public double res;
    public MathTan(int degree){
        deg=degree;
    }
    public void run(){
        System.out.println("Executing Tan of : "+(int)deg);
        double Deg2Rad =Math.toRadians(deg);
        res= Math.tan(Deg2Rad);
        System.out.println("Exit from MathTan.. Result: "+res);
    }
}




public class MathThread {
    public static void main(String[] args) {
        MathSin st= new MathSin(90);
        MathCos ct = new MathCos(0);
        MathTan tt = new MathTan(45);

        st.start();
        ct.start();
        tt.start();

        try{
            st.join();
            ct.join();
            tt.join();

            double z = st.res + ct.res + tt.res;
            System.out.println("Sum of sin,cos,tan = "+z);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
