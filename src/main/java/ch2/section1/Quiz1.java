package ch2.section1;

public class Quiz1 {
    public static void main(String[] args) {
        int javaScore = 83;
        int pythonScore = 100;
        int temp = 0;

        System.out.println("[교환 전]");
        System.out.println("javaScore : " + javaScore);
        System.out.println("pythonScore : " + pythonScore);
        System.out.println("---------------------------------");

        temp = javaScore;
        javaScore = pythonScore;
        pythonScore = temp;

        System.out.println("[교환 후]");
        System.out.println("javaScore : " + javaScore);
        System.out.println("pythonScore : " + pythonScore);
    }
}
