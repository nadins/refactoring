(Task1)
Открыть gmail.
Залогиниться в аккаунт (предварительно создан).
Проверить, что пользователь залогинился.

(Task2)
Открыть gmail.
Залогиниться в аккаунт (предварительно создан).
Перейти на гугл-диск.
Создать папку.
Проверить, что папка созданsа.
Если все ок - удалить папку, как @AfterTest

Использовать Java, Selenium WebDriver, TestNg/Junit,
PageObjectPattern, логику страниц и тестов разделять.

Тест должен выглядеть след. образом
@Test
    public void someTest() {
        HomePage homePage = new HomePage(driver);
        ....
        Assert.assertTrue(...); (TestNg)