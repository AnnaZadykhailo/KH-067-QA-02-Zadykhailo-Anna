package universitygroup;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public String getGroupName() {
        return this.groupName;
    }

    public int getStartYear(){
        return this.startYear;
    }
    public int getEndYear(){
        return this.endYear;
    }
    public String[] getStudentArray(){
        return this.studentArray;
    }

    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        this.endYear = startYear + 5;
    }

    public void addStudents(String[] array) {
        if (getStudentArray() == null) {
            studentArray = array;
        }
    }

    public void getGroupDescription() {
        System.out.println("group name = " + getGroupName());
        System.out.println("start year = " + getStartYear());
        System.out.println("end year = " + getEndYear());
        System.out.println("Students: ");
        for (String s : getStudentArray()) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup1 = new UniversityGroup("Group One", 2019);
        UniversityGroup universityGroup2 = new UniversityGroup("Group Two", 2021, null);

        String[] studentArray = new String[] {"Ivanov", "Petrova", "Blinkin"};
        universityGroup1.addStudents(studentArray);
        universityGroup2.addStudents(studentArray);

        universityGroup1.getGroupDescription();
        universityGroup2.getGroupDescription();
    }
}
