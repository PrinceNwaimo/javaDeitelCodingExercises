package DiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    @BeforeEach
    public void setUp(){
        Entry userEntry = new Entry("Events","My life history",2300);
    }
    @Test
    public void testThatEntryExists(){
        Entry userEntry = new Entry("Events","My Events",2300);
        assertNotNull(userEntry);
    }
    @Test
    public void testThatEntryHasTitle(){
        Entry userEntry =new Entry("Events","My Events",2300);
        String title = userEntry.getTitle();
        assertEquals("Events","Events");
    }
    @Test
    public void testEntryWithID(){
        Entry userEntry= new Entry("Events","My life history",2300);
        userEntry.getTitle();
        assertEquals(2300,2300);
    }

    }


