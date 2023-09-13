package version08;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println(Pokemon.getPokemonCount());
        Pokemon squirtle = new Pokemon("꼬부기", 1);
        Pokemon pikachu = new Pokemon("피카츄");
        System.out.println(Pokemon.getPokemonCount());
        Pokemon charizard = new Pokemon();
        //System.out.println(Pokemon.pokemonCount);
        System.out.println(Pokemon.getPokemonCount());

        System.out.println(pikachu.getName()
                + "의 체력은 " + pikachu.getHp()
                + "이고 레벨은 " + pikachu.getLevel()
                + "입니다");

        squirtle.evolve(squirtle);
        System.out.println(squirtle.getName());
        squirtle.evolve(squirtle);

//        pikachu.name = "피카츄";
//        charizard.name = "리자몽";

        charizard.setName("리자몽");

//        pikachu.setLevel(23);
//        pikachu.setHp(500);
        pikachu.setLevel(23).setHp(500);  // method chaining.


        charizard.setLevel(36);

        System.out.println(charizard.getName() + "의 체력은 " + charizard.getHp() + "이고 레벨은 " + charizard.getLevel() + "입니다");
        charizard.evolve(charizard);
        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
        pikachu.setName("라이츄");
        System.out.println(pikachu.getName());
        pikachu.evolve(pikachu);

        System.out.println(pikachu.getName()
                + "의 체력은 " + pikachu.getHp()
                + "이고 레벨은 " + pikachu.getLevel()
                + "입니다");

        charizard.attack(squirtle);
        squirtle.attack();
    }
}
