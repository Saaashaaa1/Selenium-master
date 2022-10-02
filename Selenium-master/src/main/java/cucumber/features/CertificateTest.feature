@CertificateTest
  Feature: Checking the certificate on the page

    Scenario Outline: Checking the existence of a certificate
      When I open the site "https://certificate.ithillel.ua/"
      And Enter certificate code "<cer>"
      Then Check result
      Examples:
        | cer      |
        | 123456   |
        | 1122334  |
        | 12549000 |
        | 00004    |
        | 85045869 |