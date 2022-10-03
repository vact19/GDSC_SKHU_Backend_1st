package member;

public class Core extends Member{

    private Role role;

    public Core(String name, String studentNo, Part part, Role role) {
        super(name, studentNo, part);
        this.role = role;
    }

    public void getIntoCoreMeeting(){
        System.out.println("코어회의 참석");
    }

    @Override
    public boolean isAccessibleToApplications() {
        return true;
    }
}
