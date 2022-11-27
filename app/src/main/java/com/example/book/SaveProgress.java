package com.example.book;

public class SaveProgress {
    private final int allQuestCount = 2;
    public int questSuccesses = 0;

    public int getAllQuestCount() {
        return allQuestCount;
    }

    public void setQuestSuccesses(int questSuccesses) {
        this.questSuccesses = questSuccesses;
    }

    public SaveProgress(int questSuccesses) {
        this.questSuccesses = questSuccesses;
    }

}
