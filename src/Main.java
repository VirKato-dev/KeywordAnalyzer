public class Main {

    public static void main(String[] args) {

        String[] text = {
                "Для начала применим анализатор длины сообщения.",
                "Проверка для Negative :(",
                "Проверка для Spam",
        };

        TextAnalyzer[] analyzers = new TextAnalyzer[] {
                new TooLongTextAnalyzer(30),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(new String[] {"Spam", "для"})
        };

        System.out.println(checkLabels(analyzers, text[0]).name());
        System.out.println(checkLabels(analyzers, text[2]).name());
        System.out.println(checkLabels(analyzers, text[1]).name());

    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer ta : analyzers) {
            // у всех analyzers один метод отвечает за результат
            Label label = ta.processText(text);
            // первый попавшийся плохой ответ
            if (label != Label.OK) return label;
        }
        return Label.OK;
    }

}
