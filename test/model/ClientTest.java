package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client c;
    private Platform p;

    private void setupScenary1() {
        p = new Platform();
    }

    @Test
    public void testClient1() {
        setupScenary1();
        p = new Platform();
        assertNotNull(p.getClients().get(0).getNumberId());
        assertNotNull(p.getClients().get(0).getClientLastName());

    }

    private void setupScenary2() {
        p = new Platform();
    }

    @Test
    public void testClient() {
        setupScenary2();
        String clientName = "Amparo";
        String clientLastName = "Guevara";
        String idType = "CE";
        String numberId = "1234567";
        String telephone = "2345678987";
        String address = "Calle hojaldra";
        c = new Client(clientName, clientLastName, idType, numberId, telephone, address);
        assertEquals(numberId, p.getClients().get(1).getNumberId(), "se encontro");

    }


}