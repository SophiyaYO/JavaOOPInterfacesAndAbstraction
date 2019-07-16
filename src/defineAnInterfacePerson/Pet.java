package defineAnInterfacePerson;

public class Pet {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }
}
