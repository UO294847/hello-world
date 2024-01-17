import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



//
public class School extends Register<Student>{
    
    /*
     * Data area
     */

    private List<Student> data; 
    String schoolName;
    /*
     * Constructors
     */

    public School(){
        this("School");
    }

    public School(String name){
        this.data = new CopyOnWriteArrayList<Student>(); //Had to use this class instead of a regular LinkedList
        this.schoolName = name;
    }

    public School(Collection<? extends Student> c){
        this(c,"School");
    }

    public School(Collection<? extends Student> c, String name){
        this(name);
        for(Student element : c){
            if(this.data.isEmpty()){this.data.add(element);}
            else{
                if(!this.data.contains(element)){
                    for(Student s : this.data){
                        if(!s.getName().equals(element.getName()) && !s.getID().equals(element.getID())){
                            this.data.add(element);
                        }
                    }
                }
            }
        }
    }


    

    /*
     * Methods
     */
    
    @Override
    public boolean add(Student e){
        if(this.data.isEmpty()){
            this.data.add(e);
            return true;
        }
        else{
            if(this.data.contains(e)){
                return false;
            }
            else{
                for(Student s: this.data){
                    if(s.getName()==e.getName() || s.getID()==e.getID())return false;             
                }
                this.data.add(e);
                return true;
            }
        }
    }

    @Override
    public String toString(){
        String s = this.schoolName + "'s students:\n\t";
        for(Student e : this.data){
            s = s + e.toString();
        }
        return s;
    }
}