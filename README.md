# FSE_Landerer_Makroarchitektur_Teil3

# Aufgabe Makroarchitektur Teil 3
## Inbetriebnahme der Microservice-Variante von erplite als Schritt für Schritt-Anleitung mit Screenshots und Text zu dokumentieren

Um die Microservice-Variante von erplite in Betrieb nehmen zu können, müssen folgende Schritte durchgeführt werden:

![DockerDesktop](pics/DockerDesktop.jpg)

- herunterladen der Docker-Container und das Starten dieser Container

![IntelliJ_Projekte](pics/IntelliJ_Projekte.jpg)

- alle Microservices werden in ein IntelliJ Projekt geladen

![IntelliJ_Start_1](pics/IntelliJ_Start_1.jpg)

- nun werden die einzelnen Microservices gestartet - dabei muss auf die Reihenfolge geachtet werden

![IntelliJ_Start_2](pics/IntelliJ_Start_2.jpg)

- zunächst muss das Microservice 'ServiceDiscovery' gestartet werden

![IntelliJ_Start_3](pics/IntelliJ_Start_3.jpg)

- danach können die Microservices 'DeliverMS', 'OrderMS' und 'StockMS' gestartet werden - hierbei ist die Reihenfolge nicht wichtig

![IntelliJ_Start_4](pics/IntelliJ_Start_4.jpg)

- zuletzt wird das Microservice 'ApiGateway' gestartet

![Frontend_Start_1](pics/Frontend_Start_1.jpg)

- nun können die Files für das Frontend in VS-Code geöffnet werden - über 'Go Live' kann die Anwendung über '127.0.0.1:5500' gestartet werden

![Frontend_Start_2](pics/Frontend_Start_2.jpg)

- das Frontend zeigt einen einfachen Webshop, in dem ein einfacher Workflow durchgespielt wird

![Frontend_Start_3](pics/Frontend_Start_3.jpg)

- beim klick auf den Button 'Testbestellung aufgeben' wird eine neue Bestellung abgesetzt

![Frontend_Start_4](pics/Frontend_Start_4.jpg)

- eine neue Bestellung mit dem Status 'PLACED' ist nun im System

![Frontend_Start_5](pics/Frontend_Start_5.jpg)

- beim klick auf den Button 'payment received' wird der Status der Bestellung auf 'PAYMENT_VERIFIED' gesetzt...

![Frontend_Start_6](pics/Frontend_Start_6.jpg)

- ...gleichzeitig landen die Artikel im Stock, um 'verpackt' zu werden

![Frontend_Start_7](pics/Frontend_Start_7.jpg)

- klickt man bei den Artikeln jeweils auf 'mark packed' wird der Status der Artikel auf 'PACKED' gesetzt 

![Frontend_Start_8](pics/Frontend_Start_8.jpg)

- der jeweilige Pack-Status wird im Stock angezeigt

![Frontend_Start_9](pics/Frontend_Start_9.jpg)

- ist jeder Artikel der Bestellung auf 'PACKED', wird die ganze Bestellung auf 'PREPARING_FOR_DELIVERY' gesetzt

![Frontend_Start_10](pics/Frontend_Start_10.jpg)

- klickt man im Webshop nun auf den Button 'request delivery', wird die Lieferung der Bestellung veranlasst

![Frontend_Start_11](pics/Frontend_Start_11.jpg)

- der Status der Bestellung lautet nun 'IN_DELIVERY'

![Frontend_Start_12](pics/Frontend_Start_12.jpg)

- in Delivery werden die Bestellungen, die versendet wurden, angezeigt

![Frontend_Start_13](pics/Frontend_Start_13.jpg)

- beim klick auf den Button 'mark delivery' kann für jede Bestellung angegeben werden, dass sie geliefert wurde - der Status der Lieferung wird dann auf 'delivered' geändert

![Frontend_Start_14](pics/Frontend_Start_14.jpg)

- auch der Status der Bestellung ist nun auf 'DELIVERED'

## Abgabe einer Architekturanalyse des bestehenden erplitems-Backends
### Schriftliche Dokumentation der Architektur als C4-Containerdiagramm und C4-Componentendiagramm incl. textuellen Beschreibungen, Codeauszügen und Screenshots.
### Die beschriebenen Use-Cases (Bestellung anlegen, Payment verifizieren, Packlistenitems abhaken) entlang der Architektur beschreiben, Codeauszüge zeigen, Screenshots mit den Resultaten zeigen, textuelle Beschreibungen dazu

