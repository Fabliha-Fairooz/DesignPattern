package PrototypePattern;

public class DroneScientist {
    public enum Gender {
        MALE,
        FEMALE
    }
    public String name;
    public Gender gender;
    public int age;
    public float height;

    public DroneScientist(int age, String name, Gender gender, float height) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    public DroneScientist() {
    }

    public DroneScientist clone(DroneScientist objectToBeCopied) {
        DroneScientist copyObject = new DroneScientist();
        copyObject.height = objectToBeCopied.height;
        copyObject.age = objectToBeCopied.age;
        copyObject.gender = objectToBeCopied.gender;
        copyObject.name = objectToBeCopied.name;
        return copyObject;
    }
}