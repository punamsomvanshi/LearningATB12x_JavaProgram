package ex_21_ENUM;

public class Lab194_Enum2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        String k="katalon";
        String k1= URLS.katalon.name();
        if (k.equals(k1)) {
            System.out.println("I want to do somethings");
        }

    }
}

enum URLS {
    google, restassured, katalon, vwo
}
