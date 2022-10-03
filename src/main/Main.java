package main;

import etc.Application;
import member.*;

public class Main {

    public static void main(String[] args) {
        // 코어 멤버 생성
        Core core = new Core("조성우", "202014148",  Part.BACKEND, Role.CLERK);

        // 이름 비워서 보내면 오류. (캡슐화)
        //Core core = new Core("", "202014148",  Part.BACKEND, Role.CLERK);
        core.getIntoCoreMeeting();

        //코어 멤버 정보 출력
        System.out.println("코어 이름 : " + core.getName() + ", 파트는 : " + core.getPart());

        // 일반 멤버 생성
        General general = new General("김강민", "202014141",  Part.BACKEND);

        // 일반 멤버 정보 출력
        System.out.println("일반멤버 이름 : " + general.getName() + ", 파트는 : " + general.getPart());

        // 지원서 생성
        Application application = new Application("지원자", "저는엄격한아버지와따뜻한어머니밑에서자라");

        // 코어가 지원서에 접근
        System.out.println(application.getApplicant(core));
        System.out.println(application.getContent(core));

        // 일반 멤버 두 명 생성
        General general1 = new General("김강민", "202014141",  Part.BACKEND);
        General general2 = new General("김강민", "202014141",  Part.BACKEND);
        /**
        똑같은 클래스를 기반으로 똑같은 데이터를 넣어 만든 인스턴스이지만,
         힙 영역에 별개의 인스턴스가 생성되었으므로
         == 비교 혹은 general1.equals(general2) 로 비교하면 false가 나온다.

         내부 값만을 비교하려면 Obejct.equals를 재정의
         */
        System.out.println(general1 == general2);


        // 일반멤버가 지원서에 접근. Exception 발생
//        System.out.println(application.getApplicant(general)); // 권한 없음
//        System.out.println(application.getContent(general));
    }
}
