package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    public Client client1 = new Client("Jason", 121, Gender.FEMALE);
    public Client client2 = new Client("Harry", 1, Gender.MALE);

    @Test
    void getId() {
        assertEquals(client1.getId(), 6);
    }

    @Test
    void getAge() {
        assertEquals(client1.getAge(), 121);
        assertEquals(client2.getAge(), 1);
    }

    @Test
    void getName() {
        assertEquals(client1.getName(), "Jason");
        assertEquals(client2.getName(), "Harry");
    }

    @Test
    void getSex() {
        assertEquals(client1.getSex(), Gender.FEMALE);
        assertEquals(client2.getSex(), Gender.MALE);
    }
}