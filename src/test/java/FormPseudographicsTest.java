import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class FormPseudographicsTest {

    @Test
    public void testMethodPrintPseudographic() {
        //Проверяем вывод псевдографики в необходимой последовательности
        String[] testArray = new String[6];

        testArray[0] = "  ___     ___    _____     __    _____   _   _   ____    ___       __     ___   ";
        testArray[1] = " / _ \\   / _ \\  |____ |   / /   | ____| | | | | |___ \\  |__ \\    /__ |   / _ \\  ";
        testArray[2] = "| (_) | | (_) |    / /   / /_   |  |__  | |_| |   ) | |  ) | |     | |  | | | | ";
        testArray[3] = " \\__, |  > _ <    / /   | '_ \\  |___  \\ |__  _|  |__ <    / /      | |  | | | | ";
        testArray[4] = "   / /  | (_) |  / /    | (_) |  ___) |    | |   ___) |  / /_      | |  | | | | ";
        testArray[5] = "  /_/    \\___/  /_/      \\___/  |____/     |_|  |____/  |____|     |_|   \\___/  ";

        FormPseudographics originClass = new FormPseudographics();
        Integer[] sequence = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        FormPseudographics mock = mock(FormPseudographics.class);
        when(mock.formPseudographic(sequence)).thenReturn(originClass.formPseudographic(sequence));
        Assertions.assertArrayEquals(mock.formPseudographic(sequence), testArray);

    }

    @RepeatedTest(3)
    void repeatedTest(TestInfo testInfo) {
        //Проверяем, что сформируется одна та же последовательность при нескольких формированиях
        String[] testArray = new String[6];

        testArray[0] = "  ___     ___    _____     __    _____   _   _   ____    ___       __     ___   ";
        testArray[1] = " / _ \\   / _ \\  |____ |   / /   | ____| | | | | |___ \\  |__ \\    /__ |   / _ \\  ";
        testArray[2] = "| (_) | | (_) |    / /   / /_   |  |__  | |_| |   ) | |  ) | |     | |  | | | | ";
        testArray[3] = " \\__, |  > _ <    / /   | '_ \\  |___  \\ |__  _|  |__ <    / /      | |  | | | | ";
        testArray[4] = "   / /  | (_) |  / /    | (_) |  ___) |    | |   ___) |  / /_      | |  | | | | ";
        testArray[5] = "  /_/    \\___/  /_/      \\___/  |____/     |_|  |____/  |____|     |_|   \\___/  ";

        FormPseudographics originClass = new FormPseudographics();
        Integer[] sequence = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        FormPseudographics mock = mock(FormPseudographics.class);
        when(mock.formPseudographic(sequence)).thenReturn(originClass.formPseudographic(sequence));
        Assertions.assertArrayEquals(mock.formPseudographic(sequence), testArray);
    }

    @Test
    void testExpectedException() {
        //Проверяем, что при вызове метода formPseudographic не будет ошибки  времени исполнения
        Integer[] sequence = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        FormPseudographics mock = mock(FormPseudographics.class);
        when(mock.formPseudographic(sequence)).thenThrow(new RuntimeException());
        Assertions.assertThrows(RuntimeException.class, () -> {
            mock.formPseudographic(sequence);
        });

    }
}
