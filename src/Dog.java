class Dog extends Animal{
    private String breed;
    private String customInfo;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        customInfo = "none";
    }

    public String getBreed() {
        return breed;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    @Override
    String getInfo() {
        return "Dog name: "+getName()+", Dog age: "+getAge()+", Dog breed: "+getBreed()+", Dog custom info: "+getCustomInfo();
    }

    @Override
    String customizeInfo(String customInfo) {
        this.customInfo = customInfo;
        return customInfo;
    }
}
