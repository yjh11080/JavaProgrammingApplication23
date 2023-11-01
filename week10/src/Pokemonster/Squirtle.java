package Pokemonster;

import fly.Flyable;

import java.util.ArrayList;

public class Squirtle extends Pokemon{
    public Squirtle(Flyable f) {
        super();  // 부모 클래스의 기본 생성자 호출 (생략 가능)
        System.out.println("꼬북꼬북..");
        //this.setLevel(1);
        this.level = 1;
        //this.attackRate = 48;  // 0단계 진화 포켓몬스터의 경우 최대 공격력과 최소 공격력의 차를 3으로 두고 랜덤 추출
        this.attackRate = (int)(Math.random() * 4) + 45;  // 45 ~ 48
        this.defenceRate = 65;
        this.setHp(44);
        this.name = "꼬부기";
        this.flyable = f; // Association, has-a (Aggregation)
//        this.skills = new String[]{"물대포", "고속스핀", "물의파동"};
//        this.specialAttackRate = new int[]{40, 50, 60};
        this.skills = new ArrayList<>();
        this.skills.add("물대포");
        this.skills.add("고속스핀");
        this.skills.add("물의파동");

        this.specialAttackRate = new ArrayList<>();
        this.specialAttackRate.add(40);
        this.specialAttackRate.add(50);
        this.specialAttackRate.add(60);
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}