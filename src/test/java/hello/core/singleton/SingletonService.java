package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();
    // 조회
    public static SingletonService getInstance(){
        return instance;
    }

    // private 생성자로 생성되는 것을 막음
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

    public static void main(String[] args) {

    }
}
