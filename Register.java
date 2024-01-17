import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/*
 * Collection that stores elements in a linked-list. No repeated elements are allowed. They dont have to be ordered. List could be modified
*/
public class Register<T> extends AbstractCollection<T>{
    
    /**
     * DATA AREA
     */
    
    private List<T> data;

    /**
     * CONSTRUCTORS
     */
    
    /**
     * Creates a Linked-List were the elements of the register are stored
     */
    public Register(){
        this.data = new LinkedList<>();    
    }

    /**
     * Uses another collection that follows the type T and we add each element to the register
     * There cannot be any repeated elements
     * @param c -> The copy collection
     */
    public Register(Collection<? extends T> c){
        this();
        for(T element : c){
            if(!this.data.contains(element)) this.data.add(element);
        }
    }

    /**
     * METHODS
     */

    @Override
    public boolean add(T e){
        if(this.data.isEmpty()){
            this.data.add(e);
            return true;
        }
        else{
            if(this.data.contains(e)){
                return false;
            }
            else{
                this.data.add(e);
                return true;
            }
        }
    }


    @Override
    public Iterator<T> iterator() {
        return this.data.iterator();
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public String toString(){
        String list = new String();
        for(T element : this.data){
            list = list + element.toString() + "\n";
        }
        return list;
    }

    

}
