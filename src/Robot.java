public class Robot implements Identifiable {
    private String name;
    private String id;
    private String model;

    public Robot(String name,String id, String model) {
        this.name = name;
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String getId() {
        return null;
    }
}
