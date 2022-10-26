Praktikum: Git Einführung
	Datum: 24 Okt 2022

Ziel für heute:
Grundbegriff und Kommandos von git
Pull Request Workflow von github
Jede*r soll heute einen Pull Request im Spiel-Repository https://github.com/slengfeld/guessing-game gemergt haben.

Übersicht von Git:

Git ist ein verteiltes Versionskontrollsystem. Defacto-Standard in der Softwareentwicklung. Gestartet von Linus Torvalds.
Alternativen: Subversion(SVN), Mercurial, …
Github ist eine Hosting Plattform für Git Repositories und für das kollaborative Zusammenarbeiten an Software-Projekten (Issue/Bug Tracker, Wiki, Pull Requests, …).
Alternativen: Gitlab, Gerrit, Patches und Mailinglisten (Linux Kernel), Azure DevOps, Bitbucket, …

Grundbegriffe:
Repository: Enthält den Sourcecode und die Historie
Checkout: Wenn ein Repository auf dem lokalen Rechner geklont ist.
Commits: Enthalten die Änderungen am Source Code des Projekts. Können mit `git add` und `git commit` erstellt werden.
Branches: Entwicklungszweige der Projekthistorie.
Etwas “pull’en”/”klonen”: Änderungen vom Repository auf github auf dem lokalen Rechner verschrieben.
Einen Branch “pushen”: Änderungen an der lokalen Klone des Repositories nach github verschieben.


Git-Crashkurs: https://github.com/CrystalGamma/git-crashkurs

Installation von git:
Installation https://git-scm.com/book/en/v2/Getting-Started-Installing-Git:

Falls das nicht geht: Fancy alternative: https://desktop.github.com/

Optional: Installation von Python
Installation https://www.python.org/downloads/

Alternative: Ausführen des Scripts im Webbrowser: https://www.online-python.com/

Und los Gehts:

Github Account erstellen: https://github.com/signup?user_email=&source=form-home-signup 
Repository clonen https://github.com/slengfeld/guessing-game
Lokalen branch erstellen
Änderungen am Source code machen
Änderungen committen. (“git add <dateiname>” und dann “git commit”)
Repository in github forken. 
Auf die Webseite https://github.com/slengfeld/guessing-game gehen und oben rechts auf “fork” und dann auf “create a fork” klicken.
Create Personal Access Token: https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token 
Dort der Anleitung Creating a fine-grained personal access token folgen.
  *  Token nur das eine repository verfügbar machen. Only select repositories 
  *  Dann Repository permissions für Contents auf read/write setzen
Das kann als Passwort für das Pushen verwendet werden.
Token zwischenspeichern, damit es nicht verloren geht.
(Als alternative zu SSH keys (falls ihr das schon kennt))
Neuen remote hinzufügen: Dazu die HTTP-URL von eure Fork repository kopieren und 
  git remote add github <url>
ausführen.
Lokalen branch pushen mit 
   git push github 
Hier wird nach dem Benutzernamen und Password gefragt. Benutzername ist egal. Einfach “test” schreiben und bei Password das Personal Access Token per copy&paste einfügen.
In dem Fork repository auf github einen Pull Request erstellen
Warten bis er gemergt oder es Kommentare auf den Pull Request gibt.
Kommandos:

git clone https://github.com/slengfeld/guessing-game.git

cd guessing-game

git status       # Anzeigen von lokalen Änderungen im Checkout. Sollte noch keine Änderungen anzeigen.

Windows Explorer öffnen und unter C:\Benutzer\[Namen]\guessing-game die Dateien anschauen bzw. ändern.

README.md enthält die Ideen für die Tasks



git branch main-my-changes  origin/main    # Erstelle einen neuen Branch

git checkout main-my-changes     # Wechselt auf diesen branch

git status    # Sollte jetzt den neuen branch “main-my-changes” anzeigen.

# Änderung an den Dateien machen

git add <dateiname>   # Änderungen in einer Datei 

git commit    # Die Änderungen in einem commit verpacken und eine Commit message 
 
git remote add github   <... HTTP url of fork repository>  # Neuen remote hinzufügen

git push github    # Hier wird nach username und passwort gefragt. Username einfach “test” schreiben und bei password das Personal Access Token von hopen copy&pasten.




Fix Identity issue

git config --global user.email "you@example.com"
git config --global user.name "Your Name"


