package org.example;

public class OopsConcepts extends SuperClass {
    private static final OopsConcepts oopsObject = new OopsConcepts();

    private OopsConcepts() {
    }

    public static OopsConcepts getOopObject() {
        return oopsObject;
    }

    private void getAnimalInfo(String animalName) {
        super.getInformation(animalName);
    }

    public void cat() {
        this.getAnimalInfo("cat");
    }

    public void dog() {
        this.getAnimalInfo("dog");
    }

    public static void main(String[] args) {
        OopsConcepts obj = getOopObject();
        obj.cat();
        obj.dog();
    }
}