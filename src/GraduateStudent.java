public class GraduateStudent extends Student {

    private String researchTopic;

    // Constructor
    public GraduateStudent(
            String name,
            int Studentid,
            double grade,
            String researchTopic
    ) {

        super(name, Studentid, grade);

        this.researchTopic = researchTopic;
    }

    // Method overriding
    @Override
    public void displayInfo() {

        super.displayInfo();   // reuses Student's display code

        System.out.println("Research Topic: "
                + researchTopic);

        System.out.println("Level: Graduate");
    }
}