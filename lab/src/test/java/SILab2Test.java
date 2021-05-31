import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class SILab2Test {
    void function(){}
    private ArrayList<Time> createList(Time elems) {
        return new ArrayList<Time>(Arrays.asList(elems));
    }

    private ArrayList<Integer> returnList(Integer elems) {
        return new ArrayList<Integer>(Arrays.asList(elems));
    }

    @Test
    void multipleCondition() {
        RuntimeException ex;
        //hours < 0 || hours > 24
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-3, 2, 12))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(26, 42, 7))));

        //minutes < 0 || minutes > 59
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(14, -56, 43))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(5, 71, 26))));

        //seconds < 0 || seconds > 59
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(7, 45, -89))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(15, 14, 65))));

        //Not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(26, 64, 61))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(29, 101, 78))));


    }

    @Test
    void everyBranch() {
        RuntimeException ex;
        //TestCase 1
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-3, 25, 5))));
        //TestCase 2
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(7, -15, 23))));
        //TestCase 3
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(14, 36, 14))));
        //TestCase 4
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(16, 12, -46))));
        //TestCase 5
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(24, 0, 0))));
        //TestCase 6
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(25, 65, 70))));

    }
}