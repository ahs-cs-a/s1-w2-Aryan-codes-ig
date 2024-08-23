public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Indian Ocean", 1000 , 100.2 , true);
        System.out.println("here");
        BodyOfWater c = new BodyOfWater("Lake Tahoe", 1200.3);


        


        System.out.println(b.name());
        System.out.println(b.largestDiameter());
        System.out.println(b.avgDepth());
        System.out.println(b.isSaltWater());

        b.setName("Pacific Ocean");
        b.setlargestDiameter(1500);
        System.out.println(b.name());
        System.out.println(b.largestDiameter());
    }
}
