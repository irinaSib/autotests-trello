@openLoginPage
Feature: Trello login feature

  Scenario: Login with valid credentials
    When Enter username yoka99991@gmail.com on the Login page
    Then Enter password 11111111 on the Login page
    And Click 'Login' button on the Login page
    Then Check profile button for user Bran is present at the Header

  Scenario Outline: Login with invalid credentials
    When Enter username <username> on the Login page
    Then Enter password <password> on the Login page
    And Check message error <error> is present on the Login page

    Examples:
      | username               | password | error                                                   |
      | invalidEmail@gmail.com | 11111111 | Аккаунт с таким адресом электронной почты не существует |
      | yoka99991@gmail.com    | 2        | Указан неверный адрес и/или пароль.                     |
      |                        | 11111111 | Отсутствует адрес электронной почты                     |
      | yoka99991@gmail.com    |          | Указан неверный адрес и/или пароль.                     |
      |                        |          | Отсутствует адрес электронной почты                     |



