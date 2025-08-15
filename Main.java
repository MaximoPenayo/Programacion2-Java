public class Main { 
    public static void main(String[] args) {
        Mascota firulais = new Mascota();
        firulais.nombre = "Juan";
        firulais.especie = "perro";
        firulais.edad = 11;

        firulais.identificarse();
        firulais.habla();
    }
}
