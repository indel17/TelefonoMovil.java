import java.util.ArrayList;

public class TelefonoMovil {


    public String myNumber;
    public ArrayList<Contacto> myContacts = new ArrayList<Contacto>();

   private int findContact(Contacto con) {
        return myContacts.indexOf(con);
    }

    private int findContact(String nombre) {
        for (int i = 0; i < myContacts.size(); i++) {

            if (myContacts.get(i).getName().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }


/*addNewContact, recibe un parámetro de tipo Contacto y devuelve un valor
booleano. Devuelve verdadero si el contacto no existe y se ha podido añadir a la
lista o falso si por el contrario el contacto ya existe*/

    public boolean addNewContact(Contacto cont){
        int x = findContact(cont);
        if(x >= 0){
            return false;
        }else{
           myContacts.add(cont);
            return true;
        }

    }

/*updateContact, recibe dos parámetros de tipo Contacto (el contacto antiguo
que se actualizará con el nuevo contacto) y devuelve un valor booleano. Devuelve
verdadero si el contacto existe y se actualizó correctamente o falso si el contacto
no existe. Ten en cuenta, que no se puede actualizar con un contacto que ya
exista en la lista de contactos.*/

    public boolean updateContact(Contacto contactos, Contacto contactosNuevos) {
        int x = findContact(contactos);
        if (x >= 0) {
            myContacts.set(x, contactosNuevos);
            return true;
        } else {
            return false;
        }
    }
    /* removeContact, recibe un parámetro de tipo Contacto y devuelve un valor
booleano. Devuelve verdadero si el contacto existe y se eliminó con éxito, o falso
si el contacto no existe.*/

       public boolean removeContact(Contacto con){
            int x = findContact(con);
            myContacts.remove(x);
            return true;
        }
/*queryContact, recibe un parámetro de tipo String y devuelve un contacto. Usa
el String para buscar el nombre y luego devuelve el contacto. Devuelve nulo en
caso contrario.*/



        public Contacto queryContact(String nombre) {
            int index = findContact(nombre);
            if (index >= 0) {
                return myContacts.get(index);
            } else {
                return null;
            }
        }

    public void printContacts() {
        System.out.println("Lista de contactos:");

        for (int i = 0; i < myContacts.size(); i++) {
            Contacto contacto = myContacts.get(i);
            System.out.println((i + 1) + " - Nombre: " + contacto.getName() + ", Numero: " + contacto.getPhoneNumber());
        }
    }
}




