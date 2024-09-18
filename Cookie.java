public class Cookie {
    private String flavor;
    private String add_ins;
    private String icing;

    public Cookie(String flavor, String add_ins, String icing) {
        this.flavor = flavor;
        this.add_ins = add_ins;
        this.icing = icing;
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

    public String getAdd_ins() {
        return add_ins;
    }

    @Override
    public String toString() {
        return "A " + flavor + " cookie with " + add_ins + " and " + icing + " icing \n";
    }
}
