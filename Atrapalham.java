public class Atrapalham {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String texto = "Java";
            for (int j = 1; j < i; j++) {
                texto += " atrapalham";
            }
            texto += " muita gente";
            System.out.println(i + " " + texto);
        }
    }
}

