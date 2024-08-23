import java.util.Locale.LanguageRange;

public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private double avgdDepth;
    private boolean isSaltWater;



    public BodyOfWater(String n, int l, double a, boolean i){
        name = n;
        largestDiameter = l;
        avgdDepth = a;
        isSaltWater = i;
    }
    public BodyOfWater(String n, double a){
        name = n;
        avgdDepth = a;

    }
    public void setName(String n){
        name = n;
    }
    public void setlargestDiameter(int l){
        largestDiameter= l;
    }
    
    public void setavgdepth(double a){
        avgdDepth = a;
    }
         
    public void setisSaltWater(boolean true){
        isSaltWater = i;
    }
    public String name(){
        return name;
    }

    public int largestDiameter(){
        return largestDiameter;
    }



}

