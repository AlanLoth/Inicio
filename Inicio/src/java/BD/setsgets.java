package BD;
/**
 * @author Loth
 */
public class setsgets {
    private String nombre;
    private String contra;
    
    public setsgets(String nombre, String contra) {
    this.nombre = nombre;
    this.contra = contra;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setContra(String contra) {
        this.contra = contra;
    }
    
    public String getContra() {
        return contra;
    }
    
}
