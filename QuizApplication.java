import java.util.Scanner;

public class QuizApplication {
    private String[] questions = {
        "What is the capital of France?",
        "Who painted the Mona Lisa?",
        "What is the largest planet in our solar system?"
    };

    private String[][] options = {
        {"Berlin", "Paris", "London", "Rome"},
        {"Leonardo da Vinci", "Michelangelo", "Raphael", "Caravaggio"},
        {"Earth", "Saturn", "Jupiter", "Uranus"}
    };

    private int[] answers = {1, 0, 2};

    private int score = 0;

    public static void main(String[] args) {
        QuizApplication quiz = new QuizApplication();
        quiz.startQuiz();
    }

    private void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            System.out.print("Enter your answer (1-" + options[i].length + "): ");
            int userAnswer = scanner.nextInt() - 1;

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + options[i][answers[i]]);
            }

            System.out.println();
        }

        System.out.println("Quiz complete. Your final score is " + score + "/" + questions.length);
    }
}
