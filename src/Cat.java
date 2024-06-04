class Cat extends Animal{
    private String color;
    private String customInfo;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        customInfo = "none";
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    String getInfo() {
        return "Cat name: "+getName()+", Cat age: "+getAge()+", Cat color: "+getColor()+", Cat custom info: "+getCustomInfo();
    }

    @Override
    String customizeInfo(String customInfo) {
        this.customInfo = customInfo;
        return customInfo;
    }
}
