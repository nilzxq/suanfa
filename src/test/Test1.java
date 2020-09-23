package test;

/**
 * @Author nilzxq
 * @Date 2020-09-23 18:36
 */
public class Test1 {
    public static void main(String[] args) {
        Fish fish = new Fish(5);
        Chizi chizi = new Chizi(fish);
        chizi.put(5);
        System.out.println(fish.weight);
    }
}
    class Chizi{
        private Fish fish;

        public Chizi(Fish fish) {
            this.fish = fish;
        }

        public Fish getFish() {
            return fish;
        }

        public void setFish(Fish fish) {
            this.fish = fish;
        }

        public void put(int w){
            fish.weight+=w;
        }
    }



class Fish {
    int weight;

    public Fish(int weight){
        weight =weight;
    }

}
