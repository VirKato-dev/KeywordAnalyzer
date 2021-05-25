abstract class KeywordAnalyzer implements TextAnalyzer {

    // вернёт ключевые слова заданные в наследнике
    protected abstract String[] getKeywords();

    // вернёт метку определённую в наследнике
    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String word : getKeywords()) {
            if (text.contains(word)) return getLabel();
        }
        return Label.OK;
    }

}
