import java.security.InvalidParameterException;

public class alumno {
    
    /*
    * 
    * DATA AREA
    */
    private String name;
    private int age;
    private String schoolID;


    /*
    * 
    * CONSTRUCTORS
    */
    public alumno(){
        this("default",18,"UO000000");
    }

    public alumno(String name, int age, String schoolID){
        this.setName(name);
        this.setAge(age);
        this.setSchoolID(schoolID);
    }


    /*
    * 
    * METHODS
    */

    /**
     * Checks if a name's format is correct
     * @param s -> New name
     * @return true: <p>- if doesn't contains numbers. <p>- if isn't empty and doesn't only contains blank spaces. <p>false: otherwise. 
     */
    private boolean checkName(String s){
        if(s.isBlank()) return false;
        else{
            for(char element : s.toCharArray()){
                if(Character.isDigit(element)) return false;
            }
            return true;
        }
    }

    /**
     * Checks the ID of the student
     * @param s -> theID
     * @return true: <p>- if isn't empty and doesn't only contains blank spaces<p>- if follows the given format for school IDs: "UOXXXXXX" (each X -> number)
     */
    private boolean checkID(String s){
        if(s.isBlank() || s.length()!=8) return false;
        else{
            char[] c = s.toCharArray();
            if((c[0] != 'U' && c[0] != 'u') || ((c[1] != 'O' && c[1] != 'o'))) return false;
            for(int i = 2; i<c.length; i++){
                if(!Character.isDigit(c[i])) return false;
            }
            return true;
        }
    }

    /**
     * Set the name atribute in the data area
     * <p>Could be modified if changed in the civil register 
     * @param s -> New name
     * @throws -> InvalidParameterException() if not in correct format
     */
    public void setName(String s){
        if(checkName(s) == false) throw new InvalidParameterException("Name in not correct format");
        this.name = s;
    }

    /**
     * Set the age atribute in the data area
     * <p>Could be modified
     * @param a -> New age
     * @throws -> InvalidParameterException() if negative or too high number
     */
    public void setAge(int a){
        if(a<=0 || a>120) throw new InvalidParameterException("Invalid age value");
        this.age = a;
    }

    /**
     * Set the school ID of the alumno
     * <p>Cannot be modified
     * @param s -> New ID
     * @throws -> InvalidParameterException() if ID doesn't follows the given format for school IDs: "UOXXXXXX"
     */
    private void setSchoolID(String s){
        if(checkID(s) == false) throw new InvalidParameterException("School ID not in a correct format");
        this.schoolID = s;
    }

    /*
     * OBSERVER METHODS
     */
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getID(){
        return this.schoolID;
    }

    /*
     * OVERWRITEN METHODS
     */
    @Override
    public String toString(){
        return String.format("Student:\n\t- Name: %s\n\t- Age: %d\n\t- ID: %s\n",getName(),getAge(),getID());
    }

}
