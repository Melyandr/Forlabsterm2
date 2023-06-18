package ua.lviv.iot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenManagerTest {

    @Test
    void addPPenTest(){
        Pen pen = new MarkerPen("isn-101","Kite","yeloow", "cloth", 2, "for school", 4);
        int startSize = PenManager.list.size();
        PenManager.addPen(pen);
        assertEquals(startSize + 1, PenManager.list.size());
    }

}

