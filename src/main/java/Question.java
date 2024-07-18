import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    @Column(name = "question_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    private String question;

    //    @OneToOne
//    @JoinColumn(name = "answer_id")

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Answer> answers;

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }


//    public Answer getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(Answer answer) {
//        this.answer = answer;
//    }


    public Question(int questionId, String question, List<Answer> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public Question() {
        super();
    }

    public int getQuestioId() {
        return questionId;
    }

    public void setQuestioId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
