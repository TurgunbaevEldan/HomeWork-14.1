public class Horse extends Animal {
    private int age;
    private String breed;

    public Horse(String name, int age, String breed) {
        super(name);
        this.age = age;
        this.breed = breed;
    }
        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public String getBreed () {
            return breed;
        }

        public void setBreed (String breed){
            this.breed = breed;
        }

    @Override
    public void eat() {
        System.out.println("eating clear...");
    }

    public void sleep(){
        System.out.println("sleeping...");
    }
    public void drink(){
        System.out.println("drinking water...");
    }

    @Override
    public String toString() {
        return super.toString()  + " age: " + age + " breed: " + breed;
    }
}

