package part2.ch10.lab10_1;

public class MovieDiscountByGenre {
    public static void main(String[] args) {
        // 다양한 장르의 영화 객체 생성
        ActionMovie am = new ActionMovie("범죄도시");
        HorrorMovie hm = new HorrorMovie("여고괴담");
        ComedyMovie cm = new ComedyMovie("극한직업");
        
        int sum = 0;
        
        // 각 영화의 할인된 가격을 계산하여 총 예매 금액(sum)에 더함
        sum += am.discountedPrice();
        sum += hm.discountedPrice();
        sum += cm.discountedPrice();
        
        // 총 예매 금액 출력
        System.out.printf("총 예매 금액: %d원", sum);
    }
}

// 추상 클래스 Movie 정의
abstract class Movie {
    protected String name;          // 영화 이름
    protected int price = 10000;    // 영화 원래 가격
    protected double discountRate = 0.1;  // 할인율 (10%)

    // 생성자: 영화 이름 설정
    public Movie(String name) {
        this.name = name;
    }

    // 할인된 가격 계산 메서드
    public double discountedPrice() {
        return price * (1 - discountRate);
    }
}

// ActionMovie 클래스: ActionMovie는 Movie 클래스를 상속받음
class ActionMovie extends Movie {
    // 생성자: 영화 이름 설정
    public ActionMovie(String name) {
        super(name);
    }

    // ActionMovie 특화된 할인 가격 계산
    public double discountedPrice() {
        // 최종 가격 = 기존 할인 가격 - 추가 할인 금액 (1000원 할인)
        return super.discountedPrice() - 1000;
    }
}

// HorrorMovie 클래스: HorrorMovie는 Movie 클래스를 상속받음
class HorrorMovie extends Movie {
    // 생성자: 영화 이름 설정
    public HorrorMovie(String name) {
        super(name);
    }

    // HorrorMovie 특화된 할인 가격 계산
    public double discountedPrice() {
        // 최종 가격 = 기존 할인 가격 - 추가 할인 금액 (800원 할인)
        return super.discountedPrice() - 800;
    }
}

// ComedyMovie 클래스: ComedyMovie는 Movie 클래스를 상속받음
class ComedyMovie extends Movie {
    // 생성자: 영화 이름 설정
    public ComedyMovie(String name) {
        super(name);
    }

    // ComedyMovie 특화된 할인 가격 계산
    public double discountedPrice() {
        // 최종 가격 = 기존 할인 가격 - 추가 할인 금액 (1500원 할인)
        return super.discountedPrice() - 1500;
    }
}