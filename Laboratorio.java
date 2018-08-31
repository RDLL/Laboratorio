import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList<Alumno> alumnos;
    
    public Laboratorio()
    {
        alumnos = new ArrayList<Alumno>();
    }
    
    public void mostrarLista()
    {
        if(alumnos.size() > 0){
            for(int i = 0; i < alumnos.size(); i++) {
                Alumno alumno = alumnos.get(i);
                System.out.println(alumno.toString());
            }
        }
        else{
            System.out.println("No hay alumnos registrados");
        }
        
    }
    
    public boolean baja(String nombreAlumno)
    {
        if(alumnos.size() > 0){
            for(int i = 0; i < alumnos.size(); i++) {
                Alumno alumno = alumnos.get(i);
                if(alumno.nombre.equals(nombreAlumno) == true) {
                    alumnos.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    
    public  boolean alta(String nombreAlumno,int numClave)
    {
        Alumno alumno = new Alumno(nombreAlumno,numClave);
        alumnos.add(alumno);
        return true;
    }
    
}