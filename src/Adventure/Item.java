package Adventure;

public class Item
{
    private String Name;
    private Double Price;
    private Boolean MadeinEgypt;
    private String Color;

    public Item(String name, Double price, Boolean madeinEgypt, String color) {
        Name = name;
        Price = price;
        MadeinEgypt = madeinEgypt;
        Color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Boolean getMadeinEgypt() {
        return MadeinEgypt;
    }

    public void setMadeinEgypt(Boolean madeinEgypt) {
        MadeinEgypt = madeinEgypt;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String toString(){
        System.out.printf("%s %.2f %s %S\n",getName(),getPrice(),
                (getMadeinEgypt() == true ? "made in Egypt": "not made in Egypt"),getColor());
        return null;
    }
}
