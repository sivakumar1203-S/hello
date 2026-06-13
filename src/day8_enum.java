public class day8_enum {
    enum Language{
        EN("English"),
        GR("German"),
        JP("Japan"),
        TA("Tamil");
        String description;
        Language(String description){
            this.description = description;
        }
    }
    static void main() {
        System.out.println(Language.GR.description);
        System.out.println(Language.EN.description);
        System.out.println(Language.JP.description);
        System.out.println(Language.TA.description);
    }
}  