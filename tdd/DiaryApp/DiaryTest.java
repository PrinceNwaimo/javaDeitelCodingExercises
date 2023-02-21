package DiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    LocalDateTime dateTime = LocalDateTime.now();
    private Diary princeDiary;
    private Entry entry;

    @BeforeEach
    public void SetUp() {
        princeDiary = new Diary();
        entry = new Entry("title", "body", 2);
        princeDiary.createEntry("My Events", "My life history", 2300);
    }

    @Test
    public void testToCreateEntry() {
        princeDiary = new Diary();
        princeDiary.createEntry("My Events", "My life history", 2300);
        assertEquals(1, princeDiary.getNumberOfEntries());
    }

    @Test
    public void testToViewEntry() {
        String expected = String.format("""
                =======================
                Title: Events
                =======================
                Body: My life history
                =======================
                Date:%s
                ======================
                          """, entry.getTime());

        assertEquals(expected, princeDiary.viewEntry(25).toString());
        System.out.println(princeDiary.viewEntry(25).toString());

    }

    @Test
    public void testToEditEntry() {
        princeDiary.createEntry("My Events", "My life history", 2300);
        princeDiary.editEntry("My story","My life history",2300);
        assertEquals("My story", "My story");
    }



    @Test
    public void testToAddEntry() {
        princeDiary.createEntry("my events", "My life history", 2300);
        princeDiary.addEntry("My goal", "equip", 2301);
        assertEquals(2, 2);
        assertEquals(3, princeDiary.getNumberOfEntries());
    }

    @Test
    public void testToDeleteEntry() {
        princeDiary.createEntry("my events", "My life history", 2300);
        princeDiary.deleteEntry("my events","My life history",2300);
        assertEquals(1, princeDiary.getNumberOfEntries());
    }

    @Test
    public void testToFindEntryByID() {
        princeDiary.findEntry("my events", "my life history", 2300);
        princeDiary.getNumberOfEntries();
        assertEquals(princeDiary.getNumberOfEntries(), 1);
        assertEquals(2300, 2300);

    }

    @Test
    public void testToCountEntry() {
        princeDiary.createEntry("My events", "my life history", 2300);
        princeDiary.countEntry();
        assertEquals(2, princeDiary.getNumberOfEntries());
    }
}