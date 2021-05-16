
# Drogi Uczestniku,

Cieszę się, że wybrałeś właśnie mój warsztat :) 

W celu weryfikacji środowiska na którym będziemy pracować w takcie warsztatów poproszę Cię o upewnienie się, że spełniasz wymagania dotyczące narzędzi (*Wymagania*).

## Linki przydatne w trakcie warsztatów:

- Notatki:
https://docs.google.com/document/d/1RqUe1DkDPB2K4awu-X7C8339D3F7fzcSs3kid5S84Uc/edit?usp=sharing

## Wymagania

### Wiedza

Oczekuję od Ciebie:

- Znajomości podstaw języka Java oraz projektów typu Maven;

- Podstaw poruszania się w systemie Unix;

- Mile widziana znajomość podstaw GIT;

- Wskazana podstawowa znajomość biblioteki Selenium WebDriver.

Niestety z uwagi na ograniczony czas warsztatów nie będzie czasu na tłumaczenie tych zagadnień od zera.

### Narzędzia

Proszę o przyniesienie ze sobą komputera z systemem Linux albo w ostateczności Windows (rekomendowany system Windows 10). Proszę o instalację:

- Wybranego IDE - najlepiej IntelliJ IDEA https://www.jetbrains.com/idea/ 
  lub Eclipse: https://www.eclipse.org/downloads/
  W przypadku Eclipse'a prośba dodatkowo o instalację TestNG for Eclipse: 
  https://marketplace.eclipse.org/content/testng-eclipse

- Java JDK - minimum wersja 8
  http://www.oracle.com/technetwork/java/javase/downloads/

- GIT
  Windows: https://git-scm.com/download/win
  **UWAGA: W trakcie instalacji w oknie "Adjusting your PATH environment" zaznaczcie opcje: "Use Git and optional Unix tools from the Windows Command Prompt (ostatni radio button)"**
  
  Linux: https://git-scm.com/download/linux
  Mac: https://git-scm.com/download/mac

- Docker
  https://docs.docker.com/install/linux/docker-ce/ubuntu/
  https://docs.docker.com/docker-for-windows/install/
  https://docs.docker.com/docker-for-mac/install/

- Docker Compose - instalacja wymagana tylko dla komputerów z systemem Linux:
  https://docs.docker.com/compose/install/
  
- Selenoid Instalation Binary - https://github.com/aerokube/cm/releases
  Na maszynach z systemem Linux oraz Mac'ach dodaj dostep execution dla pobranej binarki:
  'chmod +x cm'

- Przeglądarki Chrome oraz FireFox w najnowszych wersjach.

- Jeśli nie posiadasz jeszcze konta na GitHub prośba o utworzenie:
  https://github.com/join?source=header-home. Po utworzeniu konta wejdź na https://forms.gle/4Ey66NezqVANbY419, podaj nazwę   
  użytkownika i wyślij formularz.

## Weryfikacja środowiska

### Java

- Wpisz w konsoli: `java -version`. Upewnij się, że została podana informacja o wersji zainstalowanej JAVY

- Wpisz w konsoli: `javac -version`. Upewnij się, że została podana informacja o wersji zainstalowanego kompilatora JAVA

### Git:

- Sklonuj repozytorium `git clone https://github.com/tklepacki/be-it.git`
- Wejdź do folderu z repozytorium i upewnij się, że projekt został pobrany
- Tylko dla systemów Windows - wejdź to terminal (CMD) i wpisz komendę:
`ls -al`  
Upewnij się, że zostały wylistowane pliki/foldery danej lokalizacji i komenda została rozpoznana.

### IDE

- Zaimportuj projekt Maven w swoim IDE.

### Docker

- Wpisz w konsoli: `docker -v`
- Upewnij się, iż została podana informacja o wersji zainstalowanego Dockera:
  *Docker version 20.10.5, build 55c4c88*
- Tylko dla systemów Linux - wpisz następujące komendy:  
`sudo groupadd docker`  
`sudo usermod -aG docker $USER`  
Uruchom ponownie swoją maszynę

### Docker Compose

- Wpisz w konsoli: `docker-compose -v`
- Upewnij się, iż została podana informacja o wersji zainstalowanego Dockera Compose

### Maven

- Wejdź do repozytorium.
- Uruchom polecenie `mvnw -v`. Upewnij się, że została podana informacja o wersji zainstalowanego Mavena

## W razie problemów
Pisz na mój adres email: *t.klepacki@wp.pl*
"# be-it" 
