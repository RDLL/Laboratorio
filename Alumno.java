public class Alumno
{
    
    String nombre;
    int clave;
    
    public Alumno(String nombreA,int num)
    {
        nombre=nombreA;
        clave=num;
    }
    
    public String toString()
    {
        String aux = nombre + "," + clave;
        return aux;
    }
    
}