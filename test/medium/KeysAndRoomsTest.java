package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class KeysAndRoomsTest {

    @Test
    void canVisitAllRooms() {
        KeysAndRooms obj = new KeysAndRooms();

        List<List<Integer>> input = new ArrayList<>();

        input.add(List.of(1));
        input.add(List.of(2));
        input.add(List.of(3));
        input.add(List.of());

        Assertions.assertTrue(obj.canVisitAllRooms(input));
    }
}
