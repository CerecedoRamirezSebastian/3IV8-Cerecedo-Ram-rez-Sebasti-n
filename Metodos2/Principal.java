/*Usando herencia, se crean tres clases las cuales indican los datos del libro y sus existencias; después, se imprimen sus datos.
Después se invoca al método donde puede realizarse el préstamo del único libro disponible co el nombre de "Un casco para mi almohada" de Eugine Sledge.
En dicha clase, se presentará la opción de tomar el libro y huir o tomar el libro y llevarse otro adicional; no obstante, las políticas de esta
biblioteca virtual no permiten llevar más de un libro a la vez, por lo que siempre será imposible llevarse otro libro aparte del de "Un casco para mi almohada".
*/

public class Principal{
    public void Libreria(){
    Prestar mePrestar = new Prestar();
    Perro dog = new Perro("El ingenioso hidalgo Don Quijote de La Mancha", "De Cervantes Saavedra, M.", 0, 0, "No hay ejemplares disponibles.");
    Gato cat = new Gato("Guerra y paz", "Tolst\u00f3i, L.", 0, 0, "No hay ejemplares disponibles.");
    Sledge maestro = new Sledge("Un caso para mi almohada", "Sledge, e.", 1, 0, "El mejor libro de todo el mundo.");

    dog.mostrarPerro();
    cat.mostrarGato();
    maestro.mostrarJordi();
    mePrestar.Prestado();
    }
}
