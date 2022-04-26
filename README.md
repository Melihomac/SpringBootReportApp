# SpringBootReportApp with Spring, JPA, Thymeleaf, Bootstrap, Maven

![Screenshot 2022-04-25 at 00-21-16 Users](https://user-images.githubusercontent.com/37351493/164997315-38209d4b-4dcc-4189-8102-e0c5d13c1817.png)
![Screenshot 2022-04-25 at 00-22-38 Add Report](https://user-images.githubusercontent.com/37351493/164997313-f1f00861-c3bd-4e3e-bd9d-0c27ce5d788b.png)
![Screenshot 2022-04-25 at 00-23-25 Users](https://user-images.githubusercontent.com/37351493/164997312-74a402c5-1599-457d-968a-cbd0d2e57b9b.png)
![Screenshot 2022-04-25 at 00-23-48 Update User](https://user-images.githubusercontent.com/37351493/164997308-6a01c625-3a65-452e-940c-b48474e17133.png)

#Spring, Thymeleaf, JPA, Maven, Bootstrap Task

### Github Link;

> https://github.com/Melihomac/SpringBootReportApp

**Klasörü indirip terminali açmalısınız. Ardından dosya dizinine gelin.**

Örnek; melihomac@Melih-MacBook-Pro Task. %

Terminal komut satırına;

> mvn run

Yazıp çalıştırın. Ardından tarayıcının adres çubuğuna;

> http://localhost:8080/

Yazın. Ide kullanmadan uygulamayı çalıştırmış oldunuz.

Uygulamamda controller, entity ve repository olmak üzere 3 adet klasör bulunmakta.

Entity klasörü içinde model olarak Report.java dosyası yer almakta. Denildiği gibi bütün objelerimin getter ve setter ayrıca constructor metodları yer almakta.

Controller klasörü içinde ReportController.java dosyası yer almakta. Report update, add ve list metodları yer almakta.

Repository klasörü içinde ReportRepository.java dosyası yer almakta. Bu dosya interface türünde bir dosyadır.

Resources kısmında ise Thymeleaf için 3 adet html klasörü bulunmakta.
`add-report.html, index.html ve update-report.html`

Dependency olarak;<br>

`Spring data Jpa, Spring Thymeleaf, Spring Web, Spring devtools, h2 Database System`<br>

Bulunmakta... Sürenin aşırı uzamasından dolayı bahsettiğiniz bazı bölümleri yapamadım. Onlar üzerinde çalışmaya devam ediyorum. Şimdilik bu kadar.