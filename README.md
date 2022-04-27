# SpringBootReportApp with Spring, JPA, Thymeleaf, Bootstrap, Maven

#Spring, Thymeleaf, JPA, Maven, Bootstrap Task

### Github Link;

> https://github.com/Melihomac/SpringBootReportApp

**Klasörü indirip terminali açmalısınız. Ardından dosya dizinine gelin.**

Örnek; melihomac@Melih-MacBook-Pro Task. %

Terminal komut satırına;

> mvn clean package

Yazıp çalıştırın. Ardından target klasörü içerisine SNAPSHOT.jar dosyası oluşacak terminale tekrar gelip;

> java -jar target/springboot-thymeleaf-crud-tutorial-0.0.1-SNAPSHOT.jar

Yazın. Ide kullanmadan uygulamayı çalıştırmış oldunuz. Ardından tarayıcınızın adres çubuğuna;

> http://localhost:8080/

Yazıp sonucu görün.

Uygulamamda controller, entity ve repository olmak üzere 3 adet klasör bulunmakta.

Entity klasörü içinde model olarak Report.java dosyası yer almakta. Denildiği gibi bütün objelerimin getter ve setter ayrıca constructor metodları yer almakta.

Controller klasörü içinde ReportController.java dosyası yer almakta. Report update, add ve list metodları yer almakta.

Repository klasörü içinde ReportRepository.java dosyası yer almakta. Bu dosya interface türünde bir dosyadır.

Resources kısmında ise Thymeleaf için 3 adet html klasörü bulunmakta.
`add-report.html, index.html ve update-report.html`

Dependency olarak;<br>

`Spring data Jpa, Spring Thymeleaf, Spring Web, Spring devtools, h2 Database System`<br>

Bulunmakta... Sürenin aşırı uzamasından dolayı bahsettiğiniz bazı bölümleri yapamadım. Onlar üzerinde çalışmaya devam ediyorum. Şimdilik bu kadar.
