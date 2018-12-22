# **Java Bildkompression**

## Einleitung

Das vorliegende Programm dient der Komprimierung von Bildern. Wir haben dieses Programm geschrieben, weil wir den Komprimierungsprozess vereinfachen wollen. Vor allem ältere Personen, die sich nicht mit komplizierten Computerprogrammen auskennen, haben öfters Probleme mit dem Komprimieren von Bildern.
Um das Komprimieren von Bildern für diese Zielgruppe zu vereinfachen, haben wir ein intuitives Programm erstellt. Die Komprimierung von Bildern bringt einen erheblichen Gewinn an Speicherplatz mit sich, da die Dateigröße der Bilder massiv reduziert wird. Im Hinblick auf Versendungen per E-Mail bringt die Komprimierung von Bildern auch erhebliche Vorteile.
Die Programmiersprache Java wurde ausgewählt, weil sie sowohl mit Windows, Mac als auch Linux kompatibel ist.

## Zielsetzung / Vision

Das Ziel unseres Projekts ist es, die Komprimierung von Bildern zu vereinfachen. Die Applikation soll speziell für Leute sein, die gerne Fotografieren, sich aber nicht mit der Bildkomprimierung auskennen und ihre Bilder trotzdem möglichst platzsparend ablegen möchten.

## Randbedingung

Das Programm soll in Java innerhalb der Eclipse Programmierumgebung geschrieben werden. Durch eine Strukturierung in verschiedene Klassen und Methoden soll ein klarer Aufbau erzielt werden. Das Programm soll mittels der Projektverwaltung Maven erstellt werden. Für die Versionsverwaltung und die nahtlose Zusammenarbeit der Gruppe wird die Software Git verwendet. Durch eine entsprechende Konfiguration sind Eclipse, Maven und Git direkt miteinander verbunden. 

## Build-Anleitung

1. Laden Sie die Datei .jar auf ihren Computer runter.
2. Vergewissern Sie sich, dass Sie eine Java Runtime Environment auf Ihrem Computer installiert haben.
3. Klicken Sie (Doppelklick) auf ebenjene, um die Datei auszuführen.

## User Stories

Nr. | UserStory | Aufwand-schätzung (Story Points) | Priorität | Akzptanzkriterium
----|-----------|----------------------------------|-----------|------------------
1 | Der Kunde soll die Applikation zur Komprimierung von Bildern intuitiv bedienen können, damit er Zeit spart beim Komprimieren von Dateien. | 7 | 1 | Es sollen nicht mehr als drei Buttons auf einer Seite verwendet werden. Die Buttons sollen beschriftet sein, um eine intuitive 
2 | Der Kunde soll die Aktionen über eine intuitiv verständliche Benutzeroberfläche eingeben können, damit er vorher keinen Kurs belegen muss. | 5 | 1 | Buttons müssen unmissverständlich beschriftet sein.
3 | Die Bilddateien sollen direkt auf den Desktop gespeichert werden, damit der Benutzer keinen Dateipfad eingeben muss. | 2 | 1 | Der Speichervorgang wird vom Programm übernommen, ohne dass der Benutzer etwas eingeben muss.
4 | Während der potentiellen Wartezeit des Komprimiervorgangs soll der Kunde über die Aktion (also, dass das Programm komprimiert) informiert werden, damit er weiss, was das Programm macht. | 5 | 2 | Sobald eine Wartezeit entsteht, weil das Programm Daten verarbeitet, wird das mit einer «Progress Bar» angezeigt.
5 | Der Kunde soll eine Meldung auf dem Bildschirm erhalten, sobald der Komprimiervorgang abgeschlossen ist, damit der Kunde eine Bestätigung hat, dass seine Bilder komprimiert wurden. | 1 | 3 | Die Meldung soll kurz formuliert sein, aber klar vermitteln, dass der Komprimierungsvorgang abgeschlossen ist.
6 | Der Kunde soll die Komprimierungsgröße frei wählen können, um so mehrere Abstufungen der Komprimierung zu haben. | 1 | 1 | Es müssen 3 verschiedene Komprimierungsstufen zur Auswahl stehen, die der Kunde über einen Button anwählen kann.
7 | Der Kunde soll die Komprimierungsgröße frei wählen können, um so mehrere Abstufungen der Komprimierung zu haben. | 3 | 4 | Es müssen 3 verschiedene Komprimierungsstufen zur Auswahl stehen, die der Kunde über einen Button anwählen kann.
8 | Die Applikation soll eine Sprachauswahl beinhalten, damit sie für deutschsprachige sowie englischsprachige Benutzer einfach zu verstehen ist. | 5 | 4 | Auf dem Startfenster der Applikation soll der Kunde über einen Button die Sprache Deutsch oder Englisch auswählen können.

## Releaseplan

User Story | Release 1 | Release 2 | Release 3
-----------|-----------|-----------|----------
1 | X | |
2 | X | |
3 | | X |
4 | | X |
5 | | | X
6 | | | X
7 | | | X

### Kommentar zum Releaseplan

Der 3. Release kam nicht zu Stande, da wir für die beiden ersten Sprints mehr Zeit als erwartet benötigten. Vor allem die Komprimierung selbst und die Progress Bar erwiesen sich als zeitintensiver als erwartet. So werden die geplanten Storys zu unseren Zielen, die wir in einem darauffolgenden Projekt weiter ausbauen wollen.

## Sprint 1

Nr. | Task | User Story | Zeit Schätzung in h
----|------|------------|--------------------
1 | Bilder einlesen | 1 | 2
2 | Alle Bilder zum Komprimieren in Arraylist auflisten | 1 | 0,5
3 | Komprimierung der Bilddatei | 1 | 6
4 | Drag and Drop Bereich erstellen (2.Scene) | 2 | 1,5
5 | 2 Buttons und Label erstellen (2.Scene) | 2 | 0,5
6 | Zählerfunktion erstellen (2.Scene) | 2 | 1
7 | Start-Button (1.Scene)  | 2 | 1


