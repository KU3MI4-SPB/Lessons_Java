package Lesson_2;

public class Ex001_stringsDemo {
    public static void main_(String[] args) {
        String[] name = { "А", "л", "е", "к", "с", "а", "н", "д", "р" };
        String sk = "АЛЕКСАНДР К.";
        System.out.println(sk.toLowerCase());
        System.out.println(String.join("", name)); 
        System.out.println(String.join("", "А", "л", "е", "к", "с", "а", "н", "д", "р"));
        System.out.println(String.join(",", "А", "л", "е", "к", "с", "а", "н", "д", "р"));
    }
}
