package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone("31415926");

        Contact emi = new Contact("emi", "16180339");
        Contact carlos = new Contact("Carlos", "11235813");

        mobile.addNewContact(new Contact("Santiago", "23571113"));
        mobile.addNewContact(new Contact("Jane", "23422113"));
        mobile.addNewContact(emi);
        mobile.addNewContact(carlos);

        mobile.updateContact(emi, new Contact("Emi", "16180339"));
        mobile.removeContact(new Contact("Jane", "23422113"));
        mobile.removeContact(carlos);

        mobile.printContacts();
    }
}