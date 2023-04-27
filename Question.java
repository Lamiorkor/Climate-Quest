public class Question {
    private String question;
    private String possibleA;
    private String possibleB;
    private String possibleC;


    private String answer;
    private String wrong;

    public Question(String question, String possibleA, String possibleB, String possibleC, String answer,String wrong){
        setQuestion(question);
        setPossibleA(possibleA);
        setPossibleB(possibleB);
        setPossibleC(possibleC);
        setAnswer(answer);
        setWrong(wrong);

    }
    public String getQuestion() {
        return "Question:\n"+question+"\n"+
                "A."+ possibleA+"\n"+
                "B."+ possibleB+"\n"+
                "C."+ possibleC+"\n";

    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setWrong(String wrong) {
        this.wrong = wrong;
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

    public boolean isWrong(String userAnswer) {
        return (userAnswer.equalsIgnoreCase(wrong));
    }
}
