package exam01;

public class Test3 {
    public static void main(String[] args) {

        int floor = 9;

        switch (floor) {
            case 1:
                System.out.println(floor + "층 약국");
                break;
            case 2:
                System.out.println(floor + "층 정형 외과");
                break;
            case 3:
                System.out.println(floor + "층 피부과");
                break;
            case 4:
                System.out.println(floor + "층 치과");
                break;
            case 5:
                System.out.println(floor + "층 헬스 클럽");
                break;
            default:
                System.out.println("접근할 수 없는 층입니다.");
        }
    }
}
