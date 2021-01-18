package lista_de_datos;
import javax.swing.JOptionPane;
/**
 *
 * @author Noemi
 */
public class Pila {
    
    private Elementos Ultimo_agregado;
    int tamaño=0;
    String Lista = "";
    
    public Pila (){
        Ultimo_agregado=null;
        tamaño=0;
    }
    //Método para conocer si la pila se encuentra vacía
    public boolean pila_vacia(){
        return Ultimo_agregado==null;
    }
    //Método para insertar un nuevo elemento en la pila
    public void insertar_elemento (int elemento){
        Elementos nuevo_elemento = new Elementos (elemento);
        nuevo_elemento.siguiente=Ultimo_agregado;
        Ultimo_agregado=nuevo_elemento;
        tamaño++;   
    }
    //Para eliminar algún elemento de la pila
    public int eliminar_elemento(){
        int auxiliar = Ultimo_agregado.informacion;
        Ultimo_agregado = Ultimo_agregado.siguiente;
        tamaño--;
        return auxiliar;
    }
    //Para conocer el ultimo valor que fue ingresado en la pila
    public int mostrar_ultimo_agregado (){
        return Ultimo_agregado.informacion;
    }
    //Para conocer el tamaño de la pila
    public int tamaño_pila(){
        return tamaño;
    }
    //Método Para vaciar la pila
    public void vaciar_pila(){
        while (!pila_vacia()){
            eliminar_elemento();
        }
    }
    //Método para conocer el contenido de la pila
    public void mostrar(){
        Elementos recorrido = Ultimo_agregado;
        while (recorrido !=null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
