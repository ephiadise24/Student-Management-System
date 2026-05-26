public class GraduateStudent extends Student {

    private String researchTopic;

    // Constructor
    public GraduateStudent(
            String name,
            int id,
            double grade,
            String researchTopic
    ) {

        super(name, id, grade);

        this.researchTopic = researchTopic;
    }

    // Method overriding
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Research Topic: "
                + researchTopic);

        System.out.println("Level: Graduate");
    }
}