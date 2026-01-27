package com.jUnit.test;

import org.junit.jupiter.api.*;

import com.jUnit.com.listOperations.ListManager;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestListManager {
    ListManager manager = new ListManager();
    List<Integer> list;

    @BeforeEach
    void init() {
        list = new ArrayList<>(); // Fresh list for every test
    }

    @Test
    void testListOperations() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);
        
        assertEquals(2, manager.getSize(list), "Size should be 2 after additions");
        assertTrue(list.contains(10), "List should contain 10");

        manager.removeElement(list, 10);
        assertEquals(1, manager.getSize(list), "Size should be 1 after removal");
        assertFalse(list.contains(10), "List should no longer contain 10");
    }
}
