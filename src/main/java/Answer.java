import javax.persistence.*;
import java.util.List;

@Entity
public class Answer {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;
    private String answer;
//    @OneToOne(mappedBy = "answer")

    @ManyToOne
    private Question question;


    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public Answer() {
        super();
    }

    public int getAnserid() {
        return answerId;
    }

    public void setAnserid(int anserid) {
        this.answerId = anserid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
