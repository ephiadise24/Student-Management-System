 // inherit everything from student
public class GraduateStudent extends Student {

    private String researchTopic; // unique to graduate because of the research topic

    // Constructor
    public GraduateStudent(
            String name,
            String id,
            double grade,
            String researchTopic
    ) {
        super(name, id, grade); // passes the 3 shared firelds from students
        this.researchTopic = researchTopic; // unique saves the research topic
    }

    // Getter and Setter
    public String getResearchTopic() { return researchTopic; }
    public void setResearchTopic(String researchTopic) { this.researchTopic = researchTopic; } // ONLY GRADUATE HAS THIS

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo(); // first then adds Research topic and level graduate and it is unique because this 2 print lines o ly belong to graduate
        System.out.println("Research Topic : " + researchTopic);
        System.out.println("Level          : Graduate");
    }
}