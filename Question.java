public class Question {
    private String question;
    private String possibleA;
    private String possibleC;
    private String possibleB;
    private String answer;

    private boolean isAnswer;

    public Question(String question, String possibleA, String possibleB, String possibleC, String answer){
        setQuestion(question);
        setPossibleA(possibleA);
        setPossibleB(possibleB);
        setPossibleC(possibleC);
        setAnswer(answer);

    }
    public String getQuestion() {
        return "question/n"+
                "A."+ possibleA+"/n"+
                "B."+ possibleB+"/n"+
                "C."+ possibleC+"/n";

    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setPossibleA(String possibleA) {
        this.possibleA = possibleA;
    }

    public void setPossibleB(String possibleB) {
        this.possibleB = possibleB;
    }

    public void setPossibleC(String possibleC) {
        this.possibleC = possibleC;
    }

    public boolean isAnswer(String userAnswer) {
        return (userAnswer.equalsIgnoreCase(answer));
    }
}
