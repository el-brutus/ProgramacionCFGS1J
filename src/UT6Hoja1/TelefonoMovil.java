package UT6Hoja1;

import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts= new ArrayList<>();
    }

    public boolean addNewContact(Contacto nuevocontacto){
        if (findContact(nuevocontacto.getName()) >= 0){
            return false;
        }
        myContacts.add(nuevocontacto);
        return true;
    }

    public boolean updateContact(Contacto contactoantiguo, Contacto nuevocontacto){
        int indice = findContact(contactoantiguo);

        if (indice < 0){
            return false;
        }

        int indicenuevo = findContact(nuevocontacto.getName());
        if (indicenuevo >= 0 && indicenuevo != indice){
            return false;
        }
        myContacts.set(indice, nuevocontacto);
        return true;
    }
    public boolean removeContact(Contacto contacto){
        int indice = findContact(contacto);
        if (indice < 0){
            return false;
        }

        myContacts.remove(indice);
        return true;
    }


    public Contacto queryContact(String nombre){
        int indice =findContact(nombre);
            if (indice>=0){
                return myContacts.get(indice);
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
    private int findContact(Contacto contacto){
        return myContacts.indexOf(contacto);
    }
    private int findContact(String nombre){
        for (int i = 0;i < myContacts.size();i++){
            if (myContacts.get(i).getName().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

}