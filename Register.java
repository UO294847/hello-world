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
    
     List<T> data;

    /**
     * CONSTRUCTORS
     */
    
    public Register(){
        this.data = new LinkedList<>();    
    }

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
        if(this.data.contains(e)){
            return false;
        }
        else{
            this.data.add(e);
            return true;
        }
    }


    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    

}
