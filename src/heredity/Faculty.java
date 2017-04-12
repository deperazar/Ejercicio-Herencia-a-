
package heredity;
    
    //DANIEL EDUARDO PERAZA RIVERA
    //UNIVERSIDAD NACIONAL DE COLOMBIA



    //Como se puede observar, la clase "Faculty" hereda de "Employee", la cual hereda de 
    //la clase "Person". Al crear un objeto tipo "Faculty", se recurre a la clase de la que
    //inmediatamente hereda, es decir Employee. Esta a su vez recurre a la clase que de la
    //que hereda, Person. Teniendo en cuenta en cierto modo que los objetos Faculty son una
    //modificacion de objetos Employee, y estos son una modificación de los objetos Person,
    //Al crear un objeto Faculty, se esta creando un objeto a partir de Employee y remotamente
    //apartir de Person; por lo que tiene sentido pensar que se ejecutan los constructores
    //de las clases de las que se hereda. En este orden de ideas, es posible comprender que
    //el constructor de la clase Person se ejecute primero, ya que es donde el objeto se 
    //crea inicialmente (Se dota al objeto con las carácteristicas de la clase Person);
    // que luego se ejecute el constructor de la clase Employee(Se dota al objeto con las carácteristicas de la clase Employee),
    // y finalmente el de la clase Faculty (Se dota al objeto con las carácteristicas de la clase Faculty).

    //Teniendo en cuenta lo anterior mencionado, en el constructor de la clase Person se
    //invoca una sentencia de impresion con la frase "Perform Person's tasks", que corresponde
    //a la primera línea de salida que será visualizada. 
    
    //Ahora se recurre a la clase Employee. Como se puede observar, ésta posee dos constructores;
    //como ya es sabido, una clase puede tener uno o más constructores. Generalmente estos
    //se diferencian en el número o tipo de parámetros que reciben, en este caso
    //uno de los constructores recibe un parámetro de tipo String llamado s, mientras que el
    //otro no recibe ningún parámetro, pero recurre a este mediante el uso del método this(). Este
    //método invoca a un constructor que soporte los paramétros que se transmiten en el método.
    //En el caso de Employee, el constructor con el método this() está proporcionando el parámetro 
    //requerido ("Invoke Employee's) para la implementación del otro constructor, que recibe un parámetro tipo String.
    //Inmediatamente se ejecuta constructor que recibe el parámetro String s, imprimiendo la segunda línea
    //de salida, que corresponde al valor del parámetro recibido, "Invoke Employee's".Una vez ejecutado el
    //constructor invocado, se ejecuta lo que resta del constructor invocador
    //por lo que la tercera línea de salida corresponde a "Perform Employee's tasks".
    
    //Finalmente se ejecuta el constructor de la clase Faculty, visualizando así, la cuarta
    // y última línea de salida. Esta línea corresponde a "Perform Faculty's tasks".
    //


public class Faculty extends Employee {                                         
    public static void main(String[] args) {
        new Faculty();
    }
    
    public Faculty(){
        System.out.println("Perform Faculty's tasks");
    }
}
class Employee extends Person{
    public Employee(){
        this("Invoke Employees's ");
        System.out.println("Perform Employee's tasks");
    }
    
    public Employee(String s){
        System.out.println(s);
    }
}
class Person{
    public Person(){
        System.out.println("Perform Person's tasks");
    }
}
