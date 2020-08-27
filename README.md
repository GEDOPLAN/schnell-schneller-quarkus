# schnell-schneller-quarkus
Begleitprojekte zum Vortrag "Schnell, schneller, Quarkus!"

ssq-jee ist eine kleine Beispiel-Anwendung als klassisches JEE-Deployment, z. B. für einen WildFly.
Der Zielserver benötigt eine Datasource mit dem JNDI-Namen java:/jdbc/showcase.

ssq-quarkus wurde im Vortrag als migrierte Anwendung für Quarkus aufgebaut und in einigen Details ergänzt.
In der Konfiguration wird eine Postgres-DB referenziert. Sie kann bspw. mit dem Script postgres.sh gestartet werden.

Das Verzeichnis scripts enthält diverse Scripts zum Bauen, Starten und Nutzen der Anwendung.

Ein thematisch passendes Seminar finden Sie hier: https://gedoplan-it-training.de/java-grundkurse/microservices-mit-quarkus-kompakt/
