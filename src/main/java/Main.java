import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration configuratio = new Configuration();
        configuratio.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuratio.buildSessionFactory();

        Session session = sessionFactory.openSession();


        //creating Question Object

        Question question = new Question();
        question.setQuestioId(1221);
        question.setQuestion("What is java?");

        Question question1 = new Question();
        question1.setQuestioId(1222);
        question1.setQuestion("What is collection?");

        Answer answer = new Answer();
        answer.setAnserid(12);
        answer.setAnswer("Java is a programming language");
        //answer.setQuestion(question);

        Answer answer1 = new Answer();
        answer1.setAnserid(13);
        answer1.setAnswer("API to work on object");

//        question.setAnswer(answer);
//        question1.setAnswer(answer1);

        //begin transaction
        Transaction tx =  session.beginTransaction();
        session.save(question);
        session.save(answer);
        session.save(question1);
        session.save(answer1);
        tx.commit();

        //fetching...

        Question qst = session.get(Question.class,1221);
        System.out.println(qst.getQuestion());
//        System.out.println(qst.getAnswer().getAnswer());

        Question qst1 = session.get(Question.class, 1222);
        System.out.println(qst1.getQuestion());
//        System.out.println(qst1.getAnswer().getAnswer());
        sessionFactory.close();
    }
}
