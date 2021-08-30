public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = "Sharon Shih";
        myAge = 17;      // not a lie
        myHeight = 163;  // inches
        myWeight = 49;   // lbs
        myEyes = "Red";
        myTeeth = "White";
        myHair = "Purple";

        System.out.println( "Let's talk about " + myName + "." );
        System.out.println( "She's " + myHeight + " inches tall." );
        System.out.println( "She's " + myWeight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "She's got " + myEyes + " eyes and " + myHair + " hair." );
        System.out.println( "Her teeth are usually " + myTeeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
            + " I get " + (myAge + myHeight + myWeight) + "." );
    }
}
