package member;

/**
 *  isAccessibleToApplications() 추상 메소드의 구현 강제와
 *  인스턴스 생성을 막기 위해 (new Member())
 *  추상 클래스로 생성함.
 */
public abstract class Member {

    private String name;    // 이름
    private String studentNo;   // 학번
    private Part part;  //  파트

    public abstract boolean isAccessibleToApplications();

    public Member(String name, String studentNo, Part part) {
        // 빈 이름을 넣지 못하도록 검사한다.
        if(name == null || name.length() < 1){
            throw new IllegalArgumentException("이름 넣어서 보내세요");
        }
        this.name = name;
        this.studentNo = studentNo;
        this.part = part;
    }

    public Part getPart() {
        return part;
    }

    public String getName() {
        return name;
    }

    public String getStudentNo() {
        return studentNo;
    }

}
