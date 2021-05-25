public class SpamAnalyzer extends KeywordAnalyzer {

    // пользователь может указать ПЛОХИЕ слова
    private String[] keyword;

    public SpamAnalyzer(String[] word) {
        keyword = word;
    }

    // для информирования супер-класса
    @Override
    protected String[] getKeywords() {
        return keyword;
    }

    // для информирования супер-класса
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }

}
