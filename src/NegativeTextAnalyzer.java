public class NegativeTextAnalyzer extends KeywordAnalyzer {

    // пользователь не может изменить понятие НЕГАТИВНОСТИ
    private String[] keyword = {":(", "=(", ":|"};

    // для информирования супер-класса
    @Override
    protected String[] getKeywords() {
        return keyword;
    }

    // для информирования супер-класса
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }

}
