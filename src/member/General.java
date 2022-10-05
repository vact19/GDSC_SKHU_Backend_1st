package member;

public class General extends Member{

    // 생성자
    // 현재 클래스 General에는 초기화할만한 필드가 없으므로, 상위 클래스의 생성자만 부르고 끝냄.
    public General(String name, String studentNo, Part part) {
        super(name, studentNo, part);
    }

    // 추상 클래스 Member에 의해 구현이 강제된 추상 메소드.
    @Override
    public boolean isAccessibleToApplications() {
        return false;
    }
}
