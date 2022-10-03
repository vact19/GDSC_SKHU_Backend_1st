package member;

public class General extends Member{

    public General(String name, String studentNo, Part part) {
        super(name, studentNo, part);
    }

    @Override
    public boolean isAccessibleToApplications() {
        return false;
    }
}
