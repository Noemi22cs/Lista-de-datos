package lista_de_datos;
import javax.swing.JOptionPane;
/**
 *
 * @author Noemi
 */
public class Lista_de_datos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu=0, elemento=0;
        Pila Pila = new Pila();
      
        do{
            try{
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Elige alguna opción \n\n"
                        + "1. Insertar un elemento nuevo\n"
                        + "2. Eliminar un elemento de la pila\n"
                        + "3. Conocer si la pila está vacía\n"
                        + "4. Conocer el ultimo elemento ingresado en la pila\n"
                        + "5. Conocer la cantidad de elemento que contiene la pila\n"
                        + "6. Vaciar los elementos de la pila\n"
                        + "7. Mostrar todos los elementos que contiene la pila\n"
                        + "8. Abandonar\n"));  
                switch (menu){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Escriba el valor del elemento que desea guardar en la pila"));
                        Pila.insertar_elemento(elemento);
                        break;
                    case 2:
                        if(!Pila.pila_vacia()){
                            JOptionPane.showMessageDialog(null, "Se ha eliminado el siguiente elemento: "
                            + Pila.eliminar_elemento());
                        }else{
                            JOptionPane.showMessageDialog(null, "Pila vacía");
                        }
                        break;
                    case 3:
                        if(Pila.pila_vacia()){
                        JOptionPane.showMessageDialog(null, "Pila vacía");   
                        }else{
                        JOptionPane.showMessageDialog(null, "Pila no vacía");   
                        }
                        break;
                    case 4:
                        if(!Pila.pila_vacia()){
                        JOptionPane.showMessageDialog(null, "El último elemento ingresado en la pila es: "
                        + Pila.mostrar_ultimo_agregado()); 
                        }else{
                        JOptionPane.showMessageDialog(null, "Pila vacía"); 
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene: " + Pila.tamaño_pila() + " elementos");
                        break;
                    case 6:
                        if(!Pila.pila_vacia()){
                           Pila.vaciar_pila();
                           JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        }else{
                           JOptionPane.showMessageDialog(null, "Pila vacía"); 
                        }
                        break;
                    case 7:
                        Pila.mostrar();
                        break;
                    case 8:
                        menu = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción que eligió no existe, intente nuevamente");
                        break;
                }
            }catch(NumberFormatException e){
                
            }
        }while(menu != 8);
    }
    
}
