package DiaryApp;


import java.util.ArrayList;

public class Diary {

    ArrayList<Entry>entries = new ArrayList<>();

    public void createEntry(String title,String body,int ID) {
        String Entry = String.valueOf(entries.size()+1);
        Entry princeEntry = new Entry(title,body,ID);
        entries.add(princeEntry);
    }
    public int getNumberOfEntries(){return entries.size();}

    public Entry viewEntry(int ID) {return entries.get(ID-1);

    }
    public Entry findEntry(String title,String body,int ID){return entries.get(entries.size()-1);}




    public void editEntry(String title,String body,int ID){
        Entry entry = findEntry(title,body,ID);
        entry.setTitle(title);
        entry.setBody(body);
    }

    public Object deleteEntry(String title,String body,int ID) {
        Entry entry = findEntry(title,body,ID);
        entries.remove(entry);
        return null;
    }

    public void addEntry(String title,String body, int ID) {
        entries.add(new Entry(title,body,ID));
    }
    public  void countEntry(){
//        Entry entries = findEntry("my events","My life history",2300);
        entries.stream().count();
    }

}
