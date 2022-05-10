package com.tests.autotest001

import org.junit.jupiter.api.Test
import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.*
import static com.codeborne.selenide.Condition.*

class Dogs {
    @Test
    void searchDogsTest() {
        def searchRequest = "Dog"

        open("https://google.com")
        def searchInput = $(By.name("q"))
        searchInput.value = searchRequest
        searchInput.pressEnter()

        def found = $$("h3.LC20lb")
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)
    }
}
