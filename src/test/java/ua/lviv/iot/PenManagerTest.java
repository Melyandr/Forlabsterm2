package ua.lviv.iot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenManagerTest {

    @Test
    void addPlateTest(){
        Pen pen = new MarkerPen("isn-101", "evev",2,"wcwcw",4);
        int initialSize = PenManager.list.size();
        PenManager.addPen(pen);
        assertEquals(initialSize + 1, PenManager.list.size());
    }

}

