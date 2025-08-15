public class Mascota {
    String nombre;  // Ej: "Rocky"
    int edad;       // Ej: 5
    String especie; // Ej: "perro"

    public void habla() {
        if (this.especie.equalsIgnoreCase("perro")) {
            System.out.println("¡LADRA! xd");
        } else if (this.especie.equalsIgnoreCase("gato")) {
            System.out.println("¡MIAU! xd");
        } else {
            System.out.println("No sé qué sonido hace un " + especie);
        }
    } // <-- Esta llave estaba faltando

    public void identificarse() {
        System.out.println("Mi nombre es " + this.nombre + " y soy un " + this.especie + ".");
        System.out.println("Tengo " + this.edad + " años.");
    }
}
