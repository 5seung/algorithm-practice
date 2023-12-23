import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        
        for(int i = 1; i<=n; i++){
            System.out.println("*".repeat(i));
        }

        //Repeat
        //String 메서드 중 하나로 String 문자열을 파라미터의 주어진 횟수만큼 반복합니다
        //자바11에서 새로 추가된 String 메서드
    }
}