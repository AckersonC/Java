import java.awt.*;

public class Variables {
    public static void main(String[] args){
        int lightwalt  = 10;
        String lightbrand = "Plilips";
        boolean lightworking = true;
        double lightprice = 13.5;
        char lightrating = 'A';
        char lightlocation = lightbrand.charAt(0);
        System.out.println(lightwalt);
        System.out.println(lightbrand);
        System.out.println(lightworking);
        System.out.println(lightprice);
        System.out.println(lightrating);
        System.out.println(lightlocation);
        System.out.println("This light bulb is" + lightwalt + "walts"+ "The brand of this light bulb is "+ lightbrand + "Is this light working:"+lightworking +"The price of this light bulb is" + lightprice + "The rating of this light is "+lightrating + "This light is manufactured in "+lightlocation );

        }
    }

