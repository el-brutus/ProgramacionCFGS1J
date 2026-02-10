package UT5Hoja6;

import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber, ArrayList<Contacto> myContacts) {
    this.myNumber = myNumber;
    this.myContacts=myContacts;
    }

    public boolean addNewContact(Contacto nuevocontacto){
        for (Contacto contactoexistente : myContacts){
            if (contactoexistente.getName().equals(nuevocontacto.getName())){
                return false;
            }
        }
        myContacts.add(nuevocontacto);
        return true;
    }

    public boolean updateContact(Contacto contactoantiguo, Contacto nuevocontacto){
        int indice = -1;
        for (int i = 0;i < myContacts.size();i++){
            if (myContacts.get(i).getName().equals(contactoantiguo.getName())){
                indice = i;
            }
        }
        if (indice == -1){
            return false;
        }

        for (Contacto contactos : myContacts){
            if (contactos.getName().equals(nuevocontacto.getPhoneNumber())){
                return false;
            }
        }
        myContacts.set(indice, nuevocontacto);
        return true;
    }
    public boolean removeContact(Contacto eliminarcontacto){
        int indice = -1;

        for (int i = 0;i < myContacts.size();i++){
            if (myContacts.get(i).getName().equals(eliminarcontacto.getName())){
                indice = i;
            }
        }
        if ( indice == -1){
            return false;
        }

        myContacts.remove(indice);
        return true;
    }
    public int findContact(Contacto contacto){
        int indice= -1;
        for (int i =0;i < myContacts.size();i++){
            if (myContacts.get(i).getName().equals(contacto.getName())){
                indice = i;
            }
        }
        if (indice == -1){
            return -1;
        }

        return indice;
    }
    public String findContacto(String nombre){
        int indice= -1;
        for (int i = 0;i < myContacts.size();i++){
            if (myContacts.get(i).getName().equals(nombre)){
                return "Nombre encontrado";
            }
        }
        return "No hay contactos con ese nombre";
    }

    public String queryContact(String nombre){
        int indice;
        for (int i = 0;i < myContacts.size();i++){
            if (myContacts.get(i).getName().equals(nombre)){
                return String.valueOf(myContacts.get(i));
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Lista de contactos:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber()
            );
        }
    }

}
