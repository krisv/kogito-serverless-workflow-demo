package org.kie.kogito.thegame.scores;

public class ScoreResult {
    private boolean result;
    public ScoreResult(boolean result) {
        this.result = result;
    }
    public boolean getResult() {
        return result;
    }
    public void setResult(boolean result) {
        this.result = result;
    }
}