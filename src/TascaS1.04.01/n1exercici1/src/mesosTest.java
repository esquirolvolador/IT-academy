import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mesosTest {

  @Test
  void numMesos() {

  Mesos mesos = new Mesos();
   int tamany = mesos.numMesos();

    assertEquals(12, tamany);

  }

  @Test
  void isNotNull() {
    Mesos mesos = new Mesos();
    assertNotNull(mesos.getMesosOrdenat());
  }

  @Test
  void posicioMesos() {
    Mesos mesos = new Mesos();
    assertEquals("Agost", mesos.getMes(8));
  }
}