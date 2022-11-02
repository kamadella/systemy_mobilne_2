package pl.edu.pb.wi;

public class Question {
    private int questionId;
    private boolean trueAnswer;

    Question(int questionId, boolean trueAnswer){
        this.questionId=questionId;
        this.trueAnswer=trueAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public boolean isTrueAnswer() {
        return this.trueAnswer;
    }
}
