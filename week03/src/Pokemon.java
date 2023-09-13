package version09;

import java.util.Objects;

public class Pokemon {
    // fields, 멤버 변수, 속성
    // 캡슐화
    private String name;
    private int level;
    private int hp;
    // static member variable (정적 멤버 변수, 클래스 멤버 변수)
    //static int pokemonCount = 0; // 인스턴스(객체) 생성없이 클래스명.형태로 사용 가능
    private static int pokemonCount = 0;


    // constructor, 생성자(특수 형태의 메서드)
    // 리턴타입이 없으며 클래스의 이름과 같다
    Pokemon(){
        System.out.println("포켓몬 객체 생성(기본 생성자)!");
        this.hp = 100;
        pokemonCount++;
    }

    // constructor overloading
    // 생성자 오버로딩
    Pokemon(String name){
        //this(name, 1); // 항상 생성자 첫 번째 줄에 있어야 함
        System.out.println("포켓몬 객체 생성(매개변수 1개 생성자)!");
        this.name = name;
        this.level = 1;
        this.hp = 100;
        pokemonCount++;
    }
    Pokemon(String name, int level) {
        System.out.println("포켓몬 객체 생성(매개변수 2개 생성자)!");
        this.name = name;
        this.level = level;
        this.hp = 100;
        pokemonCount++;
    }

    // alt+insert

    public static int getPokemonCount() {
        return pokemonCount;
    }

    public String getName() {
        return name;
    }
    // 실행된다. 하지만 매개변수 n은 여러 의미를 가질 수 있으므로
    // n보다는 명확한 의미의 name을 사용해야 한다
//    public void setName(String n) {
//        this.name = n;
//    }
    public void setName(String name) {
        //name = name;
        // this는 실행시점의 객체 메모리 번지 주소를 의미한다.
        this.name = name;   // this 키워드를 사용하므로써 매개변수와 멤버변수(필드)를 구분할 수 있다.
    }

    public int getLevel() {
        return level;
    }

//    public void setLevel(int level) {
//        this.level = level;
//    }

    public Pokemon setLevel(int level) {
        // 리턴타입 void -> Pokemon
        this.level = level;
        return this;  // 실행 시점의 포켓몬 객체를 리턴
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // methods, 멤버 함수, 행위
    void evolve(Pokemon pokemon){
        pokemon.level = pokemon.level + 1;
        // escape sequence를 이용한 출력 형태 조정
        //System.out.println("\t" + pokemon.name + "의 레벨이\n\t" + pokemon.level + "으로 증가!");

        // jdk15부터 지원하는 Text block과 replace 메서드(메서드 체이닝 기법) 사용
        String texts = """
                    name의 레벨이
                    level으로 증가!
                """.replace("level", pokemon.level + "")
                .replace("name", pokemon.name);
        System.out.println(texts);
    }
    void attack(){
        System.out.println(this.name + "이(가) 광역 도발 공격을 시전합니다");
    }
    // method overloading
    // 메서드 오버로딩
    void attack(Pokemon pokemon){
        System.out.println(this.name + "이(가) " + pokemon.name + "에게 공격합니다");
    }
}