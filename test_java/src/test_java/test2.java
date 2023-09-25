package test_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("테스트 케이스 개수를 입력하세요: ");
        int testCaseCount = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        String[] testCases = new String[testCaseCount];

        // 사용자로부터 테스트 케이스 입력 받기
        for (int i = 0; i < testCaseCount; i++) {
            System.out.print("테스트 케이스 #" + (i + 1) + ": ");
            testCases[i] = scanner.nextLine();
        }

        scanner.close();

        for (String s : testCases) {
            List<String> substrings = solution(s);

            // 결과 출력
            System.out.println(s + " => " + substrings.size() + "개의 문자열로 분해됩니다.");
            System.out.println("분해된 문자열:");
            for (String substring : substrings) {
                System.out.println(substring);
            }
        }
    }

    // 주어진 문자열을 분해하여 리스트로 반환하는 함수
    public static List<String> solution(String s) {
        List<String> substrings = new ArrayList<>();
        int currentIndex = 0;

        while (currentIndex < s.length()) {
            char x = s.charAt(currentIndex);
            int xCount = 0;
            int otherCount = 0;
            int startIndex = currentIndex;

            // 주어진 규칙에 따라 문자열을 분해
            while (currentIndex < s.length() && (xCount == 0 || xCount != otherCount)) {
                char currentChar = s.charAt(currentIndex);
                if (currentChar == x) {
                    xCount++;
                } else {
                    otherCount++;
                }
                currentIndex++;
            }

            // 분해된 문자열 리스트에 추가
            if (xCount == otherCount) {
                substrings.add(s.substring(startIndex, currentIndex));
            }
        }

        return substrings;
    }
}
/**
 *  처음에는 문제를 이해하는데에 시간이 좀 걸렸지만 구글링 통해 문제를 이해하고
 *  주어진 문자열을 주어진 규칙에 맞춰 분해하여 리스트로 반환하는 함수를 만들어
 *  메인 함수에 적용하는게 생각보다 흥미로웠습니다.
 */