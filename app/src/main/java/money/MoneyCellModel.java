package money;

public class MoneyCellModel {
    private String name;
    private String value;
    private Integer color;

    public MoneyCellModel(String name, String value, Integer color) {
        this.name = name;
        this.value = value;
        this.color = color;
    }

    public MoneyCellModel (int position) {
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public Integer getColor() {
        return color;


    }
}
