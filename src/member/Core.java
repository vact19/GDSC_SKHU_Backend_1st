package member;

public class Core extends Member{

    // 코어가 GDSC에서 맡은 역할
    private Role role;

    // 생성자
    // General 클래스와 달리, Role 필드가 추가되어서 Role 파라미터를 추가로 받음.
    public Core(String name, String studentNo, Part part, Role role) {
        super(name, studentNo, part);
        this.role = role;
    }

    public void getIntoCoreMeeting(){
        System.out.println("코어회의 참석");
    }

    // 코어는 지원서(Application)를 조회할 수 있다.
    @Override
    public boolean isAccessibleToApplications() {
        return true;
    }
}
