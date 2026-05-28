public class GraduateStudent extends Student {

    private String researchTopic;

    // Constructor
    public GraduateStudent(
            String name,
            String id,
            double grade,
            String researchTopic
    ) {
        super(name, id, grade);
        this.researchTopic = researchTopic;
    }

    // Getter and Setter
    public String getResearchTopic() { return researchTopic; }
    public void setResearchTopic(String researchTopic) { this.researchTopic = researchTopic; }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic : " + researchTopic);
        System.out.println("Level          : Graduate");
    }
}