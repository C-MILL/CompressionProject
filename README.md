# **Java Bildkompression**


## Inhaltsverzeichnis

- [Einleitung](#einleitung)
- [Zielsetzung](#zielsetzung)
- [Randbedingung](#randbedingung)
- [Build-Anleitung](#build-anleitung)
- [User Stories](#user-stories)
- [Backlog](#backlog)
- [Releaseplan](#releaseplan)
    + [Kommentar zum Releaseplan](#kommentar-zum-releaseplan)
- [Sprints](#sprints)
  * [Sprint-Conditions](#sprint-conditions)
  * [Sprint 1](#sprint-1)
    + [Sprint 1 Planning Meeting](#sprint-1-planning-meeting)
      - [In Progress:](#in-progress)
    + [Sprint 1 Review](#sprint-1-review)
    + [Backlog 2](#backlog-2)
    + [Sprint 1 Code-Snippets](#sprint-1-code-snippets)
      - [DragAndDropController V0.1](#draganddropcontroller-v01)
      - [Neuer Ordner für komprimierte Bilder](#neuer-ordner-für-komprimierte-bilder)
      - [Bild komprimieren und neuer Bildname](#bild-komprimieren-und-neuer-bildname)
  * [Sprint 2](#sprint-2)
    + [Sprint 2 Planning Meeting](#sprint-2-planning-meeting)
      - [In Progress:](#in-progress-1)
    + [Scrum Halftime Meeting](#scrum-halftime-meeting)
    + [Sprint 2 Review](#sprint-2-review)
    + [Backlog 3](#backlog-3)
    + [Sprint 2 Code-snippets](#sprint-2-code-snippets)
      - [ProgressController](#progresscontroller)
      - [DragAndDropController Finale Version](#draganddropcontroller-finale-version)
      - [JUnit Test - Komprimierung](#junit-test---komprimierung)
    + [Klassen- und Sequenzdiagramm](#klassen--und-sequenzdiagramm)
      - [Klassendiagramm](#klassendiagramm)
      - [Sequenzdiagramm](#sequenzdiagramm)
- [Bedienungsanleitung](#bedienungsanleitung)
- [Fazit](#fazit)



## Einleitung

Das vorliegende Programm dient der Komprimierung von Bildern. Wir haben dieses Programm geschrieben, weil wir den Komprimierungsprozess vereinfachen wollen. Vor allem ältere Personen, die sich nicht mit komplizierten Computerprogrammen auskennen, haben öfters Probleme mit dem Komprimieren von Bildern.
Um das Komprimieren von Bildern für diese Zielgruppe zu vereinfachen, haben wir ein intuitives Programm erstellt. Die Komprimierung von Bildern bringt einen erheblichen Gewinn an Speicherplatz mit sich, da die Dateigröße der Bilder massiv reduziert wird. Im Hinblick auf Versendungen per E-Mail bringt die Komprimierung von Bildern auch erhebliche Vorteile.
Die Programmiersprache Java wurde ausgewählt, weil sie sowohl mit Windows, Mac als auch Linux kompatibel ist.


## Zielsetzung

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
1 | Der Kunde soll die Applikation zur Komprimierung von Bildern intuitiv bedienen können, damit er Zeit spart beim Komprimieren von Dateien. | 5 | 1 | Es sollen nicht mehr als drei Buttons auf einer Seite verwendet werden. Die Buttons sollen beschriftet sein, um eine intuitive Bedienung zu gewährleisten.
2 | Der Kunde soll alle Fotos einfach in ein Fenster ziehen können und das Programm soll dabei automatisch erkennen, welche Fotos komprimiert werden können und welche nicht. Der Nutzer soll dabei über Fehler benachrichtigt werden. Dabei soll ihm angezeigt werden, was nicht gut ist und mit welcher Datei etwas nicht stimmt. | 13 | 1 | Dateien können über ein Drag and Drop Fenster ausgewählt werden und das Programm muss automatisch erkennen, welche Dateien fehlerhaft sind.
3 | Der Kunde soll kleinere Dateien mit immer noch akzeptabler Qualität erhalten, ohne sich selber Gedanken zur Bildgrösse zu machen. | 8 | 1 | Die komprimierten Dateien müssen kleiner sein als die Originaldateien.
4 | Die Bilddateien sollen direkt auf dem Desktop gespeichert werden, damit der Benutzer keinen Dateipfad eingeben muss. | 8 | 1 | Der Speichervorgang wird vom Programm übernommen, ohne dass der Benutzer etwas eingeben muss.
5 | Während der potentiellen Wartezeit des Komprimiervorgangs soll der Kunde über die Aktion (also dass das Programm komprimiert) informiert werden, damit er weiss, was das Programm macht. | 8 | 2 | Sobald eine Wartezeit entsteht, weil das Programm Daten verarbeitet, wird das mit einer «Progress Bar» angezeigt.
6 | Der Kunde soll eine Meldung auf dem Bildschirm erhalten, sobald der Komprimiervorgang abgeschlossen ist, damit der Kunde eine Bestätigung hat, dass seine Bilder komprimiert wurden. | 5 | 3 | Die Meldung soll kurz formuliert sein, aber klar vermitteln, dass der Komprimierungsvorgang abgeschlossen ist.
7 | Der Kunde soll die Komprimierungsgröße frei wählen können, um so mehrere Abstufungen der Komprimierung zu haben. | 3 | 4 | Es müssen 3 verschiedene Komprimierungsstufen zur Auswahl stehen, die der Kunde über einen Button anwählen kann.
8 | Die Applikation soll eine Sprachauswahl beinhalten, damit sie für deutschsprachige sowie englischsprachige Benutzer einfach zu verstehen ist. | 5 | 4 | Auf dem Startfenster der Applikation soll der Kunde über einen Button die Sprache Deutsch oder Englisch auswählen können.

## Backlog
Story 1 | Grundgerüst erstellen für eine übersichtliche Oberfläche  | Zeitschätzung
----|------|--------------------
1.1 | Ordnerstruktur erstellen mit Maven. | 20 min
1.2 | Grundstruktur des Programmes schreiben, main-JavaFx klasse erstellen. | 20 min
1.3 | Willkommen Fenster mit SceneBuilder gestalten. | 20 min
1.4 | Die Controller Klasse für das Willkommensfenster erstellen. | 40 min
1.5 | Im Controller einen weiter Button erstellen, der die nächste Scene startet. | 40 min

Story 2 | Schritte, um das DragAndDrop Fenster zu realisieren  | Zeitschätzung
----|------|--------------------
2.1 | Ein DragAndDrop Fenster gestalten mit SceneBuilder. | 40 min
2.2 | Den DragAndDropController erstellen, der alle Drops in ein Array schreibt. | 80 min
2.3 | Mit SceneBuilder ein Fenster erstellen, welches für die Fehlermeldungen individuell genutzt werden kann. Das Fenster kann über einfache Handles geändert und angepasst werden. | 40 min 
2.4 | Eine Controller Klasse für die Fehlermeldungen schreiben. Darin soll man über eine Methode die Nachricht des Fehlers ändern können. Die Klasse soll einen Boolean zurückgeben. | 80 min
2.5 | Im DragAndDropController die Links auf nicht unterstützte Formate untersuchen und diese herausfiltern. Falls es nicht unterstützte Dateien gibt, soll der Nutzer informiert werden mithilfe eines Fehlerfensters. | 80 min
2.6 | Im DragAndDropController die Links auf Doppelgänger untersuchen und diese aussortieren. Falls es Doppelgänger gibt, soll der Nutzer über das Fehlerfenster darauf aufmerksam gemacht werden und entscheiden können, ob er die Datei trotzdem hinzufügen will oder nicht.| 80 min 
2.7 | Im DragAndDropController die verbleibenden Links in eine ArrayList schreiben. | 20 min
2.8 | Im DragAndDropController den Button so einrichten, dass er die Links in die Main-Klasse speichert und die nächste Scene startet. | 40 min 

Story 3 | Tasks, um die Komprimierung realisieren | Zeitschätzung
----|------|--------------------
3.1 | Eine Klasse erstellen, an die ein Link eines Fotos sowie der Link des Desktop Ordners weitergegeben werden kann für die Komprimierung. Darin soll eine Methode aufgerufen werden, die über den Link das Foto ladet, die Auflösung anpasst, das Bild komprimiert und im erstellten Ordner auf dem Desktop abspeichert. | 6 Stunden 
3.2 | JUnit Klasse erstellen, um zu testen ob das Bild tatsächlich kleiner wird. | 2 Stunden
3.3 | JUnit Klasse erstellen, um zu testen ob die Auflösung richtig angepasst wird. | 2 Stunden 

Story 4 | Tasks um die Abspeicherung auf dem Desktop zu realisieren | Zeitschätzung
----|------|--------------------
4.1 | Eine weitere Klasse erstellen, die auf dem Desktop einen Ordner erstellt, in dem die komprimierten Dateien abgelegt werden können. Die Klasse soll eine Methode haben, die den Ordner erstellt und den Link des Ordners zurückgibt. | 2 Stunden

Story 5 | Tasks für die Fortschrittanzeige realisieren | Zeitschätzung
----|------|--------------------
5.1 | Mit SceneBuilder ein Fenster erstellen, das den Fortschritt der Komprimierung anzeigt. Dafür soll es einen Ladebalken geben und ein schriftliche Information, die anzeigt, wie viele Fotos bereits komprimiert worden sind. | 40 min
5.2 | Controllerklasse für die Fortschrittseite erstellen. Sie soll sich automatisch aktualisieren, sobald ein Bild komprimiert wurde. | 40 min

Story 6 | Tasks für das Ende des Programmes realisieren | Zeitschätzung
----|------|--------------------
6.1 | Einen Button auf der Progressseite erstellen, der "Fertig" heisst und den man erst Drücken kann, wenn alle Fotos komprimiert wurden. | 40 min

Story 7 | Tasks für frei wählbare Komprimierungsgrösse realisieren | Zeitschätzung
----|------|--------------------
7.1 | Das Willkommensfenster erweitern mit einem zweiten Button, der "Fortgeschritten" heisst und den "Loslegen" Button umbenennen zu "Einfach". | 20 min
7.2 | Hinter dem "Einfach" Button soll das bisherige Programm laufen. | 2 Stunden
7.2 | Hinter dem "Fortgeschritten" Button soll eine neue Scene gestartet werden, auf der über zwei Labels die gewünschte Auflösung eingestellt werden. Danach soll per "OK" Button das normale Programm fortgeführt werden. | 2 Stunden
7.3 | Einen Button mit SceneBuilder erstellen, damit man zum DragANdDrop Fenster kommmt, um dann die Bilder in das Fenster zu ziehen. | 40 min

Story 8 | Tasks für die Sprachauswahl realisieren | Zeitschätzung
----|------|--------------------
8.1 | Ein Fenster mit SceneBuilder erstellen, wobei 2 Buttons mit der Beschriftung "Deutsch" und "Englisch" vorhanden sind. | 40 min
8.2 | Controllerklasse für das Sprachwahlfenster erstellen. Die Sprachauswahl kann aus dem Willkommensfenster aufgerufen werden. | 40 min
8.3 | Im Willkommensfenster einen Sprachauswahl Button erstellen. | 20 min
8.4 | Eine englische Version der Buttons und Labels erstellen und ins Programm einbinden.| 4 Stunden

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
8 | | | X


#### Kommentar zum Releaseplan

Der 3. Release kam nicht zu Stande, da für die ersten beiden Sprints mehr Zeit als erwartet benötigt wurde. Vor allem die Komprimierung selbst und die Progress Bar erwiesen sich als zeitintensiver als erwartet. So werden die geplanten Storys zu unseren Zielen, die wir in einem darauffolgenden Release weiter ausbauen wollen.


## Sprints
### Sprint-Conditions
Wir haben unsere Sprint's auf jeweils **fünf Stunden** festgelegt. Die Sprints werden von jedem Mitglied **individuell** durchgeführt. Das **Sprint Planning Meeting** wird somit anfangs der Woche, das **Daily Scrum Meeting** in der mitte der Woche und der **Sprint Review** am Freitag durchgeführt. Dies macht insofern Sinn, da teilweise Abhängigkeiten zwischen den verschiedenen Klassen bestehen und die Mitglieder auch nicht alle zur selben Zeit frei haben für die Sprints. Wir schätzen, dass unser Team jeweils 20 Story-Points behandeln kann pro Sprint. Dies ergibt 5 Storypoints pro Teammitglied. Da wir die Aufgaben gerne indiviudell bearbeiten, ist es unser Ziel, die Stories in möglichst kleine Pakete zu verpacken, damit der Aufwand möglichst klein und im Zeitraum eines Sprints zu erledigen bleibt. Dies setzt aber voraus, dass die Kommunikation sehr intensiv stattfindet, damit man die individuell erarbeiteten Teile dann auch zusammensetzen kann.

### Sprint 1
#### Sprint 1 Planning Meeting
Pro Sprint können wir 20 Story Punkte verarbeiten, was zwanzig Arbeitsstunden entspricht. Für den ersten Sprint haben wir uns aber etwas weniger eingeteilt, um zu sehen, ob wir mit unserer Zeiteinschätzung richtig liegen. Wir erwarten, dass die Zeiten zwar stimmen, aber nebst den realen Arbeitszeiten noch viele Stunden verloren gehen werden mit der Teamkommunikation sowie Merge Konflikten. Deshalb beeinhaltet der erste Sprint einen Workload von etwas weniger wie 17 Stunden.

##### In Progress:
Tasknummer| Taskbezeichnung | Zeitschätzung
----|------|--------------------
1.1 | Ordnerstruktur erstellen mit Maven. | 20 min
1.2 | Grundstruktur des Programmes schreiben, main-JavaFx klasse erstellen. | 20 min
1.3 | Willkommen Fenster mit Scene Builder gestalten. | 20 min
1.4 | Die Controller Klasse für das Willkommenfenster erstellen. | 40 min
1.5 | Im Controller einen weiter Button erstellen, der die nächste Scene startet. | 40 min
2.1 | Ein DragAndDrop Fenster gestalten mit SceneBuilder. | 40 min
2.2 | Den DragAndDropController erstellen, der alle Drops in ein Array schreibt. | 80 min
2.7 | Im DragAndDropController die verbleibenden Links in eine ArrayList schreiben. | 20 min
2.8 | Im DragAndDropController den Button so einrichten, dass er die Links in die Main-Klasse speichert und die nächste Scene startet. | 40 min 
3.1 | Eine Klasse erstellen, an die ein Link eines Fotos sowie der Link des Desktop-Ordners weitergegeben werden kann für die Komprimierung. Darin soll eine Methode aufgerufen werden, die über den Link das Foto ladet, die Auflösung anpasst und das Bild komprimiert sowie im erstellten Ordner auf dem Desktop abspeichert. | 6 Stunden 
4.1 | Eine weitere Klasse erstellen, die auf dem Desktop einen Ordner erstellt, in dem die komprimierten Dateien abgelegt werden können. Die Klasse soll eine Methode haben, die den Ordner erstellt und den Link des Ordners zurückgibt. | 2 Stunden
6.1 | Einen Button auf der Progressseite erstellen, der "Fertig" heisst und den man erst Drücken kann, wenn alle Fotos komprimiert wurden. | 40 min
 |         | Total: 14h 40min

#### Sprint 1 Review
Wir konnten im ersten Sprint alle Tasks erfüllen. Es muss aber gesagt werden, dass die geschätzten Zeiten **immer** überschritten wurden und jedes Teammitglied Überstunden leisten musste. Somit ist die To Do Liste des ersten Sprints nun eine Done Liste. 

#### Backlog 2

Story 2 | Schritte, um das DragAndDrop Fenster zu realisieren  | Zeitschätzung
----|------|--------------------
2.3 | Mit SceneBuilder ein Fenster erstellen, welches für die Fehlermeldungen individuell genutzt werden kann und welches über einfache Handles geändert und angepasst werden kann. | 40 min 
2.4 | Eine Controller Klasse für die Fehlermeldungen schreiben. Darin soll über eine Methode die Nachricht des Fehlers geändert werden können. Die Klasse soll einen Boolean zurückgeben. | 80 min
2.5 | Im DragAndDropController die Links auf nicht unterstützte Formate untersuchen und diese herausfiltern. Falls es nicht unterstützte Dateien gibt, soll der Nutzer informiert werden mittels eines Fehlerfensters. | 80 min
2.6 | Im DragAndDropController die Links auf Doppelgänger untersuchen und diese aussortieren. Falls es Doppelgänger gibt, soll der Nutzer über das Fehlerfenster darauf aufmerksam gemacht werden und entscheiden können, ob er die Datei trotzdem hinzufügen will oder nicht.| 80 min 

Story 3 | Tasks, um die Komprimierung realisieren | Zeitschätzung
----|------|--------------------
3.2 | JUnit Klasse machen um zu testen, ob das Bild tatsächlich kleiner wurde. | 2 Stunden
3.3 | JUnit Klasse machen um zu testen, ob die Auflösung richtig angepasst wurde. | 2 Stunden 

Story 5 | Tasks für die Fortschrittanzeige realisieren | Zeitschätzung
----|------|--------------------
5.1 | Mit Scene Builder ein Fenster erstellen, das den Fortschritt der Komprimierung anzeigt. Dafür soll es einen Ladebalken geben und eine schriftliche Information, die anzeigt, wie viele Fotos bereits komprimiert wurden. | 40 min
5.2 | Controllerklasse für die Fortschrittseite erstellen. Sie soll sich automatisch aktualisieren, sobald ein Bild komprimiert wurde. | 40 min

Story 7 | Tasks für frei wählbare Komprimeirungsgrösse realisieren | Zeitschätzung
----|------|--------------------
7.2 | Hinter dem "Einfach" Button soll das bisherige Programm laufen. | 2 Stunden
7.2 | Hinter dem "Fortgeschritten" Button soll eine neue Scene starten, auf der man über zwei Labels die gewünschte Auflösung einstellen kann. Danach soll per "OK" Button das normale Programm fortgeführt werden können. | 2 Stunden
7.3 | Einen Button mit SceneBuilder erstellen, damit das DragANdDrop Fenster aufgerufen werden kann, um dann die Bilder ins Fenster zu ziehen. | 40 min

Story 8 | Tasks für die Sprachauswahl realisieren | Zeitschätzung
----|------|--------------------
8.1 | Ein Fenster mit SceneBuilder erstellen, wobei 2 Buttons mit der Beschriftung "Deutsch" und "Englisch" vorhanden sind. | 40 min
8.2 | Controllerklasse für das Sprachwahlfenster erstellen. Dabei soll die Sprachauswahl aus dem Willkommensfenster aufgerufen werden können. | 40 min
8.3 | Im Willkommensfenster einen Sprachauswahl Button erstellen. | 20 min
8.4 | Eine englische Version der Buttons und Labels erstellen und ins Programm einbinden.| 4 Stunden

#### Sprint 1 Code-Snippets


##### DragAndDropController V0.1
Dies ist der Teil des Codes der reagiert, sobald eine Datei in das Fenster gezogen wird. Hier sind noch keine Kontrollmechanismen eingebaut, die überprüfen ob dieses Dateiformat unterstützt wird oder nicht.

```ruby
 	@FXML
	private void handleDragDropped(DragEvent event) {
 		Dragboard DragboardLinks = event.getDragboard();
		String somelinks = DragboardLinks.getFiles().toString();					
		somelinks= somelinks.substring(1, (somelinks.length()-1));
		String[] linkarray=somelinks.split(", ")	;	
		for(int i =0; i<linkarray.length;i++) {
		links.add(linkarray[i]);
		}
		labelNumberToCompress.setText(Integer.toString(links.size()));	
	}
 ```
 Zuerst wird alles in einem Dragboard gespeichert und dann in einen einzelnen String gespeichert. 
 
 ```ruby
 		Dragboard DragboardLinks = event.getDragboard();
		String somelinks = DragboardLinks.getFiles().toString();					
	}
 ```
 
 Danach wird der Anfang und das Ende abgeschnitten, da dort jeweils noch ein Anführungszeichen steht.
 ```ruby				
		somelinks= somelinks.substring(1, (somelinks.length()-1));
	}
 ```
 
 
 Dann wird der Rest des Strings in die einzelnen Links gesplitted und in einem Array gespeichert. Das Array wird dann der ArrayList mit einer for Schleife hinzugefügt.
 ```ruby
		String[] linkarray=somelinks.split(", ")	;	
		for(int i =0; i<linkarray.length;i++) {
		links.add(linkarray[i]);
		}
	}
 ```
 
 Zum Schluss wird die Variable, die angibt wie viele Links bereits der Liste hinzugefügt wurden, gesetzt.
 ```ruby
		labelNumberToCompress.setText(Integer.toString(links.size()));	
	}
 ```
 
 
 
 
 
##### Neuer Ordner für komprimierte Bilder

```ruby

public class createNewFolder {

	public String createFolder() {
		String linkOfNewFolder = null;

		try {

			// Gets todays Date
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
			LocalDateTime today = LocalDateTime.now();


			// Gets users home directory and splits it at Desktop
			// Creates new folder with e.g. following path: C:\Users\mkaun\Desktop\Compressed 2018.12.14
			String path = System.getProperty("user.home") + File.separator + "Desktop";
			path += File.separator + "Compressed Images " + dtf.format(today);
			File customDir = new File(path);
			customDir.mkdirs();
			linkOfNewFolder = path.replace("\\","/");
			System.out.println(linkOfNewFolder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return linkOfNewFolder;
	}
}

```

Die Klasse createFolder() erstellt einen neuen Ordner auf dem Desktop des Benutzers. Dazu wird das Home-Verzeichnis des Benutzers bestimmt und der Pfad für den Desktop mit der Funktion File.separator definiert. Danach wird diesem Pfad der Ordnername «Compressed Images Datum» hinzugefügt. Das aktuelle Datum wird am Anfang der Methode bestimmt. Als letztes wird eine Datei mit dem neuen Pfad erstellt und mit dem Befehl mkdirs() der Ordner im Ziel des Pfades hergestellt. Der Pfad des neuen Ordners wird von der Methode für weitere Zwecke übergeben. 


##### Bild komprimieren und neuer Bildname

```ruby

public class compress {

	Main main = new Main();
	public compress() {
	}
	//Constructor 1 -> Default program functionality
	public compress(String linkOfFile, String linkOfNewFolder) {

		// initialize Image
		Image image;
		try {
			// reads image from path input
			image = new ImageIcon(ImageIO.read(new File(linkOfFile))).getImage();
			// gets file path and saves it to f (important for further file processing)
			File f = new File(linkOfFile);

			// Extracts file name from file path
			String originalImageName = f.getName();

			// Removes file extension (.jpg / .jpeg / etc) -> important so that the newly created images all have the same file extension.
			int pos = originalImageName.lastIndexOf(".");
			String onlyImageName = originalImageName.substring(0, pos);

			// Creates the image name for the exported, compressed image
			String newImageName = onlyImageName + "_compr";

```

Das obige Code-snippet aus der Klasse «compress.java» zeigt, wie der Pfad des hinzugefügten Bildes, sowie der Ordner, der für die Komprimierung neu angelegt wird, der Methode «compress()» als Konstruktor hinzugefügt wird. Aus dem Pfad des hinzugefügten Bildes wird der Name des Bildes ausgelesen. Es wird daraufhin ein neuer Dateiname für das zu komprimierende Bild nach dem Format «alter Dateiname + _compr» generiert. 

```ruby
			//Get resolution of image and divide trough 2
			int newheight=(image.getHeight(null));
			int newWidth = (image.getWidth(null));
			if(image.getHeight(null)>2*1080) {
				newheight=(image.getHeight(null))/2;
				newWidth = (image.getWidth(null))/2;
			}

			//Compress
			Image scaledImage = image.getScaledInstance(newWidth, newheight,Image.SCALE_SMOOTH);
			BufferedImage outImg = new BufferedImage(newWidth, newheight,BufferedImage.TYPE_INT_RGB);

			//Does some stuff 
			Graphics g = outImg.getGraphics();
			g.drawImage(scaledImage, 0, 0, null);
			g.dispose();

			// Writes compressed image to the newly generated folder with the newly generated filename.
			ImageIO.write(outImg, "jpeg", new File(linkOfNewFolder + "/"+newImageName + ".jpeg"));

		} catch (IOException e) {
			e.printStackTrace();
		}}

	//Constructor 2 for extended functionality
	public compress(String linkOfFile, String linkOfNewFolder, int width, int height) {
	}

	//Constructor 3 for extended functionality
	public compress(String linkOfFile, String linkOfNewFolder, int maxSizeOfFile) {
	}
```

Dieses Code-snippet zeigt, wie das eingelesene Bild komprimiert und danach im neu generierten Ordner mit dem neu generierten Dateinamen abgespeichert wird. Es wird dabei zuerst die Höhe und Breite des Bildes ausgelesen. Falls die Höhe des Bildes unterhalb der doppelten Full-HD Auflösung liegt, wird das Bild nicht komprimiert, da die Bildqualität ansonsten nicht auf einem akzeptablen Niveau wäre. Wenn die Bildhöhe grösser als 2160 Pixel ist, wird das Bild im weiteren Verlauf komprimiert. Dabei wird die Bildhöhe halbiert und das Bild entsprechend skaliert. Das komprimierte Bild besitzt damit immer eine Auflösung, die mindestens der Full-HD Auflösung entspricht. Danach wird das komprimierte Bild generiert. Das neue Bild wird danach als «jpeg» Datei im neu generierten Ordner auf dem Desktop unter dem neuen Bildnamen abgelegt. Es existieren weitere Konstruktoren, die erweiterte Funktionalitäten beim nächsten Release bieten werden. So soll für professionellere Anwender die Möglichkeit geschaffen werden, das Bild nach einer genauen Eingabe der Pixel oder nach der maximal erwünschten Dateigrösse zu komprimieren. 


### Sprint 2

#### Sprint 2 Planning Meeting
In diesem Sprint haben wir einen Workload von 17 Stunden. Dies ist noch mehr als im letzten Sprint. Da wir nun aber eingespielter sind und uns mit SceneBuilder besser auskennen, hoffen wir, dass wir schneller Fortschritte machen.

##### In Progress:
Tasknummer| Taskbezeichnung | Zeitschätzung
----|------|--------------------
2.3 | Mit SceneBuilder ein Fenster erstellen, welches für die Fehlermeldungen individuell genutzt werden kann und welches über einfache Handles geändert und angepasst werden kann. | 40 min 
2.4 | Eine Controller Klasse für die Fehlermeldungen schreiben. Darin soll über eine Methode die Nachricht des fehlers geändert werden können. Die Klasse soll einen Boolean zurückgeben. | 80 min
2.5 | Im DragAndDropController die Links auf nicht unterstützte Formate untersuchen und diese herausfiltern. Falls es nicht unterstützte Dateien gibt, soll der Nutzer informiert werden über ein Fehlerfenster. | 80 min
2.6 | Im DragAndDropController die Links auf Doppelgänger untersuchen und diese aussortieren. Falls es Doppelgänger gibt, soll der Nutzer über das Fehlerfenster darauf aufmerksam gemacht werden und entscheiden können, ob er die Datei trotzdem hinzufügen will oder nicht.| 80 min 
3.2 | JUnit Klasse machen, um zu testen, ob das Bild tatsächlich kleiner wurde. | 2 Stunden
3.3 | JUnit Klasse machen, um zu testen, ob die Auflösung richtig angepasst wurde. | 2 Stunden 
5.1 | Mit Scene Builder ein Fenster erstellen, das den Fortschritt der Komprimierung anzeigt. Dafür soll es einen Ladebalken geben und ein schriftliche Information, die anzeigt, wie viele Fotos bereits komprimiert wurden. | 40 min
5.2 | Controllerklasse für die Fortschrittsseite erstellen. Sie soll sich automatisch aktualisieren, sobald ein Bild komprimiert wurde. | 40 min
7.2 | Hinter dem "Einfach" Button soll das bisherige Programm laufen. | 2 Stunden
7.2 | Hinter dem "Fortgeschritten" Button soll eine neue Scene gestartet werden, auf der über zwei Labels die gewünschte Auflösung eingestellt werden kann. Danach soll per "OK" Button das normale Programm fortgesetzt werden können. | 2 Stunden
7.3 | Einen Button mit SceneBuilder erstellen, damit man zum DragAndDrop Fenster kommmt, um dann die Bilder in das Fenster zu ziehen. | 40 min
8.1 | Ein Fenster mit SceneBuilder erstellen, wobei 2 Buttons mit der Beschriftung "Deutsch" und "Englisch" vorhanden sind. | 40 min
8.2 | Controllerklasse für das Sprachwahlfenster erstellen. Wobei die Sprachauswahl aus dem Willkommensfenster aufgerufen werden kann. | 40 min
8.3 | Im Willkommensfenster einen Sprachauswahl Button erstellen. | 20 min
8.4 | Eine englische Version der Buttons und Labels erstellen und ins Programm einbinden.| 4 Stunden

#### Scrum Halftime Meeting
In der Hälfte des Sprints haben wir festgestellt, dass die ProgressBar unserem Team erhebliche Schwierigkeiten bereitet. Nach 10 Arbeitsstunden funktioniert sie aber. Da uns diese 10 Stunden nun fehlen, müssen wir die zwei letzten Stories (7 und 8) auf einen zukünftigen Sprint verschieben, was jedoch nicht schlimm ist, da diese Stories unser Grundprogramm nicht beeinflusst. 


#### Sprint 2 Review
Rückblickend hat uns dieser Sprint unerwartet viel Zeit gekostet und dementsprechend ist der Backlog weniger geschrumpft als bei unserem ersten Sprint. Insofern sind wir froh, dass wir zu Beginn der Sprints eine Priorisierung gemacht haben und in diesem Sinne auch wirklich das wichtigste am Anfang gemacht haben und nicht bspw. mit der Sprachauswahl begonnen haben.

#### Backlog 3

Story 7 | Task für frei wählbare Komprimierungsgrösse realisieren | Zeitschätzung
----|------|--------------------
7.2 | Hinter dem "Einfach" Button soll das bisherige Programm laufen. | 2 Stunden
7.2 | Hinter dem "Fortgeschritten" Button soll eine neue Scene starten auf der über zwei Labels die gewünschte Auflösung eingestellt werden kann. Danach soll mittels "OK" Button das normale Programm fortgesetzt werden können. | 2 Stunden
7.3 | Einen Button mit SceneBuilder erstellen, damit man zum DragAndDrop Fensert kommmt, um dann die Bilder in das Fenster ziehen zu können. | 40 min

Story 8 | Task für die Sprachauswahl realisieren | Zeitschätzung
----|------|--------------------
8.1 | Ein Fenster mit SceneBuilder erstellen, wobei 2 Buttons mit der Beschriftung "Deutsch" und "Englisch" vorhanden sind. | 40 min
8.2 | Controllerklasse für das Sprachwahlfenster erstellen. Die Sprachauswahl soll aus dem Willkommensfenster aufgerufen werden können. | 40 min
8.3 | Im Willkommensfenster einen Sprachauswahl Button erstellen. | 20 min
8.4 | Eine englische Version der Buttons und Labels erstellen und ins Programm einbinden.| 4 Stunden


#### Sprint 2 Code-snippets


##### ProgressController
Dieser Teil des Programmes stellt die grösste Herausforderung dieses Projektes dar. Die Scene mit der ProgressBar soll laufend aktualisiert werden. Damit dies funktioniert, muss mit Threads gearbeitet werden. Es wurden insgesamt mehr als 10 Stunden Arbeit in diese Klasse investiert. Die erste Idee bestand daraus, für jede Aktualisierung einen neuen Thread zu erstellen, der dann in eine Warteschlange gesteckt wird. Dies hat so nicht funktioniert. Nach einigen Versuchen konnte die Progress Bar dann zum Laufen gebracht werden. Es wird nun nur ein Task ausgeführt, der sowohl die ProgressBar aktualisiert, als auch die Scene ändert und am Ende den "Fertig" Button aktiviert. Wir vermuten, dass die Scene nicht wie überlicherweise nach und nach aktualisiert wird, sondern dass die For Schleife dominanter ist und deshalb nur ein einzelner Thread gestartet werden muss. Da die For Schleife nun aber in einem Thread ist, wird der Thread beiseite geschoben und zuerst die Scene aktualisiert, bevor der Thread wieder hervorgenommen und weiter bearbeitet wird.

	
```ruby
	public void setProgressBar(ArrayList<String> link, String linkOfNewFolder) {
		this.links=link;
		this.linkOfNewFolder=linkOfNewFolder;
		progressBar.progressProperty().unbind();
        progressBar.setProgress(0);
        copyWorker = createWorker();
        progressBar.progressProperty().bind(copyWorker.progressProperty());
        copyWorker.messageProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });

        new Thread(copyWorker).start();
        
        
	}
	
	
	public Task createWorker() {
        return new Task() {
            @Override
            protected Object call() throws Exception {
                for (i = 0; i < numberToDo; i++) {
                    Thread.sleep(5);
                    updateMessage("5 milliseconds");
                    updateProgress(i+1, numberToDo);
                    new compress(links.get(i), linkOfNewFolder);
                    
                    Platform.runLater(new Runnable() {
                        public void run() {
                        	doneLabel.setText(i+"");
                        	if(i==numberToDo) {
                        		infoLabel.setText("Komprimierung war erfolgreich.");
                        	}
                        }
                  });
                }
                finishButtonDisabled(false);
                
                return true;
            }
        };
    }
```    
    
    
##### DragAndDropController Finale Version
Diese Methode, die aufgerufen wird, sobald etwas in die Drop-Area gezogen wird, hat sich im zweiten Sprint sehr verändert. Der erste Teil wird hier ich nicht mehr präzisiert, da er schon nach dem ersten Sprint erklärt wurde.
	
```ruby
	@FXML
	private void handleDragDropped(DragEvent event) throws IOException {
		Dragboard DragboardLinks = event.getDragboard();
		String somelinks = DragboardLinks.getFiles().toString();
		somelinks= somelinks.substring(1, (somelinks.length()-1));		
		String[] linkarray=somelinks.split(", ");	

		for(int i =0; i<linkarray.length;i++) {
			for(int j=0; j<links.size(); j++) {
				if(linkarray[i].equals(links.get(j))){
					alreadyCatched=true;
					}
				}
			if(alreadyCatched==true) {
				setDragAndDropButtonOk(true);
				File f = new File(linkarray[i]);
				String originalImageName = f.getName();
				main.error("Dieses Foto wird bereits konvertiert, willst du es nochmals hinzufügen?",originalImageName);
				
			}
			if(alreadyCatched==false) {
				if(
						linkarray[i].endsWith(".jpg")||
						linkarray[i].endsWith(".Jpg")||
						linkarray[i].endsWith(".Jpeg")||
						linkarray[i].endsWith(".jpeg")||
						linkarray[i].endsWith(".gif")||
						linkarray[i].endsWith(".GIF")||
						linkarray[i].endsWith(".PNG")||
						linkarray[i].endsWith(".png")||
						linkarray[i].endsWith(".XBM")||
						linkarray[i].endsWith(".xbm")||
						linkarray[i].endsWith(".tiff")||
						linkarray[i].endsWith(".TIFF")){
							links.add(linkarray[i]);
				}else {
					File f = new File(linkarray[i]);
					String originalImageName = f.getName();
					main.error(("Wollen sie die Datei: "+originalImageName+" trotzdem hinzufügen?"),"Bitte wählen sie nur Fotos mit der Dateiendung jpg, jpeg, png oder gif.");
				
				}
				
				
			}
			alreadyCatched=false;
			setDragAndDropButtonOk(false);
		}
		labelNumberToCompress.setText(links.size()+" Fotos wurden bereits hinzugefügt.");	//set label
		infoLabel.setText("Sie können weiterhin beliebig viele Fotos hinzufügen.");	//set label

	}
```


Hier zu sehen ist eine Verkettung von zwei For Schleifen. Sie sollen die bereits gespeicherten Links mit den Links vergleichen, die neu dazukommen. 

```ruby

		for(int i =0; i<linkarray.length;i++) {
			for(int j=0; j<links.size(); j++) {
```
Wenn eine Datei den genau gleichen Link hat, wie ein bereits gespeicherter Link, dann wird die Variable alreadyCatched auf true gesetzt.
			
```ruby
				if(linkarray[i].equals(links.get(j))){
					alreadyCatched=true;
					}
				}
				
```
Ist die Datei schon vorhanden, wird ein ERROR ausgeführt, welcher das Error Fenster aufruft und den OK Button deaktiviert, damit der Benutzer nicht weitergehen kann, während der Fehler besteht. Dies würde zu einem Programmabsturz führen.
	
```ruby
			if(alreadyCatched==true) {
				setDragAndDropButtonOk(true);
				File f = new File(linkarray[i]);
				String originalImageName = f.getName();
				main.error("Dieses Foto wird bereits konvertiert, willst du es nochmals hinzufügen?",originalImageName);
				
			}
```

			
Wenn der Benutzer im Error Fenster bestimmt hat, wie er fortfahren möchte oder wenn gar kein alreadyCatched vorliegt, wird in dieser if Schlaufe überprüft, ob die Datei ein kompatibles Dateiformat besitzt. Wenn nicht, könnte es auch zu einem Programmabsturz führen. Hier wird auch wieder eine Error Meldung aufgerufen, in der der Benutzer gefragt wird, ob er die Datei trotzdem speichern möchte.


```ruby
			if(alreadyCatched==false) {
				if(
						linkarray[i].endsWith(".jpg")||
						linkarray[i].endsWith(".Jpg")||
						linkarray[i].endsWith(".Jpeg")||
						linkarray[i].endsWith(".jpeg")||
						linkarray[i].endsWith(".gif")||
						linkarray[i].endsWith(".GIF")||
						linkarray[i].endsWith(".PNG")||
						linkarray[i].endsWith(".png")||
						linkarray[i].endsWith(".XBM")||
						linkarray[i].endsWith(".xbm")||
						linkarray[i].endsWith(".tiff")||
						linkarray[i].endsWith(".TIFF")){
							links.add(linkarray[i]);
				}else {
					File f = new File(linkarray[i]);
					String originalImageName = f.getName();
					main.error(("Wollen sie die Datei: "+originalImageName+" trotzdem hinzufügen?"),"Bitte wählen sie nur Fotos mit der Dateiendung jpg, jpeg, png oder gif.");
				
				}
				
```
				
				
Am Ende wird der Text gesetzt, der dann im Fenster angezeigt wird.

```ruby
			}
			alreadyCatched=false;
			setDragAndDropButtonOk(false);
		}
		labelNumberToCompress.setText(links.size()+" Fotos wurden bereits hinzugefügt.");	//set label
		infoLabel.setText("Sie können weiterhin beliebig viele Fotos hinzufügen.");	//set label

	}
	
```

##### JUnit Test - Komprimierung

```ruby
	@Test
	public void testCompressResolutionResizingToSmallResolution() throws IOException { 
		try {
			new compress(linkOfSmallFile, "./src/test/resources/testCompressed");
			smallImage= new ImageIcon(ImageIO.read(new File(linkOfSmallFile))).getImage();
			smallCompressedImage  = new ImageIcon(ImageIO.read(new File(linkOfSmallCompressedFile))).getImage();
			assertEquals(smallImage.getHeight(null), smallCompressedImage.getHeight(null), "The small images got compressed, even though they should not get compressed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testCompressResolutionResizingBigFile() throws IOException { 
		try {
			new compress(linkOfBigFile, "./src/test/resources/testCompressed");
			bigImage= new ImageIcon(ImageIO.read(new File(linkOfBigFile))).getImage();
			bigCompressedImage  = new ImageIcon(ImageIO.read(new File(linkOfBigCompressedFile))).getImage();
			assertEquals(bigImage.getHeight(null)/2, bigCompressedImage.getHeight(null), "The small images got compressed, even though they should not get compressed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
```

Das Code-snippet oberhalb zeigt einen Teil des Codes aus dem JUnit-Test, der verwendet wird, um zu testen, ob die Bilddateien komprimiert wurden. Der Test unterscheidet kleine (small) Bilder und grosse (big) Bilder. Dabei ist die Pixelanzahl entscheidend, ob das Bild klein oder gross ist. Wenn das Bild weniger als 1080 Pixel (1080 Pixel = full HD Auflösung) misst, ist es klein und wird nicht komprimiert. Die Idee dahinter ist, dass die Bilder nicht zu stark komprimiert werden und dann irgendwann eine schlechte Qualität bekommen. Für den Test wurde ein kleines und ein grosses Bild genommen und mit dem Programm komprimiert und dann über den Dateipfad in den Test eingelesen.  Beim ersten Test wird geprüft, ob das kleine Bild nicht komprimiert wird, weil es ja zu klein zum Komprimieren ist. Beim zweiten Test wird geprüft, ob das Bild komprimiert wird. Diese Tests werden mit Hilfe von «assertEquals» gemacht. Dabei wird geprüft, ob das erwartete Ergebnis mit dem Programmoutput übereinstimmt.


#### Klassen- und Sequenzdiagramm

##### Klassendiagramm

![](https://github.com/atorha/CompressionProject/blob/master/Images/Class_Diagramm.JPG)

##### Sequenzdiagramm

![](https://github.com/atorha/CompressionProject/blob/master/Images/Sequence_diagram.jpg)


## Bedienungsanleitung

![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_1.jpg)

Das Programm ermöglicht das Komprimieren von Bildern. Beim Komprimieren wird die Bildgröße halbiert. Dies ist nützlich, wenn beispielsweise mehrere Bilder per Email versandt werden sollen.
Um das Programm zu starten, drücken Sie auf den Button «Loslegen».

![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_2.jpg)
![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_6.JPG)

Durch das Drücken des «Loslegen» Buttons öffnet sich ein neues Fenster. Ziehen Sie mit Hilfe von Drag-and-Drop alle Bilder, die Sie komprimieren wollen, in das Feld in der Mitte des Fensters. (Drag-and-Drop: Bilder auswählen und mit der Maus ins Fenster ziehen) Falls Sie das gleiche Bild mehrmals in das Fenster ziehen, erscheint eine Fehlermeldung. In der Fehlermeldung werden Sie gefragt, ob Sie das Bild tatsächlich ein zweites Mal hinzufügen und komprimieren wollen.

![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_3.jpg)

Nachdem die ersten Bilder in das Fenster gezogen worden sind, wird angezeigt wie viele Bilder zum komprimieren vorliegen. Falls noch weitere Bilder komprimiert werden sollen, kann man diese weiterhin in das Fenster ziehen. Sobald Sie alle Ihre Bilder in das Fenster gezogen haben, können sie auf den «OK» Button drücken, um den Komprimierprozess zu starten. Durch den «Cancel» Button können Sie das Programm beenden, ohne dass die Bilder komprimiert werden.

![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_4.jpg) 
![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_5.jpg)

Wenn Sie auf «OK» gedrückt haben, werden die Bilder komprimiert. Dabei wird Ihnen anhand eines Ladebalkens angezeigt, wie weit das Programm mit dem Komprimieren ist.
Die komprimierten Bilder werden nach dem Komprimieren in einem neuen Ordner auf dem Desktop gespeichert. Der neue Ordner ist folgendermaßen benannt «Compressed Images YYYY.MM.DD». Die komprimierten Bilder haben den ursprünglichen Dateinamen übernommen, jedoch wird das Kürzel «_compr» angehängt, damit erkannt werden kann, dass es sich dabei um die komprimierten Bilder handelt.


## Fazit

Im Rahmen dieser Arbeit konnten die Grundprinzipien der Entwicklungsprogramme Eclipse, Maven und Git erarbeitet und mit einer vertieften Anwendungsbasis von Java verknüpft werden. Das erstellte Programm zur Komprimierung von Bildern hat die ursprünglichen Erwartungen übertroffen. Die Komprimierung von Bildern wurde durch diese Software tatsächlich stark vereinfacht und arbeitet nun kombiniert mit einer grafischen Oberfläche und diversen Sicherheitsfeatures, wie etwa der Dateierweiterungsbegrenzung oder dem Schutz vor duplizierten Dateien zuverlässig. Durch zwei realisierten Sprints konnten die meisten Anforderungen an das Programm bereits implementiert werden. Einige Komponenten des Programms erwiesen sich während der Realisierung als Zeitintensiver als geplant. Vor allem die Möglichkeit zur Anzeige des Programmfortschritts in Form einer Progress Bar gestaltete sich als schwierig, da diese die Implementierung von Threads erforderte. In kommenden Releases werden noch verbliebene Anforderungen an das Programm hinzugefügt. Wichtigste Neuerungen werden sein, dass das Programm auf allen Betriebssystemen lauffähig sein wird, dass die Sprache zwischen Englisch und Deutsch gewechselt werden kann und dass die Komprimierungsgrösse nach entsprechenden Kriterien frei wählbar sein wird.

Wir möchten uns an dieser Stelle ganz herzlich bei unserem Betreuer, Herrn Matthias Bachmann, bedanken für die kontinuierliche Hilfeleistungen und im Besonderen für seine nützlichen Inputs zur Erstellung von Threads. 

Mit unserer Arbeit sind wir zufrieden, da das Programm tatsächlich Gebrauch findet und einen erheblichen Mehrwert darstellt bei unserer Zielgruppe, die ansonsten nicht von einer einfachen Bildkomprimierung profitieren könnte. Durch das Arbeiten in einem Team konnten wir uns in die Sichtweise der Programmierer grosser Softwares versetzen und haben auch verstanden, inwiefern User Stories, Tasks und Sprints zu einem effizienteren Arbeiten gemäss Software Engineering beitragen können. 



> Christof Müller

> Irene Näf

> Mikaela Kaunisaho

> Nicolas Krüsi

