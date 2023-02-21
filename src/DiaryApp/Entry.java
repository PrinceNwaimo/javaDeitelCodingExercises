package DiaryApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title;
    private String body;
    private DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
    private LocalDateTime time = LocalDateTime.now();

    private int ID;


    public  Entry(String title,String body,int ID){
        this.title = title;
        this.body = body;
        this.ID= ID;
    }

    public void setTitle(String title) {this.title = title;
    }
    public String getTitle() {return title;
    }
    public void setBody( String body){this.body = this.body;
    }

    public String getBody() {
        return body;
    }

    public String getTime() {
        return time.format(formatter);
    }

    public int getID() {
        return ID;
    }
@Override
public String toString() {
    return String.format("""
            =======================
            Title: %s
            =======================
            Body: %s
            =======================
            Date:%s
            ======================
            """, title, body, getTime());
}

}
