package io.github.jkim3213.cowraiser;


import java.util.ArrayList;
import java.util.HashMap;

public class UserProfile {
    static String UID = "";
    static int ecoDollars = 0;
    static int carbonLbs = 0;
    //static HashMap<String, Integer> inventory = new HashMap<>();
    static ArrayList<JournalEntry> journalEntryList = new ArrayList<>();
    static String email = "";
    static HashMap<String, Integer> curLevels = new HashMap<>();
    static HashMap<String, Integer> challengeOccurences = new HashMap<>();

    public int ecoD;
    public int carbonL;
    //public HashMap<String, Integer> inv;
    public ArrayList<JournalEntry> entryList;
    public String userEmail;
    public HashMap<String, Integer> levels;
    public HashMap<String, Integer> cOccur;


    public UserProfile() {
        ecoD = ecoDollars;
        carbonL = carbonLbs;
        //inv = inventory;
        entryList = journalEntryList;
        userEmail = email;
        levels = curLevels;
        cOccur = challengeOccurences;
    }

    public static ArrayList<JournalEntry> getJournalEntryList() {
        return journalEntryList;
    }

    void setUser() {
        ecoDollars = ecoD;
        carbonLbs = carbonL;
        journalEntryList = entryList;
        email = userEmail;
        curLevels = levels;
        challengeOccurences = cOccur;
    }

    static void resetUser() {
        UID = "";
        ecoDollars = 0;
        carbonLbs = 0;
        journalEntryList = new ArrayList<>();
        email = "";
        curLevels = new HashMap<>();
        challengeOccurences = new HashMap<>();
    }

    void removeJournalEntry(int i) {
        journalEntryList.remove(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append("email: ");
        sb.append(email);
        sb.append('\n');
        sb.append("eco: ");
        sb.append(ecoDollars);
        sb.append('\n');
        sb.append("carbon: ");
        sb.append(carbonLbs);
        sb.append('\n');
        sb.append("levels: ");
        sb.append(curLevels.toString());
        sb.append('\n');
        sb.append("occurences: ");
        sb.append(challengeOccurences.toString());
        sb.append('\n');

        return sb.toString();
    }

    public void setCarbonLbs(int carbonL){
        this.carbonL = carbonL;
    }

    public int getCarbonLbs(){

        return carbonL;
    }
}
