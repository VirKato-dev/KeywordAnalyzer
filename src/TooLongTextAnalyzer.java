public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int len) {
        maxLength = len;
    }

    @Override
    public Label processText(String text) {
        return text.length() <= maxLength ? Label.OK : Label.TOO_LONG;
    }

}
