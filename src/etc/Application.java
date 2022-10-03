package etc;

import member.Member;

// GDSC 지원서 정보를 담는 클래스
public class Application {

    private String applicant; // 지원자
    private String content; // 서류 본문

    public Application(String applicant, String content) {
        this.applicant = applicant;
        this.content = content;
    }

    /**
     파라미터를 Member 타입으로 받고 있기 때문에,
     [Core, General] 이 아니라 다른 멤버타입(Lead 등)이 추가된다고 해도
     Member 클래스를 상속하기만 하면 해당 메소드 파라미터로 넣을 수 있다.
     */
    public String getApplicant(Member member) {
        if(member.isAccessibleToApplications() == true){
            return applicant;
        }
        throw new IllegalArgumentException("권한이 없어요");
    }

    public String getContent(Member member) {
        if(member.isAccessibleToApplications() == true){
            return content;
        }
        throw new IllegalArgumentException("권한이 없어요");
    }

}
