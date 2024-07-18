import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CascadeExample {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Question question = new Question();
        question.setQuestioId(1265);
        question.setQuestion("What is Python?");

        Answer answer1 = new Answer(4554,"It is a Python concept");
        Answer answer2 = new Answer(4555,"for developer");
        Answer answer3 = new Answer(4556,"desktop app");

        List<Answer> answers = new ArrayList<>();
        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);
        question.setAnswers(answers);

        session.save(question);
        tx.commit();
        session.close();
        factory.close();

    }

}
