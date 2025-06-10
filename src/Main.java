class Person {
    String name; // 필드 (클래스의 변수)
    int age;
    String MBTI;

    public void sayHello() {
        System.out.println("안녕하세요? 저는 " + name + "입니다. 저의 나이는 " + age + "세입니다. " + "그리고 저의 MBTI는 " +  MBTI + "입니다.");
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person(); // Is called 객체, 인스턴스

        person.name = "정해욱";
        person.age = 30;
        person.MBTI = "ISTP";

        person.sayHello();
    }
}