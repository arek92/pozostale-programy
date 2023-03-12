public class Words {
    private String wordName;
    private String meaning;

    public Words(String wordName, String meaning) {
        this.wordName = wordName;
        this.meaning = meaning;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "Words{" +
                "wordName='" + wordName + '\'' +
                ", meaning='" + meaning + '\'' +
                '}';
    }
}
