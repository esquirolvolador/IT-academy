import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;

@RunWith(Parameterized.class)

public class CalculoDniTest {
  private int dni;
  private char lletraExpected;

  @Parameters
  public static Iterable<Object[]> getData(){
    ArrayList<Object[]> dniArray = new ArrayList<>();
    dniArray.add(new Object[]{45544815, 'P'});
    dniArray.add(new Object[]{94514068, 'F'});
    dniArray.add(new Object[]{40068740, 'A'});
    dniArray.add(new Object[]{28529778,'A'});
    dniArray.add(new Object[]{14417055, 'B'});
    dniArray.add(new Object[]{78424475, 'H'});
    dniArray.add(new Object[]{15328650, 'R'});
    dniArray.add(new Object[]{60304829, 'W'});
    dniArray.add(new Object[]{52610483, 'F'});
    dniArray.add(new Object[]{83947547, 'P'});

    return dniArray;

  }

  public CalculoDniTest (int dni, char lletraExpected){
    this.dni= dni;
    this.lletraExpected = lletraExpected;
  }

  @Test
 public void testCalculLletra() {

    CalculoDni calculoDni = new CalculoDni();

    assertEquals(calculoDni.calculLletra(dni), lletraExpected);

  }
}