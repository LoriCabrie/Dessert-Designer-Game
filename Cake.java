public class Cake {
    private String flavor;
    private String icing;
    private String sprinkles;
    private boolean candles;

    public Cake(String flavor, String icing, String sprinkles, boolean candles) {
        this.flavor = flavor;
        this.icing = icing;
        this.sprinkles = sprinkles;
        this.candles = candles;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }
public String getSprinkles() {
    return sprinkles;
}

public void setSprinkles(String sprinkles) {
    this.sprinkles = sprinkles;
}

public boolean getCandles() {
    return candles;
}

public void setCandles(boolean candles) {
    this.candles = candles;
}

@Override
public String toString() {
    String result;
    if (candles == true) {
        result = "candles";
    } else {
        result = "no candles";
    }
    return "A " + flavor + " cake with " + icing + ", " + sprinkles + " sprinkles, " + " and " + result + "\n";
}

