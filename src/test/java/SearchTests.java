import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    String url = "https://ru.selenide.org";
    String searchQuery = "selenide";

    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue(searchQuery).pressEnter();
        $("[id=search]").shouldHave(text(url));
    }
}