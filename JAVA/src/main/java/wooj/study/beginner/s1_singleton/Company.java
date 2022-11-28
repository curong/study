package wooj.study.beginner.s1_singleton;

public class Company {

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }

        return instance;
    }

    private static Company instance  = new Company();

    private Company() { }

}
