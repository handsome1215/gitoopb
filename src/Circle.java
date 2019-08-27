
public class Circle {
    private double redius;

    public Circle(double rad){
        this.redius = rad;
    }

    public double getRedius() {
        return redius;
    }
    
    public double computeArea(){
        return Math.PI*Math.pow(redius,2);
    }
    public double computeCircumference(){
        return 2 * Math.PI*redius ;
    }
    public double computeDiamemter(){
        return 2 *redius;
    }
    
       
}//end
