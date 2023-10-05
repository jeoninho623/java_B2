public class Q2 {
    public static void main(String[] args) {
        double buildingDistance = 20.0;
        double humanEyeHeight = 15.0;
        double angle = 60.0;

        double angleInRadian = Math.toRadians(angle);
        double buildingHeight = buildingDistance * Math.tan(angleInRadian);
        double realHeight = buildingHeight + humanEyeHeight;

        System.out.printf("건물의 높이는 %.2fM입니다", realHeight);
    }
}
