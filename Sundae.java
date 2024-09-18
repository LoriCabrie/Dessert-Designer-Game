public class Sundae {
    private String iceCream;
    private String toppingOne;
    private String toppingTwo;
    private String syrup;
    private boolean cherry;

    public Sundae(String iceCream, String toppingOne, String toppingTwo, String syrup, boolean cherry) {
        this.iceCream = iceCream;
        this.toppingOne = toppingOne;
        this.toppingTwo = toppingTwo;
        this.syrup = syrup;
        this.cherry = cherry;
    }

    public String getIceCream() {
        return iceCream;
    }

    public void setIceCream(String iceCream) {
        this.iceCream = iceCream;
    }

    public String getToppingOne() {
        return toppingOne;
    }
public void setToppingOne(String toppingOne) {
    this.toppingOne = toppingOne;
}

public String getToppingTwo() {
    return toppingTwo;
}

public void setToppingTwo(String toppingTwo) {
    this.toppingTwo = toppingTwo;
}

public String getSyrup() {
    return syrup;
}

public void setSyrup(String syrup) {
    this.syrup = syrup;
}

public boolean getCherry() {
    return cherry;
}

public void setCherry(boolean cherry) {
    this.cherry = cherry;
}

@Override
public String toString() {
    String result;
    if (cherry == true) {
        result = "a cherry";
    } else {
        result = "no cherry";
    }
    return "A sundae with " + iceCream + ", " + toppingOne + ", " + toppingTwo + ", " + syrup + ", and " + result + ".";
}

