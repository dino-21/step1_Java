package part2.ch11.lab11_1;

package ch11;

public class GameSimulation {
    public static void main(String[] args) {
        // 다양한 종류의 기사(Knight) 객체 생성
        Knight atomic = new Knight("아토믹");
        Knight uther = new HolyKnight("우서");
        Knight genji = new MagicKnight("겐지");
        
        // 각 기사가 공격을 수행
        atomic.slash();
        uther.slash();
        genji.slash();
        
        System.out.println("----------");
        
        // uther 기사가 Healer 인터페이스를 구현한 경우
        Healer healer = (uther instanceof Healer) ? (HolyKnight) uther : null;
        if (healer != null) {
            healer.heal();      // 치유
            healer.recovery();  // 회복
        }
        
        System.out.println("----------");
        
        // genji 기사가 Magician 인터페이스를 구현한 경우
        Magician magician = (genji instanceof Magician) ? (MagicKnight) genji : null;
        if (magician != null) {
            magician.magicShield();  // 마법 방패
            magician.teleport();     // 순간이동
        }
    }
}

// Healer 인터페이스 정의
interface Healer {
    void heal();      // 치유
    void recovery();  // 회복
}

// Magician 인터페이스 정의
interface Magician {
    void magicShield();  // 마법 방패
    void teleport();     // 순간이동
}

// 기사(Knight) 클래스 정의
class Knight {
    protected String name;
    protected int hp = 100;  // 체력

    public Knight(String name) {
        this.name = name;
    }

    public void slash() {
        System.out.printf("[%s]의 일반 베기 공격!\n", name);
    }
}

// HolyKnight 클래스: 기사(Knight)를 상속하고 Healer 인터페이스를 구현한 클래스
class HolyKnight extends Knight implements Healer {
    protected int dp = 100; // 신력

    public HolyKnight(String name) {
        super(name);
    }

    public void heal() {
        System.out.printf("[%s]의 체력이 가득 찹니다.\n", name);
    }

    public void recovery() {
        System.out.printf("[%s]의 체력 회복력이 증가합니다.\n", name);
    }

    // HolyKnight의 slash() 메서드 재정의
    public void slash() {
        System.out.printf("[%s]의 신성력이 깃든 베기 공격!!!\n", name);
    }
}

// MagicKnight 클래스: 기사(Knight)를 상속하고 Magician 인터페이스를 구현한 클래스
class MagicKnight extends Knight implements Magician {
    protected int mp = 100; // 마력

    public MagicKnight(String name) {
        super(name);
    }

    public void magicShield() {
        System.out.printf("[%s]가 모든 공격을 튕겨냅니다.\n", name);
    }

    public void teleport() {
        System.out.printf("[%s]가 순간이동을 시전합니다.\n", name);
    }

    // MagicKnight의 slash() 메서드 재정의
    public void slash() {
        System.out.printf("[%s]의 마력이 깃든 베기 공격!!!\n", name);
    }
}