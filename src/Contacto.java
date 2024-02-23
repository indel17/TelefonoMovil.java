public class Contacto {
    /*Dos campos, ambos String, uno llamado name y el otro phoneNumber.
ii. Un constructor con dos Strings.
iii. Y tres métodos: getName, getPhoneNumber y createContact que recibe dos
parámetros de tipo String (el nombre de la persona y el número de teléfono) y
devuelve una instancia de Contacto. Este es el único método que es estático.*/

    public String name;
    public String PhoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public static Contacto createContact(String name, String PhoneNumber) {
        Contacto contacto = new Contacto(name, PhoneNumber);
        return contacto;
    }



    @Override
    public String toString() {
        TelefonoMovil tel = new TelefonoMovil();
        for (  int contador = 1; contador < tel.myContacts.size() ; contador++){
        return "Contacto{" +
                contador + name + '\'' +
                " ->'" + PhoneNumber + '\'' +
                '}';}
       return "";
    }
}
